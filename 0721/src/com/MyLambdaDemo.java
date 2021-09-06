package com;

import java.beans.Customizer;
import java.util.function.Consumer;

public class MyLambdaDemo {

    public static void main(String[] args) {

        String[] strArray = {"林青霞，30","张曼玉，35","王祖贤，32"};
        for(String s: strArray){
            String[] split = s.split("，");
            String name = split[0];
            String age = split[1];
            doSomthing(name,age,(n)-> System.out.print("姓名:"+name),(a)-> System.out.println("年龄:"+age));
        }
    }

    private static void doSomthing(String name, String age, Consumer<String> con1,Consumer<String> con2){
        con1.accept(name);
        con2.accept(age);
    }

}
