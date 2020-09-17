package day2;

import java.util.Scanner;

public class RoomMain {
	Scanner scanner = new Scanner(System.in);
	int roomNo;
	String roomType,ACmachine;
	float roomArea;
	public void setData() {
		System.out.println("Enter RoomNumber : ");
		roomNo=scanner.nextInt();
		System.out.println("Room Area : ");
		roomArea=scanner.nextFloat();
		System.out.println("Room Type : ");
		roomType=scanner.next();
		System.out.println("AC machine : ");
		ACmachine=scanner.next();
	}
	public void displayData()
	{
		System.out.println("Room Number : "+roomNo+"\nRoom Area : "+roomArea+"\nRoom Type : "+roomType+"\nACmachine : "+ACmachine);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomMain room=new RoomMain();
		room.setData();
		room.displayData();
		
				
	}

}
