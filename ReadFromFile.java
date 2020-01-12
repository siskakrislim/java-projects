import java.io.*;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("lab9Input.txt");
		DataInputStream dis = new DataInputStream(file);
		BufferedReader in = new BufferedReader(new InputStreamReader(file));
		String s = in.readLine();
		while(s != null) {
			System.out.println(s);
			s = in.readLine();
		}
		in.close();
		// TODO Auto-generated method stub

	}

}
