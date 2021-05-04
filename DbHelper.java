package com.proje.db;

public class DbHelper {
	
	private String usr , pass  ;

	
	
	
	public void validate() {
		
		if(this.usr==null || this.pass ==null) {
			
			System.out.println("Incorrect or incomplete data entry");
			throw new NullPointerException(" ---> Identity Information is incorrect <---");
		}
		else {

			System.out.println("Verification successful ...");
			
		}
		
	}
	
	
	public void openConnections() {
		
		System.out.println("Connection Established");
		
	}
	
	
public void closeConnections() {
		
		System.out.println("Connection Closed");
		
	}
	
	
	
	public DbHelper() {
		
	}
	
	public DbHelper(String usr, String pass) {
		super();
		this.usr = usr;
		this.pass = pass;
	}
	

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
