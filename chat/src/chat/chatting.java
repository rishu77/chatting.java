package chat;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class chatting {
	public static void main(String[]args) {
		try {
			Socket s=new Socket("127.0.0.3",7777);
			DataInputStream dis =new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String msgin="",msgout="";
			while(!msgin.equals("end"))
			{
				msgout=br.readLine();
				dout.writeUTF(msgout);
				msgin=dis.readUTF();
				System.out.println(msgin);
			}
		}catch(Exception e) {
			//handle exception here
		}
	}
}