package Flower;
import java.util.*;
public class LibaryAndUser {
	
	
private static	void BasicFuctionality(List al2){
	Scanner scan=new Scanner(System.in);
		System.out.println("LIBARAY MANAGEMENT SYSTEM");
		System.out.println("==========================" );
		ArrayList<String> al =new ArrayList<String>();
		al.add("admin");
		al.add("pass");
		System.out.println("Enter UserName");
		String str=scan.nextLine();
		System.out.println("Enter PassWord");
		String str1=scan.nextLine();
		
		if(al.contains(str)&&al.contains(str1)){
			System.out.println("Login SuccessFully");
			System.out.println("Add  Books");
			
			System.out.print("Book Id");
			int lid=scan.nextInt();
			al2.add(lid);
			System.out.print("Enter Book Name");
			String bname=scan.next();
			al2.add(bname);
			System.out.print("Book Type");
			String btype=scan.next();
			al2.add(btype);
			System.out.println("Book Details");
			
			
				System.out.println(al2);
			
			System.out.println("Update Book Details");
			System.out.println("Enter Column Id");
			int id=scan.nextInt();
			System.out.println("Enter Column Name");
			String cname=scan.next();
			al2.set(id, cname);
			System.out.println("After Updating Book Details");
			System.out.println(al2);
		
	}}
	private static void GetBook(List al2){
		Scanner scan=new Scanner(System.in);
		System.out.println("User Login");
		ArrayList<String> al =new ArrayList<String>();
		al.add("user");
		al.add("pass");
		System.out.println("Enter UserName");
		String str=scan.nextLine();
		System.out.println("Enter PassWord");
		String str1=scan.nextLine();
		System.out.println("Enter Student ID");
		int id=scan.nextInt();
		al2.set(0, id);
		al2.set(1, str);
		if(al.contains(str)&&al.contains(str1)){
			System.out.println("Login SuccessFully");
			System.out.println("Available Book Details");
			System.out.println(al2);
			System.out.println("Enter the book id you want");
			int bid=scan.nextInt(); 
			if(al2.contains(bid))
			{
			
				al2.add(java.time.LocalDate.now());
				al2.add(java.time.LocalDate.now().plusDays(10));
				System.out.println("uid,uname,Btype,IssueDate,ReturnDate");
				System.out.println(al2);
				
			}
			else{
				System.out.print("That book id not avaiable");
			}
	}}
	private static void IssuedDetails(List al2){
		Scanner scan=new Scanner(System.in);
		System.out.println("IF you see issued details and return details type:yes");
		String str=scan.next();
		String strr="yes";
		if(str.equals(strr)){
			System.out.println("Today Issued BookDetails");
			if(al2.contains(java.time.LocalDate.now())){
		System.out.println("Sid,Sname,Btype,IssueDate,ReturnDate");
		
		System.out.println(al2);}
		else{
			System.out.println("Book Not Issued");
		}}
		
	}
	private static void ReturnedDetails(List al2){
		System.out.println("Today Returned BookDetails");
		if(al2.get(4).equals(java.time.LocalDate.now())){
		System.out.println("Sid,Sname,IssueDate,ReturnDate");
		ArrayList al4=new ArrayList<>();
		al4.addAll(al2);
		System.out.println(al4);
	}
		else{
			System.out.println("No Book Returned Today");}
		}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		List al2=Collections.synchronizedList(new ArrayList<>());
		BasicFuctionality(al2);
		GetBook(al2);
		IssuedDetails(al2);
		ReturnedDetails(al2);
	}
	

	}

	
	
		


	

	
	


