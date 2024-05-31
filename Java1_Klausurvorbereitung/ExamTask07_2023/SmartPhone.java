package ExamTask07_2023;

public class SmartPhone extends Phone {
	private static int minimum_power = 200;
	private int power;

	public SmartPhone(EnergySource energySource, int power){
        super(energySource);
		this.power = power;
	}

	public boolean readyForUse(){
		return (power >= minimum_power);
	}
}