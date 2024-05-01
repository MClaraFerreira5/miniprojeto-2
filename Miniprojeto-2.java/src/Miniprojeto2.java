import java.util.Scanner;
public class Miniprojeto2 {
    public static void main(String[] args) throws Exception {
        Scanner y = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String user = y.nextLine();
        Personagemm nome1 = new Personagemm(user, 20);
        
        System.out.println("Pronto!! \nSeu personagem se chama " + nome1.nome + ", e ele tem " + nome1.energia + " de energia." );
        
        System.out.println("Agora crie o seu segundo personagem");
        String user2 = y.nextLine();
        
        Personagemm nome2 = new Personagemm(user2, 20);
        System.out.println("Pronto!! \nSeu segundo personagem se chama " + nome2.nome + ", e ele tem " + nome2.energia + " de energia." );
        
        System.out.println("\u001B[33mO labirinto\u001B[0m");
        
        Capitulo capitulo1 = new Capitulo(nome1.nome + " e " + nome2.nome + " estão em um labirinto no meio de uma floresta sem comida ou água e " +
        "eles devem sair rápido ou irão morrer \nEles começam a seguir em frente até que encontram uma fruta misteriosa. \n" +
        "Escolha se os personagens irão comer a fruta. Digite sim ou nao.", "Capitulo 1", "sim", "nao", nome1, nome2, 0, y);
        
        Capitulo capitulo2_1 = new Capitulo("A fruta que eles comeram era venenosa e " + nome1.nome + " e " + nome2.nome + "passaram malApós eles serem envenenados " +
          nome1.nome + " e " + nome2.nome + " ficam desesperados em busca de uma saida eles avistam 2" + 
        " caminhos um com mata fechada e outro com um campo aberto \n Digite 1 para seguir o da mata fechada e 2 para o do campo aberto", "Capitulo 2", 
        "1", "2", nome1, nome2,0, y);
        
        Capitulo capitulo2_2 = new Capitulo("Eles passam reto pela fruta e seguem em direção ao meio do labirinto, até que eles avistam um animal" +
        " ao chegar perto o animal começa a andar em uma direção do labirinto. \nEntão eles pensam se deveriam seguir-lo ou não \n Digite 1 para não seguir-lo 2 para seguir-lo"
        , "Capitulo2_2", "1", "2", nome1, nome2, 0, y);
        
        Capitulo capitulo3_1 = new Capitulo("Eles seguem pela mata fechada e vão ficando cada vez mais perdidos na densa vegetação" + 
        "e ficam completamente esgotados ", "Capitulo3_1", null, null, nome1, nome2, 0, y);

        Capitulo capitulo3_2 = new Capitulo("Eles decidem ir para outro caminho, após muita caminhada eles não encontram a saída e ficam" + 
        " mais e eles perdem energia", "Capitulo3_2", null, null, nome1, nome2, 0, y);
        
        Capitulo capitulo3_3 = new Capitulo("No campo eles conseguem ver com clareza o fim do labirinto e apesar de estaram muito" + 
        " cansados eles conseguem achar o \u001B[32mfim do labirinto\u001B[0m", "Capitulo3_3", null, null, nome1, nome2, 0, y);

        Capitulo capitulo3_4 = new Capitulo("Eles decidem seguir o animal e ele os leva a um campo onde eles conseguem ver a " + 
        "\u001B[32msaída do labirinto!!\u001B[0m", "Capitulo3_4", null, null, nome1, nome2, 0, y);
        
        capitulo1.mostrar();
        String escolhaCap1 = capitulo1.escolher();
        if(escolhaCap1.equals(capitulo1.escolha1)){
            capitulo2_1.mostrar();
            nome1.diminuirEnergia();
            nome2.diminuirEnergia();
            String escolhaCap2_1 = capitulo2_1.escolher();
            
            if(escolhaCap2_1.equals(capitulo2_1.escolha1)){
              capitulo3_1.mostrar();
              nome1.diminuirEnergia();
              nome2.diminuirEnergia();  
            }
            
            else if (escolhaCap2_1.equals(capitulo2_1.escolha2)){
                capitulo3_3.mostrar();

            }
        }
        else if(escolhaCap1.equals(capitulo1.escolha2)){
            capitulo2_2.mostrar();
            String escolhaCap2_2 = capitulo2_2.escolher();
            
            if (escolhaCap2_2.equals(capitulo2_2.escolha1)){
                capitulo3_2.mostrar();
                nome1.diminuirEnergia();
                nome2.diminuirEnergia();
            }

            else if(escolhaCap2_2.equals(capitulo2_2.escolha2)){
                capitulo3_4.mostrar();
                
            }
          }
        }
      }