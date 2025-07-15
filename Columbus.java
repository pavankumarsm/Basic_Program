import java.util.Scanner;
public class Columbus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++){
			arr[i] = scan.next();
		}
		int count;
		
		for(int i=0;i<n;i++){
		count = 0;
			for(int j=0;j<arr[i].length();j++){
				char c = arr[i].charAt(j);
				
				if((c >= '0' && c <= '9') || ( c == 'e') || ( c=='.') || (c == '+') ||(c == '-'))
				{
					if(arr[i].indexOf(c) != arr[i].length()-1)
					{
					    if((c >= '0' && c <= '9') || ( c == 'e') || ( c=='.') || (c == '+'  && arr[i+1] !="+" ) || (c == '-'  && arr[i+1] !="-" ))
					    {
					      count++;
					    }
					}
					else
					{
						count++;
					}
					
				}
			}
			
			if(count == arr[i].length()){
				System.out.println("Sugar");
			}else{
				System.out.println("Jaggery");
			}
		}

	}

}
