package ExamTask06_2023;

public class Barrel {
	private int capacity;
	private int fluidLevel;
	
	public Barrel(int capacity){
		this(capacity, 0);
	}

	public Barrel(int capacity, int fluidLevel) {
		this.capacity = capacity;
		this.fluidLevel = fluidLevel;
	}

	public void addFluid(int value) throws OverflowException {
		if (fluidLevel + value > capacity) {
            int oldFluidLevel = fluidLevel;
            fluidLevel = capacity;
			throw new OverflowException(oldFluidLevel + value - capacity);
		}else{
			fluidLevel += value;
		}
	}
}