/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a= sc.nextLine();
		int vo=0;
		int con=0;
		for(int i=0; i<a.length(); i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
			{
				vo+=1;
			}
			else {
				con+=1;
			}
			System.out.println(vo);
			System.out.println(con);
		}
	}
}	