package com.training.ooc;
class FbProfile
{
	private int age;
	private String maritalStatus;
	private String phoneNumber;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		FbProfile profile=new FbProfile();
		//profile.age=34;
		profile.setAge(35);
		profile.setMaritalStatus("Married");
		profile.setPhoneNumber("12345");
		System.out.println("Profile");
		System.out.println("Phone :"+profile.getPhoneNumber());
		System.out.println("Age :"+profile.getAge());
		System.out.println("Status :"+profile.getMaritalStatus());

	}

}
