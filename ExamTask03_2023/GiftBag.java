package ExamTask03_2023;

import java.util.ArrayList;

public class GiftBag{
	private final ArrayList<Present> presents;

	public GiftBag(){
		this(new ArrayList<Present>());
	}

	public GiftBag(ArrayList<Present> presents){
		this.presents = presents;
	}

	public void addPresent(Present present){
		presents.add(present);
	}

	public Present getMostExpensivePresent(){
		Present mostExpensivePresent = presents.get(0);
		double mostExpensivePrice = 0;
		for(Present present: presents){
			if(present.getPrice() > mostExpensivePrice){
				mostExpensivePresent = present;
				mostExpensivePrice = present.getPrice();
			}
		}
		return mostExpensivePresent;
	}
}
