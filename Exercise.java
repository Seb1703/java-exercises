public class Exercise{
	public static void main(String[] args){
		int[][] multiDimArray = {
    { 5, 8, 2, 7 },
    { 9, 6, 10, 8 },
    { 10, 2, 7, 5 },
    { 1, 9, 5, 4 } };
		
		for(int[] element : multiDimArray){
			int max = 0;
			int min = 100;

			for(int i : element){
				if(i > max){
					max = i;
				}
				if(i < min){
					min = i;
				}
			}
			System.out.println("MAX: " + max + " MIN: " + min);
		}
	}
}