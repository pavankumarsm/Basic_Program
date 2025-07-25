package string;
import java.util.*;
public class RemoveDupli {
	
	 static void removeDuplicate(char str[], int length)   
	    {   
	        //Creating index variable to use it as index in the modified string   
	        int index = 0;   
	    
	        // Traversing character array  
	        for (int i = 0; i < length; i++)   
	        {   
	              
	            // Check whether str[i] is present before or not   
	             int j;
	            for (j = 0; j < i; j++)    
	            {   
	                if (str[i] == str[j])   
	                {   
	                    break;   
	                }   
	            }   
	    
	            // If the character is not present before, add it to resulting string   
	            if (j == i)    
	            {   
	                str[index++] = str[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
	    }   
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//taking strings
		String info = scan.nextLine();
		
        //Converting string to character array  
        char str[] = info.toCharArray(); 
        
        //Calculating length of the character array  
        int len = str.length; 
        
        //Calling removeDuplicates() method to remove duplicate characters  
        removeDuplicate(str, len);   
	}

}
