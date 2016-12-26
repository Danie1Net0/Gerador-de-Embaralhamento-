package model.bean;

import org.junit.Test;

public class Scramble3x3Test {
    public Scramble3x3Test() {
    
    }

    @Test
    public void testeGetScramble() {
        Embaralhamento3x3 s = new Embaralhamento3x3();
        System.out.println(s.getScramble());
    }
}
