import java.util.*;
public class Summ {

	public static void main(String[] args) {
		int n , m , sum = 0;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter the number:");
        n = s.nextInt();
        while(n > 0)
        {
            m = n% 10;
            sum = sum + m;
            n = n / 10;
        }
        System.out.println(sum);

	}

}
