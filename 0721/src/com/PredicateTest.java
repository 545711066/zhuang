package com;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArr = {"林青霞，30", "刘蛟，32", "徐点悦，33", "老万谢，22"};
        ArrayList<String> filter = filter(strArr, (s) ->
                        s.split("，")[0].length() > 2
                ,
                (s) -> Integer.parseInt(s.split("，")[1]) > 32);

        for (String s : filter){
            System.out.println(s);
        }
    }

    private static ArrayList<String> filter(String[] strArray, Predicate<String> p1, Predicate<String> p2) {

        ArrayList<String> arrayList = new ArrayList();
        for (String s : strArray) {
            if (p1.and(p2).test(s)) {
                arrayList.add(s);
            }
        }
        return arrayList;

    }

}
