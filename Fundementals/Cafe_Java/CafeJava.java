public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double coffeePrice = 4.2;
        double lattePrice = 5.1;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        

        
        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + readyMessage + displayTotalMessage + coffeePrice);
        if(isReadyOrder1) {
            System.out.println(customer4 + pendingMessage);
        }else{
            System.out.println(customer4 + displayTotalMessage + cappuccino);
        }
        System.out.println(customer2 + displayTotalMessage + lattePrice *2);

    	// ** Your customer interaction print statements will go here ** //
    }
}
