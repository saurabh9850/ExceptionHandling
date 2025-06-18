package ExceptionHand;

import java.util.Iterator;

public class Exception2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		
			try {
				for(int i=0;i<=a.length+3;i++)
				{
					System.out.println(i+" "+a[i]);
				}
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e.getMessage());
				System.out.println("Error Occure");
				
			}
			System.out.println("our next code impliment");
			
		
		}
		
  
	}
	
	


