import java.util.Scanner;
class fact{
    long recursive(int i){ 
     long proc = 1;
   if(i ==1 || i==0) return(1);
	 else { 
      proc = i*recursive(i-1); 
     return proc;
	 }
    }
}
public class Q7 {
	public static void main(String[] args) {
		int start,end;
		long  out = 0;
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("�п�Ja");
	    end = scanner.nextInt();
	    if(end > 10) {System.out.print("�d����~�A�Э��s��J�C");System.exit(0);}
	    if(end ==0) {System.out.print("����");System.exit(0);}
	    System.out.print("�п�Jb");
	    start = scanner.nextInt();
	    if(start > 10) {System.out.print("�d����~�A�Э��s��J�C");System.exit(0);}
	    if(start ==0) {System.out.print("����");System.exit(0);}
		fact procd = new fact();
		if(start > end) {
			int cache_s = start;
			int cache_e =end;
			start = cache_e;
			end = cache_s;
		}
		if(start ==1) {
			end--;
			for(int k = 0;k<=end;k++) {System.out.print("�@");}
			System.out.println("1");
		}
		for(int i= start ;i<=end;i++) {
			int j = end-i;
			for(int k = 0;k<=j;k++) {System.out.print("�@");}
		for(int x= 0 ;x <=i;x++) {
		out=	procd.recursive(i) /( procd.recursive(i-x)* procd.recursive(x));
		System.out.print(out +" ");
		}
		System.out.print("\n");
	}
		
	}
}
