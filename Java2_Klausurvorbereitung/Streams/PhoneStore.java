package Java2_Klausurvorbereitung.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PhoneStore {
    public ArrayList<Phone> phones;

    public PhoneStore(ArrayList<Phone> phones){
        this.phones = phones;
    }

    public List<Phone> q1(){
        return phones.stream()
            .filter(phone -> phone.brand() == Brand.HUAWEI && phone.cameras() > 3)
            .sorted((phone1, phone2) -> Integer.compare(phone2.cpuPower(),phone1.cpuPower()))
            .limit(3)
            .sorted((phone1, phone2) -> Double.compare(phone2.price(),phone1.price()))
            .toList();
    }

    public OptionalDouble q2(){
        return phones.stream()
            .filter(phone -> phone.batterySize() > 2500)
            .mapToInt(phone -> phone.cameras())
            .average();
    }

    public List<Phone> q3(double maxPrice){
        return phones.stream()
            .filter(p -> p.price() < maxPrice && p.connectionType().isModern() && p.cpuPower() < 2400)
            .sorted((p1, p2) -> Double.compare(p1.price(), p2.price()))
            .toList();
    }

    public Map<String, Phone> q4() {
        return phones.stream()
            .collect(Collectors.toMap(
                p -> p.brand().name() + p.connectionType().name() + p.cpuPower(),
                p -> p));
    }

    public Map<ConnectionType, List<Phone>> q5(){
        return phones.stream()
            .collect(Collectors.groupingBy(p-> p.connectionType()));
    }
}
