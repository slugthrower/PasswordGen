import java.util.Scanner;

public class PasswordGen 
{
	public static void main(String[] args)
	{
		System.out.println("Please select the number of bits in the password.");
		Scanner bits = new Scanner(System.in);
		int intBits = bits.nextInt();
		System.out.println("Please select the number of passwords to generate.");
		Scanner passGen = new Scanner(System.in);
		int intPassNumber = passGen.nextInt();
		for (int z = 1; z < (intPassNumber +1); z++)
		{
		System.out.print(z + "  ");
			for (int i = 1; i <(intBits +1) ; i++)
		{
			char genChar  = (char)('\u0021' + Math.random() * ('\u007E' - '\u0021' + 1));		
			System.out.print((char)genChar);
		}
		System.out.println();
		}
		if(bits != null) {
		    bits.close();
		}
		if(passGen != null) {
		    passGen.close();
		}
	}
	
	}	
	
	

