public class OwnExercise{
	public static void main(String[] args){
		String myString = "Hallo Welt!";

		char[] myArray = new char[myString.length()];
		
		for(int i = 0; i < myString.length(); i++){
			char currentChar = myString.charAt(i);
			myArray[i] = currentChar;
		}
		
		OwnExercise.printArray(myArray);
	}

	public static void printArray(char[] liste){
		for(char element : liste){
			System.out.println(element);
		}
	}
}
