import java.util.Scanner;
import java.util.Random;
public class EXE2_4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random r =new Random();
		int a,b,c;
		int correct=0,counter=0;
		System.out.println("線上測驗開始...");
		while(counter<5){
		a=r.nextInt(9)+1;
		b=r.nextInt(9)+1;
		System.out.printf("%d X %d = ? ",a,b);
		c = input.nextInt();
		if (c==a*b){ correct ++;}
		counter++;
		}
		if(correct>=4){System.out.println("數學資優生");}
		else{System.out.println("你好爛");}
	}
}
