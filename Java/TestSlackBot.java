import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by jacobtarnow on 1/28/17.
 */
public class TestSlackBot {
    private static String token;
    private static String argument;
    private static String message;
    private static String channel;
    private static final String SLACKAPI = "https://slack.com/api/";
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please prompt with: java MySlackBot -token <token> -getusers -channel <channel_name>");
            return;
        }
        if (args.length < 5 || args.length > 6) {
            System.out.println("Please provide enough args: java MySlackBot -token <token> -post message -channel <channel_name>");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-token")) {
                token = args[i+1];
            } else if (args[i].equals("-channel")) {
                channel = args[i+1];
            } else if (args[i].equals("-getusers")) {
                argument = args[i];
            } else if (args[i].equals("-post")) {
                argument = args[i];
                message = args[i+1];
            }
        }
        if (argument.equals("-getusers")) {
            slackGetUsers(channel);
        } else if (argument.equals("-post")) {
            slackPost(message, channel);
        }
    }

    private static void slackGetUsers(String channel) {
        String url = SLACKAPI + "users.list?token=" + token + "&name=" + channel;
        try {
            URL sendingUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection)sendingUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            int respCode = connection.getResponseCode();
            System.out.println("REQUEST sent to: " + url);
            System.out.println("RESPONSE is: " + respCode);

            BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuffer sb = new StringBuffer();
            
            while ((line = bf.readLine()) != null) {
                sb.append(line);
            }
            bf.close();
            System.out.println(sb.toString());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        //https://slack.com/api/users.list
    }

    private static void slackPost(String message, String channel) {
        //https://slack.com/api/chat.postMessage
    }
}
