package Java2_Klausurvorbereitung.Streams;

import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Phone> phones = Data.getPhones();
        PhoneStore phoneStore = new PhoneStore(phones);
        System.out.println(phoneStore.q1());
        System.out.println(phoneStore.q2());
        System.out.println(phoneStore.q3(600.0));
        System.out.println(phoneStore.q4());
        System.out.println(phoneStore.q5());
    }
}
