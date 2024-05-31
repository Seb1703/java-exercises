package ExamTask03_2023;


public class Present{
	private final String description;
	private final double price;
	private final Person sender;
	private final Person recipient;

	public Present(String description, double price, Person sender, Person recipient){
		this.description = description;
		this.price = price;
		this.sender = sender;
		this.recipient = recipient;
	}

	public String getDescription(){
		return description;
	}

	public double getPrice(){
		return price;	
	}

	public Person getSender(){
		return sender;
	}

	public Person getRecipient(){
		return recipient;
	}

	public String toString(){
		return "Present [description=["+ description +"], price=[" + price + "], sender=["+ sender.getName() + "], recipient=[" + recipient.getName() + "]]";
	}
}