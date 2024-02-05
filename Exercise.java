public class Exercise{
	public static void main(String[] args){
		int number = 14;
    boolean check = true;
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				System.out.println("Deine Zahl ist keine Primzahl!");
        check = false;
				break;
			}
		}
    if(check){
      System.out.println("Deine Zahl ist Primzahl!");
    }
	}
}