import java.util.Scanner;

public class transfer {



//     System.out.println("how much money you want to withdraw ?");

        Scanner scanner = new Scanner(System.in);
//        public int money = scanner.nextInt();

        //    int money = scanner.nextInt();
        public int  d(int balance) {

            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();
//            System.out.print("Enter PIN: ");
//            String pin = scanner.nextLine();
            System.out.println("how much money you want to withdraw ?");

            int money = scanner.nextInt();
            if (balance < money){
                System.out.println("you dont have the sufficient balance!");
        }
            else{
                balance=balance-money;

                System.out.println(money +"is transfered in"+userId);
                trans_his d=new trans_his();
                d.transferHis(userId,money);
            }

            return balance;

        }
    }
