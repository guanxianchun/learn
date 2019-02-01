package com.guanxc.hadoop.hdfs.file;

import com.guanxc.hadoop.hdfs.util.DFSFileSystemUtil;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description: HDFS文件系统操作类
 * @Author: guanxianchun
 * @Email: psyche19830113@163.com
 * @Date: 19-1-31 下午12:24
 */
public class DFSSystemFile {

    private FileSystem fileSystem;

    public DFSSystemFile()throws Exception{
        fileSystem = DFSFileSystemUtil.getFileSystem();
    }

    public Configuration getConfiguration(){
        return fileSystem.getConf();
    }
    /**
     * 读取HDFS上的文件内容
     * @param fileName
     */
    public void readFile(String fileName, OutputStream outputStream)throws Exception{
        //包装成HDF文件系统的路径
        Path path = new Path(fileName);

        FSDataInputStream in = null;
        try {
            //打开一个文件
            in = fileSystem.open(path);
            //将文件从输入流拷贝到输出流中
            IOUtils.copyBytes(in,outputStream,4096,false);
        }catch (Exception e){
            throw e;
        }finally {
            IOUtils.closeStream(in);
        }

    }

    public void uploadFile(String uploadFileName,String destFileName)throws Exception{
        //包装成HDF文件系统的路径
        Path path = new Path(destFileName);

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            //获取本地文件的输入流
            inputStream = new FileInputStream(new File(uploadFileName));
            //获取HDFS文件的输出流
            outputStream = fileSystem.create(path);
            IOUtils.copyBytes(inputStream,outputStream,4096);
        }catch (Exception e){
            throw e;
        }finally {
            IOUtils.closeStream(inputStream);
            IOUtils.closeStream(outputStream);
        }

    }

    public boolean deleteFile(String fileName) throws Exception{
        //包装成HDF文件系统的路径
        Path path = new Path(fileName);
        //判断文件是否存在，存在则删除
//        if (fileSystem.exists(path)){
//            fileSystem.delete(path,true);
//        }
        //删除文件
        boolean deleted = fileSystem.deleteOnExit(path);
        return deleted;
    }

    public boolean mkdirs(String dictory)throws Exception{
        //包装成HDF文件系统的路径
        Path path = new Path(dictory);
        return fileSystem.mkdirs(path);

    }

    public void listFile(String dictory)throws Exception{
        //包装成HDF文件系统的路径
        Path path = new Path(dictory);
        FileStatus[] status = fileSystem.listStatus(path);
        Path[] paths = FileUtil.stat2Paths(status);
        for (Path p:paths){
            System.out.println(p);
        }
    }
}
