package ExamTask03_2023;

public class ExamTask03{
	public static void main(String[] Args){
		Person sender = new Person("Sebastian", 19, 'm');
		Person recipient = new Person("Max", 6, 'm');

		GiftBag giftBag = new GiftBag();
		giftBag.addPresent(new Present("Ferngesteuertes Auto", 86.99, sender, recipient));
		giftBag.addPresent(new Present("Lego Technik Porsche", 230.00, sender, recipient));

		System.out.println(giftBag.getMostExpensivePresent().toString());
	}
}