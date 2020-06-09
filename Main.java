package Draw;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle p= new Circle(); 
 		while(true)
 			{
				System.out.println("\n1.point\n2.line\n3.rectangle\n4.square\n5.circle\n");
 				Scanner s=new Scanner(System.in);
 				System.out.println("Enter choice");
 				int choice = s.nextInt(); 

 				switch(choice)
 				{
 				case 1: p.getpoint();
 				break;
 				case 2: p.getline();
 				break;
 				case 3: p.getrec();
 				break;
 				case 4:p.getsq();
 				break;
 				case 5:p.getcircle();
 				break;
 				default:System.out.println("Invalid choice");
 				break;
 				}
 			}	
	}

}