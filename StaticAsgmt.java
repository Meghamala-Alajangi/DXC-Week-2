package Javafsd;

class DanceClub {
     public static int counter;
     String registrationId;
     String name;
     long contactNumber;
     String city;
     
     static {
    	 counter=10000;
     }
     DanceClub(String name, long contactNumber, String city)
     {
    	 this.name=name;
    	 this.contactNumber=contactNumber;
    	 this.city=city;
    	 this.registrationId="D"+ ++counter;
     }
     public String getregistrationId() {
 		
 		return registrationId;
 	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DanceClub.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

public class StaticAsgmt {
	public static void main(String[] args) {
		
		DanceClub participant1 = new DanceClub("Franklin", 7656784323L, "Texas");
		DanceClub participant2 = new DanceClub("Merina", 7890423112L, "New York");
		//Create more objects and add them to the participants array for testing your code
		DanceClub[] participants = { participant1, participant2 };
		for (DanceClub participant : participants) {
		System.out.println("Hi"+participant.getName()+"!Your registration id is "+participant.getregistrationId());
		}
		}
}
