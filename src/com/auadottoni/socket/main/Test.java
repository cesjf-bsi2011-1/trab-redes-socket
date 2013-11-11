/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.auadottoni.socket.main;

import com.auadottoni.socket.client.ClientFrame;
import com.auadottoni.socket.server.ServerFrame;

/**
 *
 * @author auadtassio
 */
public class Test {
    public static void main(String[] args) {
        new Thread() {

            @Override
            public void run() {
                ServerFrame server = new ServerFrame();
                server.setVisible(true);
                server.runServer();
            }
        }.start();
        
        
        ClientFrame clientFrame = new ClientFrame();
        clientFrame.setVisible(true);
        clientFrame.runClient();
    }
}
