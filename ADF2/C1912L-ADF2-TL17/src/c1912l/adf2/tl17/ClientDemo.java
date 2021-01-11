/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teacher
 */
public class ClientDemo {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                sendMessage();
            } catch (InterruptedException ex) {
                Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private static void sendMessage() {
        try {
            Socket socket = new Socket("localhost", 6060);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            System.out.println("Server: " + dis.readUTF());
            dos.writeUTF("Hello Server, I'm client");
        } catch (IOException ex) {
            Logger.getLogger(ClientDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
