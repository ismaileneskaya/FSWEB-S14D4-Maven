package org.example.rpg;

import org.example.rpg.utils.Constant;
import org.junit.jupiter.engine.Constants;

public interface Poisonable {
    default double poison(){
        return Constant.POISON_PERCENTAGE;
    }
}
