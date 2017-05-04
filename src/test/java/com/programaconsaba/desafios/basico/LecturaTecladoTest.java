package com.programaconsaba.desafios.basico;

import org.junit.Test;

import com.programaconsaba.desafios.test.DesafioTestBase;

public class LecturaTecladoTest extends DesafioTestBase {

    @Override
    public String getTestFileName() {
        return "lectura-teclado.json";
    }

    @Test
    public void test() {
        String[] args = null;
        LecturaTeclado.main(args);
    }

}
