
public class Staff {
	private String staffID;
	private int totalWorkHours;
	
	public Staff(String id, int totalWorkHours) {
		staffID = id;
		this.totalWorkHours = totalWorkHours;
	}
	public void setStaffID(String id) {
		staffID = id;
	}
	
	public String getStaffID() {
		return staffID;
	}
	
	public void setTotalWorkHours(int hr) {
		totalWorkHours = hr;
	}
	
	public int getTotalWorkHours() {
		return totalWorkHours;
	}
	
	public double computeSalary() {
		return totalWorkHours*15;
	}
}
