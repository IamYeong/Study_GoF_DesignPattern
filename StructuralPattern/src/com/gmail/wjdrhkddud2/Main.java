package com.gmail.wjdrhkddud2;

import com.gmail.wjdrhkddud2.decorator.Desktop;
import com.gmail.wjdrhkddud2.decorator.DesktopImpl;
import com.gmail.wjdrhkddud2.decorator.GraphicCard;
import com.gmail.wjdrhkddud2.decorator.RandomAccessMemory;

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

    }
}
