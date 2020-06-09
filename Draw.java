package Draw;

import java.util.Scanner;


abstract public class Draw {
	Scanner x1 = new Scanner(System.in);
	Scanner y1 = new Scanner(System.in);
	Scanner x2 = new Scanner(System.in);
	Scanner y2 = new Scanner(System.in);
	
	
	abstract public void getpoint();
	abstract public void getline();
	abstract public void getrec();
	abstract public void getsq();
	abstract public void getcircle();

}