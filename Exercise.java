public class Exercise{
	public static void main(String[] args){
		int[] bin1 = {1, 0, 0, 1, 0, 1, 1, 0};
		int[] bin2 = {1, 1, 1, 1, 1, 0, 1, 1};
	
		int lengthBin1 = bin1.length;
		int lengthBin2 = bin2.length;

    int[] result;
		
		if(lengthBin1 >= lengthBin2){
			result = new int[lengthBin1 + 1];
		}else{
			result = new int[lengthBin2 + 1];
		}
		
		for(int i = result.length; i > 1; i--){
      for(int element : result){
        System.out.println(element);
      }
      System.out.println("-------------");

			int r = bin1[i-2] + bin2[i-2] + result[i-1];
			
			for(int j = i-1; j > 0; j--){
				if(r == 0){
					break;
				}else if(r % 2 == 1){
					result[j-1] = 1;
					break;
				}else{
					r = r / 2;
				}
			}
		}

		for(int element : result){
			System.out.println(element);
		}
	}
}
