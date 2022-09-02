package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner t=new Scanner(System.in);
System.out.print("Qual ano vc nasceu?");
int nasc=t.nextInt();
int i=2022-nasc;
System.out.println("Sua idade é "+i+" anos");
if(i>=18) {
	System.out.println("Maior de idade!");
}
else{
	System.out.print("Menor de idade!");
}
	
	}

}
