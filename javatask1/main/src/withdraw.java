
import java.util.Scanner;



import java.util.Scanner;
import java.util.Scanner;
public class withdraw {
//     System.out.println("how much money you want to withdraw ?");

    Scanner scanner = new Scanner(System.in);

    //    int money = scanner.nextInt();
    public  void info(int balance){
        System.out.println("how much money you want to withdraw ?");
         int  money = scanner.nextInt();
         if(money>balance){
             System.out.println("account didnt have that much to withdraw");
         }
       else{
           System.out.println( money+"is withdraw from the account");
             trans_his d=new trans_his();
         d.withdrawHis(money);
         }

    }

}

