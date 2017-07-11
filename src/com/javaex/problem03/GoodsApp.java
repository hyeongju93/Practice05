package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	int sum=0;
    	List<Goods> list=new ArrayList<Goods>();
    	System.out.println("상품 3개를 입력해주세요");
    	Scanner sc=new Scanner(System.in);
    	
    	for(int i=0;i<3;i++) {
    		String[] arr=sc.nextLine().split(" ");
    		Goods goods=new Goods();
    		goods.setName(arr[0]);
    		goods.setPrice(Integer.parseInt(arr[1]));
    		goods.setCount(Integer.parseInt(arr[2]));
    		list.add(goods);
    	}
    	
    	for(int i=0;i<3;i++) {
    		list.get(i).show();
    		sum+=list.get(i).getCount();
    	}
    	System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
    	sc.close();

       
    }

}
