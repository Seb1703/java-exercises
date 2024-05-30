package ExamTask07_2023;

import java.util.ArrayList;

public class ExamTask07 {
	public static void main(String[] args){
		CablePhone cablePhone1 = new CablePhone(EnergySource.BATTERY, true, true);
		CablePhone cablePhone2 = new CablePhone(EnergySource.POWER_PLUG, true, true);

		SmartPhone smartPhone1 = new SmartPhone(EnergySource.BATTERY, 0);
		SmartPhone smartPhone2 = new SmartPhone(EnergySource.BATTERY, 100);

		ArrayList<Phone> phones = new ArrayList<>();

        phones.add(cablePhone1);
        phones.add(cablePhone2);
        phones.add(smartPhone1);
        phones.add(smartPhone2);

		for(Phone phone : phones){
			System.out.println(phone.readyForUse());
		}
	}
}