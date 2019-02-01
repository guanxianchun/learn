package com.guanxc.hadoop.hdfs.mapreduce;

import com.guanxc.hadoop.hdfs.file.DFSSystemFile;
import com.guanxc.hadoop.hdfs.util.DFSFileSystemUtil;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @Description: 第一个MapReduce程序
 * @Author: guanxianchun
 * @Email: psyche19830113@163.com
 * @Date: 19-2-1 上午11:19
 */

public class WordCountMapReduce extends Configured implements Tool {

    private static Logger logger = LoggerFactory.getLogger(WordCountMapReduce.class);

    public static class WordCountMapper extends Mapper{

        private final static IntWritable one = new IntWritable(1);

        private Text mapOutputKey = new Text();

        public void map(IntWritable key, Text value, Context context) throws IOException, InterruptedException {
            String line = value.toString();
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()){
                String word = tokenizer.nextToken();
                mapOutputKey.set(word);
                context.write(mapOutputKey,one);
            }
        }
    }

    public static class WordCountReduce extends Reducer{

        public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
            //
            int sum=0;
            for (IntWritable value:values){
                sum+= value.get();
            }
            logger.info("=========================>"+key+": "+sum);
            context.write(key,new IntWritable(sum));
        }
    }

    /**
     * step3 : Driver component job
     * @param args
     * @return
     * @throws Exception
     */
    public int run(String[] args) throws Exception {
        //run before delete output dictory
        DFSSystemFile systemFile = new DFSSystemFile();
        boolean deleted = systemFile.deleteFile(args[1]);
        System.out.println(deleted);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //1.  得到配置
        Configuration configuration = systemFile.getConfiguration();
        //2. 创建任务Job
        Job job = Job.getInstance(configuration,this.getClass().getSimpleName());
        //3. 设置运行jar
        job.setJarByClass(this.getClass());
        //4. set job
        //input -> map ->reduce ->output
        //4.1 设置输入的文件路径
        Path inputPath = new Path(args[0]);
        FileInputFormat.addInputPath(job,inputPath);
        //4.2 设置Map处理类
        job.setMapperClass(WordCountMapper.class);
        //4.3 设置reduce处理类
        job.setReducerClass(WordCountReduce.class);
        //4.4 设置输出路径
        FileOutputFormat.setOutputPath(job,new Path(args[1]));
        return job.waitForCompletion(true)?0:1;

    }

    public static void main(String[] args) throws Exception{
        args= new String[]{"/user/guanxc/hadoop/input","/user/guanxc/hadoop/output"};
        WordCountMapReduce mapReduce = new WordCountMapReduce();
        mapReduce.run(args);
    }
}
