package 실습;

import java.io.File;

public class FileClassExample {
	public static void dir(File fd) {
		String[] filenames = fd.list();
		
		for(String s : filenames) {
			File f = new File(fd,s);
			long t = f.lastModified();
			System.out.println(s);
		}
	}
}
