package com.human.dto;

public class TreeEx {

	public static void main(String[] args) {

		Tree mango = new Tree();
		mango.name = "Mango";
		mango.price = 200;
		mango.growTime = 4;
		mango.difficulty = 4;
		mango.amount = 7;
		mango.maxAmount = 50;
		mango.owner.name = "홍길동";
		mango.owner.age = 32;
		mango.owner.PhoneNum = "010-2345-1658";

		System.out.println("나무이름 : " + mango.name);
		System.out.println("가격 : " + mango.price + "원");
		System.out.println("키운 시간 : " + mango.growTime + "h");
		System.out.println("난이도 : " + mango.difficulty);
		System.out.println("그루 수 : " + mango.amount);
		System.out.println("최대 그루 수 : " + mango.maxAmount);
		System.out.println("주인 이름 : " + mango.owner.name);
		System.out.println("주인 나이 : " + mango.owner.age + "세");
		System.out.println("주인 번호 : " + mango.owner.PhoneNum);
		System.out.println();
		

		
		Tree papaya = new Tree();
		papaya.name = "Papaya";
		papaya.price = 375;
		papaya.growTime = 6;
		papaya.difficulty = 6;
		papaya.amount = 6;
		papaya.maxAmount = 50;

		System.out.println("나무이름 : " + papaya.name);
		System.out.println("가격 : " + papaya.price + "원");
		System.out.println("키운 시간 : " + papaya.growTime + "h");
		System.out.println("난이도 : " + papaya.difficulty);
		System.out.println("그루 수 : " + papaya.amount);
		System.out.println("최대 그루 수 : " + papaya.maxAmount);
		System.out.println("주인 이름 : " + papaya.owner.name);
		System.out.println("주인 나이 : " + papaya.owner.age + "세");
		System.out.println("주인 번호 : " + papaya.owner.PhoneNum);
		System.out.println();


		Tree bananaPalm = new Tree();
		bananaPalm.name = "Banana Palm";
		bananaPalm.price = 500;
		bananaPalm.growTime = 5;
		bananaPalm.difficulty = 5;
		bananaPalm.amount = 7;
		bananaPalm.maxAmount = 50;

		System.out.println("나무이름 : " + bananaPalm.name);
		System.out.println("가격 : " + bananaPalm.price + "원");
		System.out.println("키운 시간 : " + bananaPalm.growTime + "h");
		System.out.println("난이도 : " + bananaPalm.difficulty);
		System.out.println("그루 수 : " + bananaPalm.amount);
		System.out.println("최대 그루 수 : " + bananaPalm.maxAmount);
		System.out.println("주인 이름 : " + bananaPalm.owner.name);
		System.out.println("주인 나이 : " + bananaPalm.owner.age + "세");
		System.out.println("주인 번호 : " + bananaPalm.owner.PhoneNum);
		System.out.println();

		
		Tree lemon = new Tree();
		lemon.name = "Lemon";
		lemon.price = 750;
		lemon.growTime = 8;
		lemon.difficulty = 8;
		lemon.amount = 1;
		lemon.maxAmount = 50;

		System.out.println("나무 이름 : " + lemon.name);
		System.out.println("가격 : " + lemon.price + "원");
		System.out.println("키운 시간 : " + lemon.growTime + "h");
		System.out.println("난이도 : " + lemon.difficulty);
		System.out.println("그루 수 : " + lemon.amount);
		System.out.println("최대 그루 수 : " + lemon.maxAmount);
		System.out.println("주인 이름 : " + lemon.owner.name);
		System.out.println("주인 나이 : " + lemon.owner.age + "세");
		System.out.println("주인 번호 : " + lemon.owner.PhoneNum);
		System.out.println();


	}
}
