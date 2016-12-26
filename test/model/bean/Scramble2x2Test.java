package model.bean;

import org.junit.Test;

public class Scramble2x2Test {
    public Scramble2x2Test() {
    
    }

    @Test
    public void testeGetScramble(){
        Embaralhamento2x2 s = new Embaralhamento2x2();
        System.out.println(s.getScramble());
    }  
}
