import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
	boolean IDCheck = false ;
	String ID = "";
	String   change = "" ;

		int sum =0 , check;
		int list[] = {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
		 Scanner scanner = new Scanner(System.in);
		
		 while (IDCheck != true  ) {
			System.out.print("�п�J�����Ҧr��:");
			ID=scanner.next();
			if(!ID.equals("0")) {
			 if(ID.matches("[a-zA-Z][0-9]{9}" )){
				 IDCheck = true;
			 }else{
				 System.out.println("�d����~�A�п�J1��r��+9��Ʀr");
			 }
			 
			ID=ID.toUpperCase();
			int one =ID.charAt(0) -65;
			ID = list[one] + ID.substring(1);
			sum = Character.getNumericValue(ID.charAt( 0 )) *1;
			for(int  i =9 ; i>= 1 ;i-- ) {
				sum =sum +  Character.getNumericValue(ID.charAt( 10-i )) *i ;
			}
		   check =( 10- (sum %10))%10;
			 

				 if(  Character.getNumericValue(ID.charAt(10)) == check ) {
				 System.out.print("�����Ҧr�����ҳq�L" );
			 }else {
				 System.out.print("�����Ҧr�����ҥ���" );
			 }
		 }else {
			 System.out.print("����" );
			 break;
		 }
		 }	
}
}	





