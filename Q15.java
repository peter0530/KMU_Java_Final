import java.util.Scanner;
class Dates{ 
    String week[] = {"","�@","�G","�T","�|","��","��","��"}; 
    public void askDate(int d){ 
System.out.println(week[d]); 
    } 
} 
 
public class Q15 { 
public static void main(String[] arge){ 
Scanner d = new Scanner(System.in); 
System.out.print("�п�J1~7 : "); 
new Dates().askDate(d.nextInt()); 
} 
} 