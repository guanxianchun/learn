package com.guanxc.hadoop.hdfs.file;

import org.junit.Test;

/**
 * @Description:
 * @Author: guanxianchun
 * @Email: psyche19830113@163.com
 * @Date: 19-1-31 下午12:52
 */
public class HDFSFileSystemTest {

    @Test
    public void testReadFile()throws Exception{
        DFSSystemFile systemFile = new DFSSystemFile();
        System.out.println("================输出HDFS文件系统上的文件内容===========");
        systemFile.readFile("/user/guanxc/hadoop/input/word.txt",System.out);
    }

    @Test
    public void testUploadFIle()throws Exception{
        String uploadFileName = "/opt/git/learn/hadoop-hdfs/src/main/resources/core-site.xml";
        String distFileName = "/user/guanxc/hadoop/upload/upload.core-site.xml";
        DFSSystemFile systemFile = new DFSSystemFile();
        systemFile.uploadFile(uploadFileName,distFileName);
        System.out.println("------------------输出上传到HDFS文件系统上的文件内容------------------");
        systemFile.readFile(distFileName,System.out);
    }

    @Test
    public void testDeleteFile() throws Exception{
        String distFileName = "/user/guanxc/hadoop/upload/upload.core-site.xml";
        DFSSystemFile systemFile = new DFSSystemFile();
        System.out.println("===================删除HDFS上的文件==========================");
        boolean deleted = systemFile.deleteFile(distFileName);
        System.out.println("文件： "+distFileName+" 删除"+(deleted?"成功":"失败"));
    }
}
