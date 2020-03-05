package br.com.ifsul.core;

import java.math.BigDecimal;

import br.com.ifsul.core.model.Conta;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        
        Conta minhaConta = new Conta();
        minhaConta.correntista = "Eduardo";
        minhaConta.agencia = 171;
        minhaConta.numeroConta = 2;
        minhaConta.saldo = BigDecimal.TEN;
             
        
        Conta minhaContaDois = new Conta("Rodrigo", 1, 171, BigDecimal.ONE);
        minhaContaDois.depositar(BigDecimal.valueOf(1000L));

        System.out.println(minhaContaDois.sacar(BigDecimal.TEN));

        
       // System.out.println("Correntista da conta um: " + minhaConta.correntista);
       // System.out.println("Correntista da conta dois: " + minhaContaDois.correntista);

    }
}
