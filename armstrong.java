import java.util.Scanner;
public class armstrong {
    
public static void main(String[] args) {
		 //armstrong--153=3 digit-->1^3+5^3+3^3=153
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one num:");

        int num=sc.nextInt();//153
        int temp=num;
        int cnt=(num+"").length();//153+""--"153"
        int result=0;
        while(num>0)
        {
            int digit=num%10;//153%10-3 15%10 1%10
            result+=Math.pow(digit,cnt);//3^3//9 5^3-1^3
            num/=10;//num=num/10; 153/10--15 15/10-11/10-0


        }
        String res=(temp==result)?"armstrong num":"not a armstrong";
        System.out.println(res);

	}

}

