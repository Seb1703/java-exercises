package ExamTask04_2023.ExamTask06_2023;

public class ExamTask06 {
	public static void main(String[] args) {
		Barrel barrel = new Barrel(100);

		try {
			barrel.addFluid(101);
		} catch (OverflowException e) {
			System.out.println("Deine maximale Kapazität wird um " + e.getHigherThanCapacity() + " überschritten");
		}
	}
}