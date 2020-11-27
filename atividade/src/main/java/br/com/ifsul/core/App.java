package br.com.ifsul.core;

import java.util.ArrayList;
import java.util.List;

import br.com.ifsul.core.model.Contato;
import br.com.ifsul.core.model.Endereco;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Contato> contatoCadastradas = new ArrayList<>();

        Endereco enderecoContato1 = new Endereco("Rua 1", "Menino Deus", "Bagé", "RS", "Brasil");
        Contato contato1 = Contato.criarContato("53999250139", "thalessalazar.12@gmail.com", enderecoContato1, contatoCadastradas);
        contatoCadastradas.add(contato1);
        
        Endereco enderecoContato2 = new Endereco("Rua 2", "Menino Deus", "Bagé", "RS", "Brasil");
        Contato contato2 = Contato.criarContato("5399250100", "thalessalazar@gmail.com", enderecoContato2, contatoCadastradas);
        contatoCadastradas.add(contato2);

        

    }
}
