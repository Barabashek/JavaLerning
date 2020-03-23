package Lesson.Messennger.Client;

import java.io.*;
import java.net.Socket;

public class Client {
    private static Socket clientSocet;
    private static BufferedReader reader;

    private static BufferedReader in;
    private static BufferedWriter out;

    public static void main(String[] args) {
        try {
            try {
                // адрес - локальный хост, порт - 4004, такой же как у сервера
                clientSocet = new Socket("localhost", 4004);

                reader = new BufferedReader(new InputStreamReader(System.in));

                in = new BufferedReader(new InputStreamReader(clientSocet.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(clientSocet.getOutputStream()));

                System.out.println("Do you something say? Input here:");

                String word = reader.readLine();

                out.write(word + "\n");
                out.flush();

                String serverWord = in.readLine();
                System.out.println(serverWord);
            } finally {
                System.out.println("Client was closed ...");
                clientSocet.close();
                in.close();
                out.close();
            }
        } catch (IOException e){
            System.err.println(e);
        }
    }
}
