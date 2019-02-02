package com.guanxc.hadoop.hdfs.file;

import com.guanxc.hadoop.hdfs.mapreduce.WordCountMapReduce;
import org.junit.Test;

public class WordCountMapReduceTest {

    @Test
    public void run()throws Exception{
        String[] args= new String[]{"/user/guanxc/hadoop/input","/user/guanxc/hadoop/output"};
        WordCountMapReduce mapReduce = new WordCountMapReduce();
        mapReduce.run(args);
    }
}
