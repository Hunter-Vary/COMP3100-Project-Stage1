import java.io.*;
import java.net.*;

import java.util.concurrent.TimeUnit;

public class dsClient {

	public static void main(String[] args) {
			try{
				Socket s = new Socket("localhost", 50000);
				BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				DataOutputStream out = new DataOutputStream(s.getOutputStream());
				
				out.write(("Helo" + "\n").getBytes());
				
				String str=in.readLine();
				
				String username = System.getProperty("user.name");
				out.write(("AUTH " + username + "\n").getBytes());
				
				str=in.readLine();
				
				out.write(("REDY\n".getBytes());
				
				str=in.readLine():
				
				sendMSG("OK");
				for (int i = 0; i < serverNumber; i++) {
					str = receiveResp();
					if (LRRflag) {
						string[] serverInfo = str.split(" ");
						if (Integer.parseInt(serverInfo[4]) > serverCore) {
							typeNumber = 1;
							serverType = serverInfo[0];
							serverID = Integer.parseInt(serverInfo[1]);
							serverCore = Integer.parseInt(serverInfo[4]);
						}
						else {
							if {serverType.equals(serverInfo[0])){
								typeNumber++;
							}
						}
					}
					else {
						;
					}
					LRRflag = false;
					sendMSG("OK");
				
				
				out.write(("quit\n").getBytes());
				
				str=in.readLine();
				
				
				in.close();
				out.close();
				s.close();
				
		} catch(IOException e){e.printStackTrace(); System.exit(1); }
	}
}
		
