/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teacher
 */
public class Server extends Thread{
    
    int port;
    ServerSocket serverSocket;

    public Server(int port) throws IOException {
        this.port = port;
        this.serverSocket = new ServerSocket(port);
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Listening...");
                Socket client = serverSocket.accept();
                if(client == null || client.isClosed())
                    continue;
                
                DataInputStream dis = new DataInputStream(client.getInputStream());
                DataOutputStream dos = new DataOutputStream(client.getOutputStream());
                
                dos.writeUTF("Hello client, I'm server");
                System.out.println("Client: " + dis.readUTF());
                client.close();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void main(String[] args) {
        Server server;
        try {
            server = new Server(6060);
            server.start();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
}
