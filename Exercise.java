public class Exercise{
	public static void main(String[] args){
		int[] myArray = {1, 2, 3, 4, 5};
		
		int[] switchedArray = new int[myArray.length];

		for(int i = 0; i < myArray.length; i++){
			switchedArray[i] = myArray[myArray.length - 1 - i];
		}

    for(int element : switchedArray){
      System.out.println(element);
    }
	}
}
