/*
INPUT
6
Prakhar Abc Abd Pra Hi 123

OUTPUT
123 Abc Abd Hi Pra Prakhar 
*/

package com.java.examples;
import java.util.*;

class A {
    public static List<String> sortList(List<String> list) {
        Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                    return s1.compareTo(s2);
            }
        });
        return list;        
    }
    
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    
        String s;
        List<String> list=new ArrayList<String>();
        for(int i=0;i<n;i++) {
            s=sc.next();
            list.add(s);
        }
        
        List<String> l=sortList(list);
        for(int i=0;i<list.size();i++) {
            System.out.print(l.get(i)+" ");
        }
    }
}