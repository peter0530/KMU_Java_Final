import java.util.Scanner;
class Dates{ 
    String week[] = {"","一","二","三","四","五","六","日"}; 
    public void askDate(int d){ 
System.out.println(week[d]); 
    } 
} 
 
public class Q15 { 
public static void main(String[] arge){ 
Scanner d = new Scanner(System.in); 
System.out.print("請輸入1~7 : "); 
new Dates().askDate(d.nextInt()); 
} 
} 