package model.bean;

import org.junit.Test;

public class Scramble4x4Test {
    public Scramble4x4Test() {
    
    }

    @Test
    public void testeGetScramble() {
        Embaralhamento4x4 s = new Embaralhamento4x4();
        System.out.println(s.getScramble());
    }
}
