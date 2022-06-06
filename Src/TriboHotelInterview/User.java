package TriboHotelInterview;

import java.util.List;

public class User {
	
	private int userId;
	
	private String name;

	private String emailId;
	
	private int phoneNumber;

	private List<Expense> expense;
	
	private Double netExpense;
	
	//builder pattern
	
	User(int userId, String name, int phoneNumber, List<Expense>  expense){
		
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.expense = expense;
		
	}
	
	User(int userId, String name, String emailId, List<Expense>  expense){
		
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.expense = expense;
		
	}

	User(int userId, String name, List<Expense>  expense){
		this.userId = userId;
		this.name = name;
		this.expense = expense;
	}
	
	
	User(int userId, String name, String emailId, int phoneNumber, List<Expense> expense){
		
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.expense = expense;
		
	}
	public List<Expense> getExpense() {
		return expense;
	}

	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
