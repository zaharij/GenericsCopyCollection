package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(new Integer(22));
        list.add(new Integer(23));
        list.add(new Integer(24));
        list.add(new Integer(25));

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("qwe");
        list2.add("qwe2");
        list2.add("qwe3");
        list2.add("qwe4");

        ArrayList arrayList = copyArray(list2);
        System.out.println(arrayList);
    }

    public static <T> ArrayList<T> copyArray(ArrayList <T> arrayList){
        ArrayList<T> arrayListCopy = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++){
            arrayListCopy.add(arrayList.get(i));
        }
        return arrayListCopy;
    }
}