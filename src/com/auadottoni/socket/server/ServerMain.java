/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.auadottoni.socket.server;

/**
 *
 * @author auadtassio
 */
public class ServerMain {
    public static void main(String[] args) {
        ServerFrame server = new ServerFrame();
        server.setVisible(true);
        server.runServer();
    }
   
}
