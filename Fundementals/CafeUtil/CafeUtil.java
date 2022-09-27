import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    
    public double getOrderTotal(double[]prices) {
        double sum =0;
        for (double value : prices) {
            sum += value;
        } 
        return sum;
    }

    public void displayMenu(ArrayList<String> menuitems) {
        System.out.println(menuitems);
    }

    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello" +" "+ userName);
        customers.add(userName);
        System.out.printf("There are %d people in front of you" , (int)customers.size());

    }

}


