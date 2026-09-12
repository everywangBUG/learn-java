package tcpCoding;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

//        while(true) {
            Socket socket = new Socket("localhost", 666);
            try(InputStream input = socket.getInputStream()) {
                try(OutputStream output = socket.getOutputStream()) {
                    handler(input, output);
                }
            }
            socket.close();
            System.out.println("disconnect.");
//        }
    }

    private static void handler(InputStream input, OutputStream output) throws IOException {
        var writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
        var reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        while(true) {
            System.out.println(">>>>>>>>>>");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            writer.write(s);
            writer.newLine();
            String resp = reader.readLine();
            System.out.println("<<<<<<<<<< " + resp);
            if (resp.equals("bye")) {
                break;
            }
        }
    }
}
