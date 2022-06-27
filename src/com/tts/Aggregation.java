package com.tts;

class Address {
	String streetNum;
	String city, state;
	public Address(String string, String city, String state){
		this.streetNum = string;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", city=" + city + ", state=" + state + "]";
	}
	
}

class Business {
	String name;
	Address mailingAddr;
	
	public Business(String name, Address addr) {
		this.name = name;
		this.mailingAddr = addr;
	}
}

class Programmer {
	String name;
	//Creating HAS-A relationship with Address class
	Address programmerAddr; 
	Business business;
	public Programmer(String name, Address addr, Business business){
		this.name=name;
		this.programmerAddr = addr;
	}
}

public class Aggregation {

	public static void main(String[] args) {
		
		Address myAddress = new Address("1515 Mockingbird Ln", "Summerville", "GA");
		Business myCompany = new Business("Tech Talent South", myAddress);
		
		Programmer jonathan = new Programmer("Jonathan", myAddress, myCompany);
		
		System.out.println(jonathan.programmerAddr.toString());
	}
}


//const programmer = {
//		name: "Jonathan",
//		programmerAddr: {
//			streetNum: "1515 Mockingbird Ln",
//			city: "Summerville",
//			state: "GA"
//		}
//}