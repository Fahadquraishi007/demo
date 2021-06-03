package com.te.projects;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to FahadKaRestaurant.com");
		System.out.println();

		//Creating Menu
		while(true){
			System.out.println("To order South Indian Dish, Enter 1");
			System.out.println("To order North Indian Dish, Enter 2");
			System.out.println("To order Rajasthani Dish, Enter 3");
			System.out.println("To order Gujrati Dish, Enter 4");
			System.out.println("To order Bengali Dish, Enter 5");
			System.out.println("To order Desserts, Enter 6");
			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Welcome to South Indian Food Court");
			southIndianFood();
			break;
			case 2: System.out.println("Welcome to North Indian Food Court");
			northIndianFood();
			break;
			case 3: System.out.println("Welcome to Rajasthani Food Court");
			rajasthaniFood();
			break;
			case 4: System.out.println("Welcome to Gujrati Food Court");
			gujratiFood();
			break;
			case 5: System.out.println("Welcome to Bengali Food Court");
			bengaliFood();
			break;			
			case 6: System.out.println("Welcome to Desserts Food Court");
			desserts();
			break;
			case 9: System.out.println("Thanks for ordering from our App. Visit again");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}

	}

	public static void southIndianFood(){
		System.out.println("You get:");
		System.out.println("Idli : 2 Pieces: 80Rs");
		System.out.println("Butter Cheese Dosa : 1 Pieces: 50Rs");
		System.out.println("Vada : 2 Pieces: 60Rs");

	}

	public static void northIndianFood(){
		System.out.println("You get:");
		System.out.println("Chole Bhature : 2 Pieces: 110Rs");
		System.out.println("Litti Chokha : 4 Pieces: 150Rs");
	}

	public static void rajasthaniFood(){
		System.out.println("You get:");
		System.out.println("Dal Baati Churma: 110 Rs");
		System.out.println("Laal maas: 200 Rs");
		System.out.println("Methi Bajra puri: 100 Rs");

	}

	public static void gujratiFood(){
		System.out.println("You get:");
		System.out.println("Dhokla : 2 pieces: 80Rs");
		System.out.println("Khandvi: 60Rs");
		System.out.println("Methi ka Thepla: 120Rs");
	}

	public static void bengaliFood(){
		System.out.println("You get:");
		System.out.println("Maach Bhaat: 200Rs");
		System.out.println("Aalu Luchi: 100Rs");
	}

	public static void desserts(){
		System.out.println("You get:");
		System.out.println("Rasmalai: 150Rs");
		System.out.println("Rasgulla : 2 Pieces: 50Rs");
		System.out.println("Emarti : 2 Pieces: 30Rs");
		System.out.println("Gajar ka halwa: 70Rs");

	}

}