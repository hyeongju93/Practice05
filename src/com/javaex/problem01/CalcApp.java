package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String info=new String();
    	while(true) {
    		info=sc.nextLine();
    		if(info.equals("/q"))
    			break;
    		String[] arr = info.split(" ");
    		if(arr[1].equals("+")) {
    			System.out.println(Add.getAdd(arr[0],arr[2]));
    		}else if(arr[1].equals("-")) {
    			System.out.println(Sub.getSub(arr[0],arr[2]));
    		}else if(arr[1].equals("*")) {
    			System.out.println(Mul.getMul(arr[0],arr[2]));
    		}else if(arr[1].equals("/")) {
    			System.out.println(Div.getDiv(arr[0],arr[2]));
    		}else {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    	}
    	System.out.println("종료합니다.");
    	
    	
    	
    	sc.close();

    }
}
