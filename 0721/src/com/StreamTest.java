package com;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();

        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰2");

        ArrayList<String> woManList = new ArrayList<>();
        woManList.add("林心如");
        woManList.add("张曼玉");
        woManList.add("林青霞");
        woManList.add("柳岩");
        woManList.add("林志玲");
        woManList.add("王祖贤");

        manList.stream().filter(s->s.length()==3).limit(3).forEach(System.out::println);
        Stream<String> manFilterStream = manList.stream().filter(s -> s.length() == 3).limit(3);
        woManList.stream().filter(s->s.startsWith("林")).skip(1).forEach(System.out::println);
        Stream<String> woManFilterStream = woManList.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream<String> concat = Stream.concat(manFilterStream, woManFilterStream);

        concat.forEach(Actor::new);
    }

}
