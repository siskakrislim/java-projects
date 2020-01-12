
public class StoreSupervisor extends Staff{
	public int totalAdminHours;
	
	public StoreSupervisor(String id, int totalWorkHours, int totalAdminHours) {
		super(id, totalWorkHours);
		this.totalAdminHours = totalAdminHours;
		
	}
	
	public double computeSalary() {
		return (getTotalWorkHours()*15) + (totalAdminHours*20);
	}
	
	public void viewDetails() {
		System.out.println("*** Store Supervisor ***");
		System.out.println("StaffID: "+getStaffID());
		System.out.println("Total Work Hours: "+getTotalWorkHours());
		System.out.println("Total Admin Hours: "+totalAdminHours);
		System.out.println("Salary: $"+computeSalary());
	}
}
