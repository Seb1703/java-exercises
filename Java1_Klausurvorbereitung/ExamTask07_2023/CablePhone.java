package ExamTask07_2023;
public class CablePhone extends Phone{
	private boolean pluggedIn;
	private boolean poweredOn;

	public CablePhone(EnergySource energySource, boolean pluggedIn, boolean poweredOn){
        super(energySource);
		this.pluggedIn = pluggedIn;
		this.poweredOn = poweredOn;
	}

	public boolean readyForUse(){
		return (pluggedIn && poweredOn);
	}
}