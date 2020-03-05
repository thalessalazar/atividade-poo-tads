//Pacote onde nossa classe esta localizada
package br.com.ifsul.core.model;

//importacao do tipo BigDecimal da lib math
import java.math.BigDecimal;

//Classe Conta
public class Conta {

    //Atributos da nossa classe conta
    //Um atributo consiste em:
    //<tipo> nomeDoMeuAtributo;
    public String correntista;
    public int numeroConta;
    public int agencia;
    public BigDecimal saldo;

    //Abaixo temos o nosso construtor
    public Conta() {
    }

    //Abaixo temos o nosso construtor sobrecarregado
    //que serve para criarmos instancias da nossa classe Conta
    //com os atributos populados (ou seja com dados)
    public Conta(String correntista, int numeroConta, int agencia, BigDecimal saldo) {
        //Abaixo estaremos populando nossos atributos
        //com os valores passando nos paramentros
        //no momento da criacao da nossa classe 
        this.correntista = correntista;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    //Abaixo temos nosso metodo, que alteram o comportamento
    //ou valores da nossa instancia de conta
    //nosso retorno aqui eh void (ou seja vazio)
    public void depositar(BigDecimal valor) {
        this.saldo = saldo.add(valor);
    }

    //Metodo que saca valores da nossa instancia de conta
    //Nele temos uma pequena regra de verificar se temos saldo
    //suficientem para sacar. Nele temos um retorno (return)
    //de uma string que eh uma msg que sera mostrado para o usuario
    public String sacar(BigDecimal valor) {
        if(this.saldo.doubleValue() < valor.doubleValue()) {
            return "Saldo menor que valor em conta";
        }
        this.saldo = this.saldo.subtract(valor);
        return "Saque realizado com sucesso.";
    }


}