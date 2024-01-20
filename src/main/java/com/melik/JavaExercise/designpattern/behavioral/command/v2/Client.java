package com.melik.JavaExercise.designpattern.behavioral.command.v2;


import com.melik.JavaExercise.designpattern.behavioral.command.v2.commands.CloseFileCommand;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.commands.OpenFileCommand;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.commands.WriteFileCommand;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.invoker.FileInvoker;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.receiver.FileSystemReceiver;
import com.melik.JavaExercise.designpattern.behavioral.command.v2.util.FileSystemReceiverUtil;

/*
* Client'ın normalde  direkt receiver(alıcı) ile iletişim kurması beklenir ama Command pattern'ında durum böyle değildir.
* Command design pattern'ı genelde şu 4 şey üzerine bina edilir. client, invoker(çağırıcı), command classları ve receiver(alıcı).
* Client  invokerın triggerlaması ve command'lerin aracılığı ile receiver'le bağ kurar.
*
* */
public class Client {
    public static void main(String[] args) {

        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand=new CloseFileCommand(fileSystemReceiver);
        fileInvoker=new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }
}
