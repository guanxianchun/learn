package com.guanxc.hadoop.hdfs.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

/**
 * @Description:
 * @Author: guanxianchun
 * @Email: psyche19830113@163.com
 * @Date: 19-1-31 上午8:48
 */
public class DFSFileSystemUtil {

    private static FileSystem fileSystem =null;

    public static FileSystem getFileSystem() throws Exception{
        if (null == fileSystem){
            synchronized(DFSFileSystemUtil.class){
                Configuration configuration = new Configuration();
                fileSystem = FileSystem.get(configuration);
            }
        }
        return  fileSystem;
    }
}
