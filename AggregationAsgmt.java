package Javafsd;

class Author {
    public String name;
    String emailId;
    char gender;
    
    Author(String name, String emailId, char gender)
    {
   	 this.name=name;
   	 this.emailId=emailId;
   	 this.gender=gender;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}

class Book {
    String name;
    Author author;
    double price;
    int quantity;
	
   
   Book(String name, Author author, double price, int quantity)
   {
  	 this.name=name;
  	 this.author=author;
  	 this.price=price;
  	 this.quantity=quantity;
   }
   void dispalyAuthorDetails()
   {
  	 System.out.println("name = "+name);
  	 System.out.println("author = "+author);
  	 System.out.println("price = "+price);
  	 System.out.println("quantity = "+quantity);
   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}


public class AggregationAsgmt {
     public static void main(String[] args) {
		
		Author author1 = new Author("Joshua","joshua@email.com",'M');
		
		System.out.println("Displaying author details");
		System.out.println("Author name :" +author1.getName());
		System.out.println("Author email : "+author1.getEmailId());
		System.out.println("Author gender : "+author1.getGender());
	}

}

