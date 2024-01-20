package com.melik.JavaExercise.designpattern.behavioral.command.v2.util;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.FileSystemReceiver;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.UnixFileSystemReceiver;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is :" + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
