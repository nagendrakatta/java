import java.io.*;
class JavaAndJavaW{

public static void main(String args[]) throws Exception{

System.out.println("Java : Console(command prompt ) output ");

PrintWriter pw=new PrintWriter("testFile.txt");

pw.println("JavaW : Output in file");
pw.flush();


}



}