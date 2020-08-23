package br.gov.sp.fatec.projetomaven;

import org.junit.Test;
import org.junit.Assert;

public class AppTest 
{
	@Test
    public void retornaSoma()
    {
        Calculadora calc = new Calculadora(1,1);
        double somaEsperada = calc.Soma();
        Assert.assertEquals(2, somaEsperada, 0.00001);
        
    }
	
	@Test
    public void retornaSubtracao()
    {
        Calculadora calc = new Calculadora(1,1);
        double subtracaoEsperada = calc.Subtracao();
        Assert.assertEquals(0, subtracaoEsperada, 0.00001);
        
    }
	
	@Test
    public void retornaMultiplicacao()
    {
        Calculadora calc = new Calculadora(1,1);
        double multiplicacaoEsperada = calc.Multiplicacao();
        Assert.assertEquals(1, multiplicacaoEsperada, 0.00001);
        
    }
	
	@Test
    public void retornaDivisao()
    {
        Calculadora calc = new Calculadora(1,1);
        double divisaoEsperada = calc.Divisao();
        Assert.assertEquals(1, divisaoEsperada, 0.00001);
        
    }
}
