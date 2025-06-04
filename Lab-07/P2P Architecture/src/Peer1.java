import java.io.*;
import java.net.*;

public class Peer1 {
    public static void main(String[] args) throws IOException {
        final int listenPort = 5000;
        final int sendPort = 6000;
        final String peerIP = "localhost";

        // Thread to listen for incoming messages
        Thread receiveThread = new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(listenPort)) {
                while (true) {
                    try (Socket socket = serverSocket.accept();
                         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                        String msg = in.readLine();
                        if (msg != null) {
                            System.out.println("Peer2: " + msg);
                            if (msg.equalsIgnoreCase("exit")) break;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        receiveThread.start();

        // Thread to send messages
        try (BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {
            String msg;
            while (true) {
                System.out.print("You: ");
                msg = userInput.readLine();
                try (Socket socket = new Socket(peerIP, sendPort);
                     PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
                    out.println(msg);
                }
                if (msg.equalsIgnoreCase("exit")) break;
            }
        }
        // Wait for receive thread to finish
        try { receiveThread.join(); } catch (InterruptedException ignored) {}
        System.out.println("Chat ended.");
    }
} 