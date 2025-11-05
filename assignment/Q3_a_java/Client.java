package Q3_a_java;
import java.io.*;
import java.net.*;
public class Client {
    // TCP Client - Nikhil Kumar
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000); // same as server

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message = "Hello from Nikhil Kumar";
            out.println(message);
            System.out.println("Message sent: " + message);

            String response = in.readLine();
            System.out.println("Server says: " + response);

            socket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}


