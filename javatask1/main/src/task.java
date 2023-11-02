import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

public class task {



 static int balance=1000;

    public static void main(String[] args) {
        HashMap<String,String>Tree=new HashMap<String, String>();
        Tree.put("rcoem","rcoem123");
        Tree.put("rcoemA","rcoem1222");
        Tree.put("riya","jiya");
        Tree.put("nikita","nik");
        Tree.put("ayushi","ash");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String Pin = scanner.nextLine();
        if(Tree.containsKey(userId) &&  Pin.equals(Tree.get(userId))){
            System.out.println("successfully entered to the account");
        }
        else{
            System.out.println("Invalid id or  password");
//            exit(0);
            System.exit(0);
        }

        System.out.println(" ");
        while (true) {
            System.out.println("1. Transactions History");

            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4.transfer");
            System.out.print("5.quit");
            System.out.println("eneter the choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    trans_his d = new trans_his();
                    d.v();

                    break;
                case 2:
                    withdraw k = new withdraw();
                    k.info(balance);

                    break;
                case 3:
                    deposit v = new deposit();
                  balance=  v.deep(balance);


                    break;
                case 4:
                    transfer j = new transfer();
                   balance= j.d(balance);

                case 5:
                    quit m = new quit();
                    break;
                default:
                    System.out.println(" the no not exist");
            }
            System.out.println("Do you want to repeat the process");
            int cc = scanner.nextInt();
            if(cc ==1){
                break;
            }
        }
    }


}





