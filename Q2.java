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
System.out.print("�п�J1~100����ƶi���]�Ƥ���:");
in =scanner.nextInt();
if(in ==0) {
	System.out.print("����");
}else if(in <1 ||  in>100) {
	System.out.print("�d����~,�Э��s��J");
}else {
System.out.print("���:");
for(int i = 2 ;i<=in;i++) {
	sum = 0;
			for(int j =2;j<=i;j++) {
				if(i%j==0)sum++;
			}
			if(sum==1) {System.out.print(i + " ");}
}


int  k=2; 
System.out.print("\n��]��"+in+"="); 
while (k<=in){ 
   if(k==in){
      break;
   }else if (in%k==0){
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
System.out.println(cache[p]+"("+num[p]+")");
	}else 	if(cache[1] ==0) {
		System.out.println(in+"(1)");
		break;
	}
}
}


	}
}

