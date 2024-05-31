package ExamTask07_2023;

public abstract class Phone {
	protected final EnergySource energySource;

	public Phone(EnergySource energySource){
        this.energySource = energySource;
    }

	public abstract boolean readyForUse();
}