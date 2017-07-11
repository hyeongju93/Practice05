package com.javaex.problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	System.out.println("친구를 3명 등록해주세요");
    	List<Friend> list = new ArrayList<Friend>();
    	Scanner sc = new Scanner(System.in);
    	
    	
    	for(int i=0;i<3;i++) {
    		String[] info=sc.nextLine().split(" ");
    		Friend fr=new Friend();
    		fr.setName(info[0]);
    		fr.setHp(info[1]);
    		fr.setSchool(info[2]);
    		list.add(fr);
    	}
    	
    	for(int i=0;i<3;i++) {
    		list.get(i).showInfo();
    	}
    	sc.close();

    		
    	
    }

}
