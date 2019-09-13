package createJsonUsingPOJO;

public class Address {

	
	public String flatNo;
	public String streetNo;
	public String city;
	public String state;
	public String country;
    public int	pinCode;
    
    public Address(String flatNo,String streetNo,String city,String state,String country,int pinCode)
    {
    	this.flatNo=flatNo;
    	this.streetNo=streetNo;
    	this.city=city;
    	this.state=state;
    	this.country=country;
    	this.pinCode=pinCode;
    	
    }

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
    
    
    
    
}
