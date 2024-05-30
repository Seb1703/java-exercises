package StramAPI;

import java.util.List;

import StramAPI.Heroes;
import StramAPI.Heroes.Hero;
import StramAPI.Heroes.Hero.Sex;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Optional;

public class Exercise112 {
    public static void main(String[] args){
        String[] names = { "Anne", "Captain CiaoCiao", "Balico", "Charles", "Anne", "CiaoCiao", "CiaoCiao", "Drake", "Anne", "Balico", "CiaoCiao" };
        System.out.println(Arrays.stream(names)
            .map(name -> name.toLowerCase().equals("captain ciaociao") ? "ciaociao" : name)
            .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting() )));
    }
}
