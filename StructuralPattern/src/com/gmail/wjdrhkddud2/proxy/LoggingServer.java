package com.gmail.wjdrhkddud2.proxy;

public class LoggingServer implements Server {

    private RemoteServer remoteServer;

    public LoggingServer() {
        remoteServer = new RemoteServer();
    }

    @Override
    public void run() {
        System.out.println("Start log");
        remoteServer.run();
        System.out.println("End log");
    }
}
