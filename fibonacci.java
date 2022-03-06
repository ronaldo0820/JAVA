package com.ronaldo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=0,b=1,c,count=1;
        System.out.println(a+ " "+b);
        for(int i=2;i<count;++i);
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(" "+c);
        }
    }
}
