public class Exercise {
  public static void main(String[] args) {
    int[] one = { 1, 2, 3, 4 };
    int[] two = { 5, 6, 7, 8 };
		
		int[] neu = Exercise.merge(one, two);
		for(int number : neu){
			System.out.println(number);
		}
  }
  public static int[] merge(int[] first, int[] second) {
    int laenge = first.length + second.length;
		int[] neueListe = new int[laenge];
		int i = 0;
		for(int number : first){
			neueListe[i] = number;
			i++;
		}
		for(int number : second){
			neueListe[i] = number;
			i++;
		}
		return neueListe;
  }
}