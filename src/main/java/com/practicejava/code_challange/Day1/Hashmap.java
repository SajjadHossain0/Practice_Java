package com.practicejava.code_challange.Day1;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("abc", 1);
        hashMap.put("def", 2);
        hashMap.put("ghi", 3);
        hashMap.put("jkl", 4);
        hashMap.put("mno", 5);
        hashMap.put("pqr", 6);
        hashMap.put("tuv", 7);
        hashMap.put("wxyz", 8);
        System.out.println(hashMap);

        for(String i : hashMap.keySet()){
            System.out.println(i+" : "+hashMap.get(i));
        }
        for(int i : hashMap.values()){
            System.out.println(i);
        }

        hashMap.remove("tuv");
        System.out.println(hashMap);

        System.out.println(hashMap.get("abc"));

    }

}
