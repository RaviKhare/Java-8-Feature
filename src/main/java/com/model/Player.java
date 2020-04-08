/**
 * 
 */
package main.java.com.model;

/**
 * @author rk
 *
 */
public class Player {

	 private Long empId;
	 private String empName;
	 private String grade;
	 private Double salary;
	 private Boolean isPlaying;
	 
	 
	/**
	 * @param empId
	 * @param empName
	 * @param grade
	 * @param salary
	 * @param isPlaying
	 */
	public Player(Long empId, String empName, String grade, Double salary, Boolean isPlaying) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.grade = grade;
		this.salary = salary;
		this.isPlaying = isPlaying;
	}


	public Long getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public String getGrade() {
		return grade;
	}


	public Double getSalary() {
		return salary;
	}
	

	public Boolean getIsPlaying() {
		return isPlaying;
	}


	@Override
	public String toString() {
		return "Player [empId=" + empId + ", empName=" + empName + ", grade=" + grade + "]";
	}


	
	
	 
	
}
