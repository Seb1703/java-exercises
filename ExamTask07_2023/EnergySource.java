package ExamTask07_2023;

public enum EnergySource {
	BATTERY('B'),
	POWER_PLUG('P');
	
	private char type;

	private EnergySource(char type){
		this.type = type;
	}

	public char getType(){
		return this.type;
	}

	public boolean canBeUsedEverywhere(){
		if (this.getType() == 'B'){
			return true;
		}else{
			return false;
		}
	}
}