/*
INPUT
6
Prakhar Abc Abd Pra Hi 123

OUTPUT
123 Abc Abd Hi Pra Prakhar 
*/

package com.java.examples;
import java.util.*;

class StringList implements Comparable<StringList> {
    String str;
    StringList(String str) {
        this.str=str;
    }
    
    @Override
    public int compareTo(StringList o) {
        return this.str.compareTo(o.str);
    } 
}

class A {
    public static void sortList(StringList[] list) {
        Arrays.sort(list);      
    }
    
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
    
        StringList s;
        StringList list[]=new StringList[n];
        for(int i=0;i<n;i++) {
            list[i]=new StringList(sc.next());
        }
        
       sortList(list);
        for(int i=0;i<list.length;i++) {
            System.out.print(list[i].str+" ");
        }
    }
}