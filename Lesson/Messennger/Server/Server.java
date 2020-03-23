package Lesson.Messennger.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                server = new ServerSocket(4004);
                System.out.println("Server is Running!");
                clientSocket = server.accept();

                try{
                    //установка потоков ввода/вывода
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // прием сообщений

                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())); // отправка сообщений

                    String word = in.readLine();
                    System.out.println(word);

                    out.write("Hello, this is Server! Confirm, you write : " + word + "\n");
                    out.flush();

                } finally {
                    System.out.println("dfjkhgkdf");
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("Server is closed!");
                server.close();
            }
        } catch (IOException e){System.err.println(e);}
    }
}
