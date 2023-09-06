package com.gmail.wjdrhkddud2.bridge.abstractfactory;

import com.gmail.wjdrhkddud2.bridge.Chair;
import com.gmail.wjdrhkddud2.bridge.Material;
import com.gmail.wjdrhkddud2.bridge.Table;

public interface AbstractFactory {

    Chair createChair();

    Table createTable();

}
