import java.util.Scanner;
public class neon{
    public static void main(String[] args){
        int num,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value:");
        num=sc.nextInt();
        int square=num*num;
        while(square!=0){
            rem=square%10;
            sum+=rem;
            square=square/10;
        }
        if(sum==num){
            System.out.println("It is a neon number:");
        }
        else{
            System.out.println("It is not a neon number:");
        }
        sc.close();

    }
}
