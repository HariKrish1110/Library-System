package Flower;
import java.util.*;
public class Admin {

	public static void main(String[] args) {
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
			System.out.println("Add  Librarians");
			ArrayList al2=new ArrayList<>();
			System.out.print("Librarian Id");
			int lid=scan.nextInt();
			al2.add(lid);
			System.out.print("Enter Librarian Name");
			String bname=scan.next();
			al2.add(bname);
			System.out.print("Contact Number");
			int mob=scan.nextInt();
			al2.add(mob);
			System.out.println("Librarians Details");
			
				System.out.println(al2);
			
			System.out.println("Update Librarians Details");
			System.out.println("Enter Column Id");
			int id=scan.nextInt();
			System.out.println("Enter Column Name");
			String cname=scan.next();
			al2.set(id, cname);
			System.out.println("After Updating Librarians Details");
			
				System.out.println(al2);
			
			System.out.println("Delete Librarians Details");
			System.out.println("Enter Librarians Name");
			String dname=scan.next();
			al2.remove(dname);
			System.out.println("After Deletion Librarians Details");
			al2.clear();
				System.out.println(al2);
			
			System.out.println("If You Logout Type:out");
			String str3=scan.next();
			String str4="out";
			if(str3.equals(str4)){
				System.out.println("LogOut Successfully");
			}
			
		}
		else{
			System.out.println("Your UserName or PassWord InCorrect");
		}
	}

}
