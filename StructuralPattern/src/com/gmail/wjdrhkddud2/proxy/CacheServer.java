package com.gmail.wjdrhkddud2.proxy;

public class CacheServer implements Server {

    private RemoteServer remoteServer;

    @Override
    public void run() {
        if (remoteServer == null) {
            remoteServer = new RemoteServer();
            //싱글턴 패턴과 흡사, 실세계의 웹서버 프록시와 동작흡사(자원이 없으면 요청해서 가지고 있다가 원격이 아닌 프록시에서 웹페이지 자원 반환)
        }

        remoteServer.run();
    }
}
