package com.icexxx.iceroot.ext;

/**
 * sftp工具类
 * 
 * @author Icewater
 * @version 2.0
 */
public class IceFtpUtil {
    /**
     * 上传文件
     * 
     * @param username 远程用户名
     * @param password 远程密码
     * @param host 远程host
     * @param port 远程端口
     * @param localFileName 本地文件名称
     * @param remoteFile 远程文件名称
     * @return 是否上传成功
     */
    public static boolean upload(String username, String password, String host, int port, String localFileName,
            String remoteFile) {
        try {
            return IceFtpClient.upload(username, password, host, port, localFileName, remoteFile);
        } catch (NoClassDefFoundError e) {
            if ("com/jcraft/jsch/SftpException".equals(e.getMessage().trim())) {
                throw new RuntimeException(
                        "没有引入jsch-x.x.x.jar,你可以从下面的地址下载:http://central.maven.org/maven2/com/jcraft/jsch/0.1.54/jsch-0.1.54.jar");
            }
        }
        return false;
    }

    /**
     * 下载文件
     * 
     * @param username 远程用户名
     * @param password 远程密码
     * @param host 远程host
     * @param port 远程端口
     * @param localFileName 本地文件名称
     * @param remoteFile 远程文件名称
     * @return 是否下载成功
     */
    public static boolean download(String username, String password, String host, int port, String localFileName,
            String remoteFile) {
        try {
            return IceFtpClient.download(username, password, host, port, localFileName, remoteFile);
        } catch (NoClassDefFoundError e) {
            if ("com/jcraft/jsch/SftpException".equals(e.getMessage().trim())) {
                throw new RuntimeException(
                        "没有引入jsch-x.x.x.jar,你可以从下面的地址下载:http://central.maven.org/maven2/com/jcraft/jsch/0.1.54/jsch-0.1.54.jar");
            }
        }
        return false;
    }
}
