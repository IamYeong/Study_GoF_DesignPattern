package com.gmail.wjdrhkddud2.templatemethod.factorymethod;

import com.gmail.wjdrhkddud2.templatemethod.Algorithm;
import com.gmail.wjdrhkddud2.templatemethod.AlgorithmA;
import com.gmail.wjdrhkddud2.templatemethod.AlgorithmB;

public class AlgorithmFactory {

    public Algorithm create(AlgorithmType algorithm) {
        if (algorithm == AlgorithmType.A) return new AlgorithmA();
        else if (algorithm == AlgorithmType.B) return new AlgorithmB();
        else return null;
    }

}
