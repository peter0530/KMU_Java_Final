import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int[] aa;
		aa = new int[101];
		int aaa=99;
		
		int[] bb;
		bb = new int[101];
		int bbb =99;
		
		int a =0;
	    System.out.print("叫块a");
	    a = scanner.nextInt();
	    if(a == 2 || a == 3 ) { aa[99] = 1; }
		aa[100] = a;
		for(int i = a/2 ; i >=2 ; i--) {
			if(a % i ==0) {
				aa[aaa] = i;
			aaa--;
			}
			aa[aaa] = 1;
		}
	    
		
		
		int b =0;
	    System.out.print("叫块b");
	    b = scanner.nextInt();
	    if(b == 2 || b == 3 ) { bb[99] = 1; }
		bb[100] = b;
		for(int i = b/2 ; i >=2 ; i--) {
			if(b % i ==0) {
				bb[bbb] = i;
			bbb--;
			}
			bb[bbb] = 1;
		}
		

		
		m:
		for(int x  = 100;x>=0;x--) {
			
			for(int y  = 100;y>=0;y--) {
				if(aa[x] == bb[y]) {
					System.out.println(a +"籔" + b +"程そ计" + aa[x]);
					break m;
				}
			}
		}
		
		for(int z = 1;z <=100;z++) {
			aa[z] =a *z;
			bb[z] =b*z;
		}
	

		for(int x  = 1;x<=100;x++) {
			for(int y  = 1;y<=100;y++) {
				if(aa[x] == bb[y]) {
					System.out.println(a +"籔" + b +"程そ计" + aa[x]);
					System.exit(0);
				}
			}
		}
		
	}
}
