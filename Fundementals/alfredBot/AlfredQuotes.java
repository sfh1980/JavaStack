import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        // example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Good moring %s, Nice to see you.", name);
    }
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("It is currently %s.", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") >-1) {
            return "Playing KidzBop 13";
        }
        if(conversation.indexOf("Alfred")>-1) {
            return "Apologies sir, I wasnt there when you unboxed your happy meal toy.";
        }
        
        return "But I am the night...";
        
    }
}