package Q3_a_java;
import java.io.*;
import java.net.*;

public class Server {
    // TCP Server - Nikhil Kumar
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000); // same as client
            System.out.println("Server started. Waiting for client...");

            Socket socket = server.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String message = in.readLine();
            System.out.println("Received from client: " + message);

            String response = message.toUpperCase(); // reply in uppercase
            out.println("Server response: " + response);

            socket.close();
            server.close();
            System.out.println("Server closed.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
