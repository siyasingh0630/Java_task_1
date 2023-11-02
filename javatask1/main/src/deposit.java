import java.util.Scanner;

public  class  deposit {
//     System.out.println("how much money you want to withdraw ?");

    Scanner scanner = new Scanner(System.in);



    //    int money = scanner.nextInt();
    public int deep(int balance ) {

        System.out.println("how much money you want to deposit ?");
         int money = scanner.nextInt();
        System.out.println(money + "is deposit from the account");
        trans_his d=new trans_his();
        d.depositHis(money);
        balance=balance+money;
        return balance;

    }
}


