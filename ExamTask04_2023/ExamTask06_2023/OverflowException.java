package ExamTask04_2023.ExamTask06_2023;

public class OverflowException extends Exception {
	private final int higherThanCapacity;

	public OverflowException(int higherThanCapacity){
		this.higherThanCapacity = higherThanCapacity;
	}

	public int getHigherThanCapacity(){
		return higherThanCapacity;
	}
}
