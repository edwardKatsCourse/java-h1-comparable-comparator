package com.company.examples;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorExample {

    public static void main(String[] args) {

        //Comparable
        //Comparator

        Method method;

//        List<Method> methods = new ArrayList<>();
//        Collections.sort(methods);

        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("z");
        list.add("r");
//        new List();
        Collections.sort(list, new StringComparator());

        System.out.println(list);

        Comparator comparator = new StringComparator();
        StringComparator stringComparator = new StringComparator();
//        comparator.compare();

    }

    public static void run(Comparator c) {

    }
}

class StringComparator implements Comparator<String> {
    //1
//    0
//    -1
    @Override
    public int compare(String o1, String o2) {
        return compare(0, 0.1, "hello");
    }

    public int compare(int o1, double o2, String dd){
        return 0;
    }
}