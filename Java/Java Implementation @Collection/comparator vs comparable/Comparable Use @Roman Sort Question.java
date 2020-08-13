/*
    We have n strings and each string contain 2 words (1 word is simple string and 2nd word is roman).
    We need to sort the string on the basis of 1st string (if 1st string is equal then use Roman numbers
    to sort it)

    INPUT
    4
    Prakhar XIV  
    Abhineet X
    Prakhar IX
    Rahul X

    OUTPUT
    Abhineet X
    Prakhar IX
    Prakhar XIV 
    Rahul X
*/

package com.java.examples;
import java.util.*;

class SortByRomanUtil implements Comparable<SortByRomanUtil> {
	String str;
	
	SortByRomanUtil(String str) {
		this.str=str;
	}
	
	@Override
    public int compareTo(SortByRomanUtil obj) {
    	String[] str1 = this.str.split("\\s+");
    	String[] str2 = obj.str.split("\\s+"); 
    	
    	if(!str1[0].equals(str2[0])) {
    		return this.str.compareTo(obj.str);
    	}
    	
    	int x=convertDec(str1[1]); int y=convertDec(str2[1]);
    	return x-y;
    } 
    
    int value(char r) { 
        if (r == 'I') 
            return 1; 
       
        if (r == 'V') 
            return 5; 
      
        if (r == 'X') 
            return 10; 
      
        if (r == 'L') 
            return 50; 
      
        if (r == 'C') 
            return 100; 
      
        if (r == 'D') 
            return 500; 
      
        if (r == 'M') 
            return 1000; 
      
        return -1; 
    } 
    
    int convertDec(String str) {
    	int res=0; 
    	int n=str.length();
        for (int i=0;i<n;i++) { 
            int s1=value(str.charAt(i)); 
            if(i+1<str.length()) { 
            	int s2 = value(str.charAt(i+1)); 
                if (s1 >= s2) 
                    res = res + s1; 
                else {
                    res = res + s2 - s1; 
                    i++; 
                } 
            } 
            else 
                res = res + s1;  
        } 
        return res; 
    }
}

class A {
	public static void sortRoman(SortByRomanUtil arr[]) {
		Arrays.sort(arr);	
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		SortByRomanUtil arr[] = new SortByRomanUtil[n];
		for(int i=0;i<n;i++) 
			arr[i]=new SortByRomanUtil(sc.nextLine());
	
		sortRoman(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i].str+" ");
		}
	}
}
