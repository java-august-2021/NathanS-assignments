import java.util.Date;
public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        String string = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return string;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Today's date is " + date;
    }


    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");
        if(a != -1){
            String response = "Right away, sir! She certainly isn't sophisticated enough for that.";
            return response;
        }else if(b != -1){
            String response = "Right away, Mr. Wayne.";
            return response;
        }else{
            String response = "Right. And with that I shall retire.";
            return response;
        }
    }
}
    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
//     public String fireUpBatmobile(String command) {
//         int a = command.indexOf("Fire up the Batmobile");
//         if(a != -1) {
//             String reply = "Right away, Sir!";
//             return reply;  
//         }        
//     }
// }
