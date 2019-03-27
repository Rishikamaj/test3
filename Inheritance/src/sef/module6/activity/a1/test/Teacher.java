package sef.module6.activity.a1.test;

public class Teacher extends Person {
	private String course;
	private double basic;
	private double hra;
	private double deductions;
	
	
	public Teacher(String name, int age, char gender, String course, double basic, double hra, double deductions) {
		super(name, age, gender);
		this.course = course;
		this.basic = basic;
		this.hra = hra;
		this.deductions = deductions;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public Teacher(){

}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basic);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		temp = Double.doubleToLongBits(deductions);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (Double.doubleToLongBits(basic) != Double.doubleToLongBits(other.basic))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (Double.doubleToLongBits(deductions) != Double.doubleToLongBits(other.deductions))
			return false;
		if (Double.doubleToLongBits(hra) != Double.doubleToLongBits(other.hra))
			return false;
		return true;
	}
}