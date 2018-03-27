package com.icexxx.iceroot.ext;

import java.util.Properties;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

/**
 * sftp工具类
 * 
 * @author IceWater
 * @version 2.0
 */
public class IceFtpClient {
    public static boolean upload(String username, String password, String host, int port, String localFileName,
            String remoteFile) {
        localFileName = localFileName.replace("\\", "/");
        JSch jsch = new JSch();
        Session session = null;
        ChannelSftp openChannel = null;
        try {
            session = jsch.getSession(username, host, port);
            if (password != null) {
                session.setPassword(password);
            }
            Properties pro = new Properties();
            pro.put("StrictHostKeyChecking", "no");
            session.setConfig(pro);
            session.connect(30000);
            openChannel = (ChannelSftp) session.openChannel("sftp");
            openChannel.connect();
            if (remoteFile.endsWith("/")) {
                remoteFile += localFileName.substring(localFileName.lastIndexOf("/") + 1);
            }
            openChannel.put(localFileName, remoteFile);
            return true;
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        } finally {
            if (openChannel != null) {
                openChannel.disconnect();
            }
            if (session != null) {
                session.disconnect();
            }
        }
        return false;
    }

    public static boolean download(String username, String password, String host, int port, String localFileName,
            String remoteFile) {
        localFileName = localFileName.replace("\\", "/");
        JSch jsch = new JSch();
        Session session = null;
        ChannelSftp openChannel = null;
        try {
            session = jsch.getSession(username, host, port);
            if (password != null) {
                session.setPassword(password);
            }
            Properties pro = new Properties();
            pro.put("StrictHostKeyChecking", "no");
            session.setConfig(pro);
            session.connect(30000);
            openChannel = (ChannelSftp) session.openChannel("sftp");
            openChannel.connect();
            if (localFileName.endsWith("/")) {
                localFileName += remoteFile.substring(remoteFile.lastIndexOf("/") + 1);
            }
            openChannel.get(remoteFile, localFileName);
            return true;
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        } finally {
            if (openChannel != null) {
                openChannel.disconnect();
            }
            if (session != null) {
                session.disconnect();
            }
        }
        return false;
    }
}
