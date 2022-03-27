
import java.lang.Math;
import java.util.Scanner;
public class labr1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        double x = 0; // вхідний параметр
        double y = 0; // результат обчислення виразу
        double A = 0; // проміжний результат - функціонально стала частина виразу
        double B = 0; // проміжний результат - функціонально змінна частина виразу
        System.out.print("x = ");
		x = scan.nextDouble();
        A = 2 * Math.abs(x - 5);
        // спосіб 1: розгалуження в скороченій формі
        if (x < -1)
			B = ((Math.sin(x) * Math.sin(x)) / (1 + Math.abs(Math.cos(x))));
		if (-1 <= x && x <= 1)
			B = Math.cos(1 / Math.abs(x + 2)) * Math.cos(1 / Math.abs(x + 2));
		if (x > 1)
			B = Math.log(Math.abs(x + 2));

        y = A - B;
        System.out.println("");
        System.out.println("1) y = " + String.format("%.2f", y));
        
        
        ///////////
        ///
        double x1 = 0; // вхідний аргумент
        double a = 0; // вхідний параметр
        double b = 0; // вхідний параметр
        double c = 0; // вхідний параметр
        double F = 0; // результат обчислення виразу
        System.out.print("a = ");
        a = scan.nextDouble();
        System.out.print("b = ");
        b = scan.nextDouble();
        System.out.print("c = ");
        c = scan.nextDouble();
        System.out.print("x1 = ");
        x1 = scan.nextDouble();
        // спосіб 1: розгалуження в скороченій формі
        if ((x1 - 1) < 0 && (b - x1) != 0)
			F = a * x1 * x1 + b;

		if (x1 - 1 > 0 && b + x1 == 0)
			F = (x1 - a) / x1;

		if (!(x1 - 1 < 0 && (b - x1) != 0) && !(x1 - 1 > 0 && b + x1 == 0))
			F = x1 / c;

        System.out.println("");
        System.out.println("2) F = " + String.format("%.2f", F));	
        
        
        //////////
        ///
        int N, k;
        double P;
        System.out.print("N = ");
        N = scan.nextInt();
        P = 1;
        k = N;
        while (k <= 25)
        {
        	P *= Math.sqrt(1 + (N / k));
            k++;
        }
        System.out.println("" + String.format("%.2f",P ));
        P = 1;
		k = N;
		do
		{
			P *= Math.sqrt(1 + (N / k));
		k++;

		} while (k <= 25) ;
        System.out.println("" + String.format("%.2f", P));
        P = 1;
        for (k = N; k <= 25; k++)
        			{
        				P *= Math.sqrt(1 + (N / k));
        			}

        System.out.println("" + String.format("%.2f", P));
        P = 1;
		for (k = 25; k >= N; k--)
		{
			P *= Math.sqrt(1 + (N / k));
		}

        System.out.println("3) " + String.format("%.2f", P));
        
        /////////////
        ////
        double F4, x4, xp, xk, dx, a4, b4, c4;
        System.out.print (" xp = ");
        xp = scan.nextDouble();
        System.out.print (" xk = ");
        xk = scan.nextDouble();
        System.out.print (" dx = ");
        dx = scan.nextDouble();
        System.out.print (" a4 = ");
        a4 = scan.nextDouble();
        System.out.print (" b4 = ");
        b4 = scan.nextDouble();
        System.out.print (" c4 = ");
        c4 = scan.nextDouble();
        x4 = xp;
   
        System.out.println("--------------------");
        System.out.println("    x4     |    F4   ");
        System.out.println("--------------------");
        while (x4 <= xk)
		{
			if (x4 - 1 < 0 && (b4 - x4) != 0)
				F4 = a4 * x4 * x4 + b4;
			else
				if (x4 - 1 > 0 && b4 + x4 == 0)
				F4 = -a4 / (x4 - c4);
			else
				F4 = x4 / c4;
			System.out.println("    "+x4+"   |    "+F4+"    ");
			x4 += dx;
		}
        System.out.println("-------------------");
        }

}
