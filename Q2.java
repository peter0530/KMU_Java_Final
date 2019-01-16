//Q2
import java.util.Scanner;
public class Q2 {
public static void main(String[] args) {
int sum=0,in;
int[] cache;
cache = new int[10];
int[] num;
num = new int[10];
int y = 1;
int z = 1;
Scanner scanner = new Scanner(System.in);
System.out.print("請輸入1~100的整數進行質因數分解:");
in =scanner.nextInt();
if(in ==0) {
	System.out.print("結束");
}else if(in <1 ||  in>100) {
	System.out.print("範圍錯誤,請重新輸入");
}else {
System.out.print("質數:");
for(int i = 2 ;i<=in;i++) {
	sum = 0;
			for(int j =2;j<=i;j++) {
				if(i%j==0)sum++;
			}
			if(sum==1) {System.out.print(i + " ");}
}


int  k=2; 
System.out.print("\n質因數"+in+"="); 
while (k<=in){ 
if (in%k==0){
	   if(cache[y-1] == k ) {
		   y--;z--;
	   cache[y] =k ;
	   num[z]=num[z]+1;
	   }else {
		   cache[y] =k ;
		   num[z]=num[z]+1;
	     y++; z++;
	   }
        in=in/k;
   }else {
       k++; 
   }
}
for(int p = 1 ; p <10 ;p++) {
	if(cache[p] !=0) {
System.out.print(cache[p]+"("+num[p]+")");
	}else 	if(cache[1] ==0) {
		System.out.println(in+"(1)");
		break;
	}
}
}


	}
}

