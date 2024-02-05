public class Exercise{
	public static void main(String[] args){
    String string1 = "Halllo";
		String string2 = "Halklo";

		string1 = string1.toUpperCase();
		string2 = string2.toUpperCase();
		int length1 = string1.length();
		int length2 = string2.length();
		
		boolean check = true;
		if(length1 != length2){
			System.out.println("Die Zeichenketten sind nicht identisch!");
      check = false;
		}else{
			for(int i = 0; i < length1; i++){
				char char1 = string1.charAt(i);
				char char2 = string2.charAt(i);
				if(char1 != char2){
					System.out.println("Die Zeichenketten sind nicht identisch!");
          check = false;
					break;
				}
			} 
			if(check){
				System.out.println("Die Zeichenketten sind identisch!");
			}
		}
	}
}
