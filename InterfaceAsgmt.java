package Javafsd;
 
interface Testable{
	public boolean testcompatability();
	}
class Mobile {
	 private String name;
	 private String brand;
	 protected String operatingSystemName;
	 protected String operatingSystemVersion;
	 
	 public Mobile(String name, String brand,  String operatingSystemName, String operatingSystemVersion) {
		super();
		this.name = name;
		this.brand = brand;
		this.operatingSystemName = operatingSystemName;
		this.operatingSystemVersion = operatingSystemVersion;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystemName() {
		return operatingSystemName;
	}

	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	} 
	 
}

class SmartPhone extends  Mobile implements Testable {
	String networkgeneration;
	public SmartPhone(String name,String brand, String operatingsystemname, String operatingsystemversion,String networkgeneration) {
		super(name,brand,operatingsystemname,operatingsystemversion);
		this. networkgeneration=networkgeneration;
	}
	public String getNetworkgeneration() {
		return networkgeneration;
	}
	public void setNetworkgeneration(String networkgeneration) {
		this.networkgeneration = networkgeneration;
	}
	public boolean testcompatability(){
		if(operatingSystemName.equalsIgnoreCase("saturn")){
			if(networkgeneration.equalsIgnoreCase("3G")) {
				if(operatingSystemVersion.equals("1.1")||operatingSystemVersion.equals("1.2")||operatingSystemVersion.equals("1.3")) {
					return true;
				}else 
					return false;
				
			}else if(networkgeneration.equalsIgnoreCase("4G")) {
				if(operatingSystemVersion.equals("1.2")||operatingSystemVersion.equals("1.3")) {
					return true;
				}else 
					return false;
				
			}else if(networkgeneration.equalsIgnoreCase("5G")) {
				if(operatingSystemVersion.equals("1.3")) {
					return true;
				}else
					return false;
				
			}
			else
				return false;
		}
		else if(operatingSystemName.equalsIgnoreCase("Gara")) {
			if(networkgeneration.equalsIgnoreCase("3G")) {
				if(operatingSystemVersion.equalsIgnoreCase("EXRT.1")||operatingSystemVersion.equalsIgnoreCase("EXRT.2")||operatingSystemVersion.equalsIgnoreCase("EXRU.1")) {
					return true;
				}else 
					return false;
			}else if (networkgeneration.equalsIgnoreCase("4G")) {
				if(operatingSystemVersion.equalsIgnoreCase("EXRT.2")||operatingSystemVersion.equalsIgnoreCase("EXRU.1")) {
					return true;
				}else 
					return false;
				
			}else if (networkgeneration.equalsIgnoreCase("5G")) {
				if(operatingSystemVersion.equalsIgnoreCase("EXRU.1")) {
					return true;
				}else
					return false;
				
			}else
				return false;
			
		}else 
			return false;
		
	}
}

class InterfaceAsgmt {
	public static void main(String args[]){
	SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
	if(smartPhone.testcompatability())
	 System.out.println("The mobile OS is compatible with the network generation!");
	else
	 System.out.println("The mobile OS is not compatible with the network generation!");
	//Create more objects for testing your code
	}
}