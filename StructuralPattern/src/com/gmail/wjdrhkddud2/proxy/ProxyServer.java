package com.gmail.wjdrhkddud2.proxy;

public class ProxyServer implements Server {

    private RemoteServer remoteServer;//객체 합성(Composite)으로 방향성 제어에 용이

    public ProxyServer() {
        remoteServer = new RemoteServer();
    }

    @Override
    public void run() {
        remoteServer.run();
        System.out.println("Proxy server run");//기능확장에 용이
    }
}
