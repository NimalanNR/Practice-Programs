import java.util.*;


class PrintOdd{

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = s.length();
		int i=0,j=0;
		if(n%2==0){
			System.out.println("Cannot print the sequence!!!");
		}else{
			j=n-1;
			for(i=0,j=n-1; i<=n && j>=0;i++,j--){

				if(i<j){
					for(int x=0;x<i;x++)
					System.out.print(" ");
					
					System.out.print(s.charAt(i));

					for(int x=i;x<n-i-1;x++)
					System.out.print(" ");

					System.out.println(s.charAt(j));

				}else if(i==j){

					for(int x=0;x<i;x++)
					System.out.print(" ");
				
					System.out.println(s.charAt(i));

				}else{

					for(int x=j-1;x>=0;x--)
					System.out.print(" ");
					
					System.out.print(s.charAt(j));

					for(int x=0;x<i-j-1;x++)
					System.out.print(" ");

					System.out.println(s.charAt(i));




				}
				

			}

		}

	}

}
