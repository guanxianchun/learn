package com.guanxc.hadoop.hdfs.file;

import com.guanxc.hadoop.hdfs.mapreduce.WordCountMapReduce;
import org.junit.Test;

public class WordCountMapReduceTest {

    @Test
    public void run()throws Exception{
        String[] args= new String[]{"/user/guanxc/hadoop/input","/user/guanxc/hadoop/output"};
        WordCountMapReduce mapReduce = new WordCountMapReduce();
        mapReduce.run(args);

        readWordCountMapReduceOut(args[1]);

        new DFSSystemFile().deleteFile(args[1]);
    }

    private void readWordCountMapReduceOut(String outDictory){
        try{
            DFSSystemFile systemFile = new DFSSystemFile();
            System.out.println("=================start print map reduce word count result ==========================");
            systemFile.readFile(outDictory+"/part-r-00000",System.out);
            System.out.println("=================end print map reduce word count result ==========================");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
