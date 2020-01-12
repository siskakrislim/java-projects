import java.io.*;

public class ReadFromInternalBuf {

	public static void main(String[] args) throws Exception {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("lab9Input.txt"));// TODO Auto-generated method stub
		int s = in.read();
		while(s != -1) {
			System.out.print((char)s);
			s = in.read();
		}
		in.close();
	}

}
