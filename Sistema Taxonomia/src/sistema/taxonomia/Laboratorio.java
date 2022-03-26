
package sistema.taxonomia;
import java.util.Scanner;


public class Laboratorio {
    Scanner scan = new Scanner(System.in);
    
    private int cod;
    private String nome;
    private Endereco endereco;
    private String cnpj;
    private String areaDePesquisa;
    private String telefone;
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void cadastrarLaboratorio() {
        System.out.println("Nome: ");
        this.nome = scan.nextLine();
        
        System.out.println("Cnpj: ");
        this.cnpj = scan.nextLine();
        
        System.out.println("Área de Pesquisa: ");
        this.areaDePesquisa = scan.nextLine();
        
        System.out.println("Telefone: ");
        this.telefone = scan.nextLine();
    }
    
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("-------------");
        System.out.println("Cnpj: " + this.cnpj);
        System.out.println("-------------");
        System.out.println("Área de Pesquisa: " + this.areaDePesquisa);
        System.out.println("-------------");
        System.out.println("Telefone: " + this.telefone);
    }
 
}
