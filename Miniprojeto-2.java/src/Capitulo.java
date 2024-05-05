import java.util.Scanner;
public class Capitulo {
    String texto;
    String capitulo;
    String escolha1;
    String escolha2;
    Personagemm nome1;
    Personagemm nome2;
    int alterarEnergia1;
    int alterarEnergia2;
    Scanner y;
    String [] escolhas;
    int i;
    
    Capitulo(String texto, String escolhas [], String capitulo, int alterarEnergia1, 
    int alterarEnergia2, Scanner y,  Personagemm nome1, Personagemm nome2){
        this.texto = texto;
        this.capitulo = capitulo;
        this.escolhas = escolhas;
        this.alterarEnergia1 = alterarEnergia1;
        this.alterarEnergia2 = alterarEnergia2;
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.y = y;
    }

    void mostrar(){
        System.out.println(this.capitulo + "\n");
        System.out.println(this.texto + "\n");
        
        if (alterarEnergia1 != 0 && alterarEnergia2 != 0){
            nome1.diminuirEnergia(alterarEnergia1);
            nome2.diminuirEnergia(alterarEnergia2);
        }
        
        System.out.println(escolhas.length + " escolhas: ");
        for (int i = 0; i < escolhas.length; i += 1){
            System.out.println(escolhas[i]);

        }
    }

    public int escolher(){ 
        if (escolhas.length == 0) {
           System.out.println("Não há escolhas a serem feitas");

        return -2;
        }
        else {
            String choice = y.nextLine();
            for (int i = 0; i <= escolhas.length; i++){
                if (choice.equals(escolhas[i])){
                    System.out.println("Índice da escolha feita " + i);
                    return i;
                    }
                }
            }
        System.out.println("Escolha inválida");
        return -3;
    }
}

