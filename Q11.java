import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		int[][] a;
		a = new int[4][4];
		int[][] b;
		b = new int[4][4];
		int [][] c;
		c = new int[4][4];
		int i = 1;
		int status =1;
		Scanner scanner = new Scanner(System.in);
		while( status ==1){
		System.out.println("請輸入第一個方陣:");
		 i = 1;
			for (int j=1;j<=3;j++) {
				for (int k=1;k<=3;k++) {
					System.out.print("請輸入第"+i+"個因子:");
					a[j][k] =scanner.nextInt();
					
					i++;
				}
			}
			System.out.println("請輸入第二個方陣:");
			i = 1;
			for (int j=1;j<=3;j++) {
				for (int k=1;k<=3;k++) {
					System.out.print("請輸入第"+i+"個因子:");
					b[j][k]= scanner.nextInt();
					i++;
				}
			}
		

			
			for (int j=1;j<=3;j++) {
				for (int k=1;k<=3;k++) {
					c[j][k]    =a[j][1]*b[1][k]+a[j][2]*b[2][k]+a[j][3]*b[3][k];
				}
			}
			
		//輸出
			System.out.println("第一個方陣:");
			for (int j=1;j<=3;j++) {
				for (int k=1;k<=3;k++) {
					System.out.print(a[j][k] +" ");
				}
				System.out.print("\n");
			}
			
			System.out.println("\n第二個方陣:");
			for (int j=1;j<=3;j++) {
				for (int k=1;k<=3;k++) {
					System.out.print(b[j][k] +" ");
				}
				System.out.print("\n");
			}
			
			System.out.println("\n第三個方陣:");
			for (int j=1;j<=3;j++) {
				for (int k=1;k<=3;k++) {
					System.out.print(c[j][k]+" ");
				}
				System.out.print("\n");
			}
		
			System.out.print("按'0' 結束 ,按’1’繼續");
			status= scanner.nextInt();
			if(status !=0 || status !=1) {System.out.print("輸入錯誤,強制結束");};
			if(status ==0) {System.out.print("結束");};
		}
	}
	}

