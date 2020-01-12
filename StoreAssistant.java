
public class StoreAssistant extends Staff{
	
	public StoreAssistant(String id, int totalWorkHours) {
		super(id, totalWorkHours);
	}
	
	public void viewDetails() {
		System.out.println("*** Store Assistant ***");
		System.out.println("StaffID: "+getStaffID());
		System.out.println("Total Work Hours: "+getTotalWorkHours());
		System.out.println("Salary: $"+computeSalary());
		
	}
}
