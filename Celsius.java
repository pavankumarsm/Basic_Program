import java.util.Scanner;
public class Celsius {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float c;
		System.out.println("ENTER TEMPERATURE IN DEGREE CELSIUS");
        c=scan.nextFloat();
        float a;
        a=(9.0f/5)*c+32;
        System.out.println(a);
	}
}
