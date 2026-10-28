package com.lj;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList();
        List.add(99);
        List.add(88);
        List.add(77);
        List.add(66);
        List.add(55);
        List.add(44);
        List.add(100);
        for(int i=List.size()-1;i>0;i--){
           if(List.get(i)<=80){
               List.remove(i);
           }
        }
        System.out.println(List);
    }

}
