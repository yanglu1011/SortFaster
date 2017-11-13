package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 * 
 * @comment TestFileWriter
 * 
 */

/* Yang: didn't completely test if working */
public class TestFileWriter {
	/* Yang: tell it what to write to file */
	public void test(Object o) {
		FileWriter fw = null;
		try {
			/* Yang: make sure to change file name when not appending */
			fw = new FileWriter(new File("stepTime.txt"), true);
			fw.write("" + o + "\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
