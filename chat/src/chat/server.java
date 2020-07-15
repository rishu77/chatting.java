package chat;
import java.io.*;
import java .net .*;
import java .util.Scanner;
public class server {
public static void main(String[]args) {
	try {
		ServerSocket ss=new ServerSocket(7777);
		Socket s=ss.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("start the chat");
		String msgin="",msgout="";
		while(!msgin.equals("end")) {
		msgin=dis.readUTF();
		System.out.println(msgin);
		msgout=br.readLine();
		dout.writeUTF(msgout);
		dout.close();
		}
		s.close();
	}catch(Exception e) {
		//handle exception here
	}
}
}
