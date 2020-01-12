
public class StaffApp {

	public static void main(String[] args) {
		StoreAssistant daniel = new StoreAssistant("Daniel1234", 12);
		StoreSupervisor george = new StoreSupervisor("George9876", 3, 14);// TODO Auto-generated method stub
		daniel.viewDetails();
		System.out.println();
		george.viewDetails();
	}

}
