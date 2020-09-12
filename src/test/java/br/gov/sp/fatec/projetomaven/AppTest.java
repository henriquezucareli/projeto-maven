package br.gov.sp.fatec.projetomaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void retornaSoma() {
        final Calculadora calc = new Calculadora(1, 1);
        final double somaEsperada = calc.Soma();
        Assertions.assertEquals(2, somaEsperada, 0.00001);

    }

    @Test
    public void retornaSubtracao() {
        final Calculadora calc = new Calculadora(1, 1);
        final double subtracaoEsperada = calc.Subtracao();
        Assertions.assertEquals(0, subtracaoEsperada, 0.00001);

    }

    @Test
    public void retornaMultiplicacao() {
        final Calculadora calc = new Calculadora(1, 1);
        final double multiplicacaoEsperada = calc.Multiplicacao();
        Assertions.assertEquals(1, multiplicacaoEsperada, 0.00001);

    }

    @Test
    public void retornaDivisao() {
        final Calculadora calc = new Calculadora(1, 1);
        final double divisaoEsperada = calc.Divisao();
        Assertions.assertEquals(1, divisaoEsperada, 0.00001);
        
    }
}
