package app;
import java.io.*;

public class Main{
	public static void main(String[] args){
		new Thread(){
			public void run(){
				while(true){
					try {
						char r=(char)System.in.read();
						switch (r) {
							case 'g':
								System.gc();
								break;
						}
					} catch (IOException e) {
						
					}
				}
			}
		}.start();
		com.android.dx.command.Main.main(args);
		System.exit(0);
	}
}
