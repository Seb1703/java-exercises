package Java2_Klausurvorbereitung.Streams;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Phone> getPhones(){
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone(Brand.SAMSUNG, ConnectionType.TYPC, 3, 3000, 90, 999.99));
        phones.add(new Phone(Brand.APPLE, ConnectionType.TYPC, 2, 4000, 100, 1499.99));
        phones.add(new Phone(Brand.HUAWEI, ConnectionType.TYPC, 4, 4000, 100, 1499.99));
        phones.add(new Phone(Brand.HUAWEI, ConnectionType.MICRO, 4, 4000, 90, 499.99));
        phones.add(new Phone(Brand.HUAWEI, ConnectionType.TYPC, 4, 4000, 99, 599.99));
        phones.add(new Phone(Brand.HUAWEI, ConnectionType.TYPC, 4, 4000, 98, 699.99));
        return phones;
    }
}
