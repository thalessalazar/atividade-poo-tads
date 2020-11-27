package br.com.ifsul.core.model;

import java.util.Objects;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(){

    }

    public Endereco(String rua, String bairro, String cidade, String estado, String pais){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getBairro(){
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade(){
        return cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }
    
    @Override
    public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || this.getClass() != object.getClass()) return false;
  
      Endereco endereco = (Endereco) object;
  
      return (
        Objects.equals(rua, endereco.rua) &&
        Objects.equals(bairro, endereco.bairro ) &&
        Objects.equals(cidade, endereco.cidade) &&
        Objects.equals(estado, endereco.estado) &&
        Objects.equals(pais, endereco.pais) 
      );
    }
  
    @Override
    public int hashCode(){
        return Objects.hash(rua, bairro, cidade, estado, pais);
    }
  
    @Override
    public String toString() {
        return "Rua: " + this.rua + "\n"
            + "Bairro: " + this.bairro + "\n"
            + "Cidade: " + this.cidade + "\n"
            + "Estado: " + this.estado + "\n"
            + "Pais: " + this.pais + "\n";
    }
    
}
