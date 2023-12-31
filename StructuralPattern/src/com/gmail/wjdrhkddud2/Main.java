package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.adapter.ApplePort;
import com.gmail.wjdrhkddud2.adapter.CPort;
import com.gmail.wjdrhkddud2.adapter.CompositeAdapter;
import com.gmail.wjdrhkddud2.adapter.ExtendAdapter;
import com.gmail.wjdrhkddud2.bridge.Chair;
import com.gmail.wjdrhkddud2.bridge.Table;
import com.gmail.wjdrhkddud2.bridge.abstractfactory.FactoryBuilder;
import com.gmail.wjdrhkddud2.bridge.abstractfactory.Materials;
import com.gmail.wjdrhkddud2.bridge.abstractfactory.WoodFactory;
import com.gmail.wjdrhkddud2.decorator.Desktop;
import com.gmail.wjdrhkddud2.decorator.DesktopImpl;
import com.gmail.wjdrhkddud2.decorator.GraphicCard;
import com.gmail.wjdrhkddud2.decorator.RandomAccessMemory;
import com.gmail.wjdrhkddud2.flyweight.*;
import com.gmail.wjdrhkddud2.proxy.CacheServer;
import com.gmail.wjdrhkddud2.proxy.LoggingServer;
import com.gmail.wjdrhkddud2.proxy.ProxyServer;
import com.gmail.wjdrhkddud2.proxy.Server;

public class Main {

    public static void main(String... args) {

        /**
         * 데코레이터 사용 예시
         * 객체를 점점 확장시켜나갈 수 있으며
         * 비슷한 예시가 java BufferReader 쪽이다.
         * BufferReader(FileReader(File))
         */
        Desktop baseDesktop = new DesktopImpl();
        Desktop upgradeDesktop = new RandomAccessMemory(new GraphicCard(new DesktopImpl()));


        ApplePort applePort = new CompositeAdapter(new CPort());
        applePort.connect();

        ApplePort applePort1 = new ExtendAdapter();
        applePort1.connect();

        Chair woodChair = new FactoryBuilder().getFactory(Materials.Wood).createChair();
        Table leatherTable = new FactoryBuilder().getFactory(Materials.Leather).createTable();

        Server proxyServer = new ProxyServer();
        Server cacheServer = new CacheServer();
        Server loggingServer = new LoggingServer();
        proxyServer.run();
        cacheServer.run();
        loggingServer.run();

        for (int i = 0; i < 10; i++) new CoordinatePin(0d, 0d, Shape.RectanglePin);
        for (int i = 0; i < 10; i++) new CoordinatePin(0d, 0d, Shape.TrianglePin);
        for (int i = 0; i < 10; i++) new CoordinatePin(0d, 0d, Shape.RoundPin);

        System.out.println("Memory : " + Memory.size);
        Memory.size = 0;

        Map map = new Map();
        for (int i = 0; i < 10; i++) map.createPin(0d, 0d, Shape.RectanglePin);
        for (int i = 0; i < 10; i++) map.createPin(0d, 0d, Shape.TrianglePin);
        for (int i = 0; i < 10; i++) map.createPin(0d, 0d, Shape.RoundPin);

        System.out.println("Memory : " + Memory.size);
        Memory.size = 0;

    }
}
