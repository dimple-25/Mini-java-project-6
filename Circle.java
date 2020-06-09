package Draw;
import java.util.Scanner;

public class Circle extends Square{
	public void getcircle()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter coordinates ");
		int xc1 = x1.nextInt();
		int yc1 = y1.nextInt();
		System.out.println("enter radius");
		int l=x2.nextInt();
		System.out.println("enter colour ");
		String c=s.nextLine();
		System.out.println("circle drawn at coordinate ("+xc1+"x , "+yc1+"y)."+" having radius "+l);
		System.out.println("colour: "+c);
	}
}