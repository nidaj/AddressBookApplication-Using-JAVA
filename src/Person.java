
class Person {
	 private String fname;
	 private String lname;
	 private String mobileNo;
	 private String emailId;
	 private String state;
	 private String country;
	 private int zipCode;
	 
	
	Person(String fname, String lname, String mobileNo, String emailId, String state, String country, int zipCode) {
		this.fname = fname;
		this.lname = lname;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-30s%-15s%-15s%-10d", fname,lname,mobileNo,emailId,state,country,zipCode);
	}
	

//	@Override
//	public String toString() {
//		return  fname+" \t "+lname+" \t "+mobileNo+" \t "+emailId+" \t "+state+" \t "+country+" \t "+zipCode+"\n";
//	}
	
	

}
