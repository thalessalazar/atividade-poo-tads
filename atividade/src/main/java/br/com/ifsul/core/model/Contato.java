package br.com.ifsul.core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contato {

  private String telefone;
  private String email;
  private Endereco endereco;

  private Contato() {}

  private Contato(String telefone, String email, Endereco endereco) {
    this.telefone = telefone;
    this.email = email;
    this.endereco = endereco;
  }

  public static Contato criarContato( String telefone, String email, Endereco endereco, List<Contato> contatosCadastrados ) {
      validaCamposObrigatorios(telefone);

      if(verificaDuplicidade(contatosCadastrados)) {
        throw new IllegalArgumentException("Já existe esse contato" + "Erro");
      }
      
      return new Contato(telefone, email, endereco);
  }

  public static boolean verificaDuplicidade(List<Contato> contatoList) {
    //retorna true se houver duplicidade
    boolean result = false;
    for(Contato contato : contatoList) {
      if(telefone == contato.telefone) {
          return true;
      }
    }
    return result;    
  }

  private static void validaCamposObrigatorios(String telefone) {
    List<String> msgs = new ArrayList<>();

    if (isNullOrEmpty(telefone)) {
      msgs.add("Informe telefone");
    }

    if(!msgs.isEmpty()) {
      throw new IllegalArgumentException("Error at create Contact" + msgs.toString());
    }

  }

  private static boolean isNullOrEmpty(String string) {
    boolean result = false;

    if(string == null || string.isEmpty()) result = true;
    
    return result;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || this.getClass() != object.getClass()) return false;

    Contato contato = (Contato) object;

    return (
      Objects.equals(telefone, contato.telefone) &&
      Objects.equals(email, contato.email) &&
      Objects.equals(endereco, contato.endereco)
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefone, email, endereco);
  }

  @Override
  public String toString() {
    return (
      "Telefone: " +
      this.telefone +
      "\n" +
      "Email: " +
      this.email +
      "\n" +
      "Endereco: " +
      this.endereco +
      "\n"
    );
  }
}
