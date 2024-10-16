package loginsystem;
import java.util.Scanner;
public class loginsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String correctusername="Anitah";
		String correctpassword="Anitah002";
		
		Scanner input=new Scanner(System.in);
        
		int trials=1;
			while(trials<=2) {
				System.out.println("trial" + trials + "enter credentials");trials++;
				String username=input.nextLine();
				String password=input.nextLine();
				if(username.equals(correctusername)&&password.equals(correctpassword)) {
					System.out.println("Login successful");
					break;
					
				}else { System.out.println("Login Failed");
			}
			
		}
	}
}


