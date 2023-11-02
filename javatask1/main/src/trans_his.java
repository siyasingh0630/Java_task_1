import java.util.*;

public class trans_his {


    public static ArrayList<String> myList = new ArrayList<>();

    public void withdrawHis(int amount) {
        myList.add(amount + "tis withdraw from account");
    }

    public void depositHis(int amount) {
        myList.add(amount + "tis withdraw from account");
    }

    public void transferHis(String id, int amount) {

        myList.add(amount + "is transfered in account " + id);
    }

    // Using an Iterator to iterate through the ArrayList

    public void v() {
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}







