public class Exercise{
	public static void main(String[] args){
		int[] zweierpotenzen = new int[16];
		for(int i = 0; i < 16; i++){
			zweierpotenzen[i] = (int) Math.pow(2, i);
		}
		for(int element : zweierpotenzen){
			System.out.println(element);
		}
	}
}
