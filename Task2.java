
public class Task2 {

	public static void main(String[] args) {
		String [] country = new String[50];
		country[0] = "GERMANY";
		country[1] = "RUSSIA";
		country[2] = "JAPAN";
		country[3] = "KOREA";
		country[4] = "UNITEDSTATESOFAMERICA";
		country[5] = "AUSTRIA";
		for(String i : country) {
			if(i.equals("AUSTRIA")) {
				break;
			}
			/*if(i != null && i.length() > 5) {
				System.out.println(i);
			}*/
			System.out.println(i);// TODO Auto-generated method stub
		}

	}

}
