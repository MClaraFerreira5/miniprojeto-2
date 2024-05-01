import java.util.Scanner;
public class Capitulo {
    String texto;
    String nome;
    String escolha1;
    String escolha2;
    Personagemm nome1;
    Personagemm nome2;
    int alterarEnergia;
    Scanner y;
    
    Capitulo(String texto, String nome, String escolha1, String escolha2,
     Personagemm nome1, Personagemm nome2, int alterarEnergia, Scanner y ){
        this.texto = texto;
        this.nome = nome;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.alterarEnergia = alterarEnergia;
        this.y = y;
    }
    
    void mostrar(){
        System.out.println(this.texto);
        //System.out.println(nome);
        //System.out.println(this.alterarEnergia);
        //System.out.println(this.escolha1);
         //System.out.println(this.escolha2);

    }

    public String escolher(){
        String choice = y.nextLine();
        return choice;
    }
}