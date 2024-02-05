public class Exercise{
	public static void main(String[] args){
		String myString = "ABCA".toUpperCase();
		int länge = myString.length();
		char[] character = new char[länge];
		int[] count = new int[länge];

		for(int i = 0; i < länge; i++){
			boolean found = false;
			char test = myString.charAt(i);
			for(int j = 0; j < i; j++){
				if(test==character[j]){
					count[j] +=1;
					found = true;
					break;
				}
			}
			if(!found){
        System.out.println(test);
				count[i] = 1;
        character[i] = test;
			}
		}
	
	for(int k = 0; k < länge; k++){
		if(count[k]!=0){
      double rel = (double) count[k]/ (double)länge * 100;
			System.out.println(character[k] + ": " + count[k] +" Mal, " +  rel + "%");
		}
	}
	}
}