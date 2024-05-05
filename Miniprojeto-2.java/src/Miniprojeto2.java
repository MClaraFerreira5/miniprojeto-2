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
        "Escolha se os personagens irão comer a fruta. Digite sim ou nao.", new String[] {"sim", "nao"} , "Capitulo 1", 0, 0, y, nome1, nome2);    

        capitulo1.mostrar();
        int escolhaCap1 = capitulo1.escolher();
        if(escolhaCap1 == 0){
          Capitulo capitulo2_1 = new Capitulo("A fruta que eles comeram era venenosa e " + nome1.nome + " e " + nome2.nome +
          "passaram malApós eles serem envenenados " + nome1.nome + " e " + nome2.nome + " ficam desesperados em busca de uma saida eles avistam 2" + 
          " caminhos um com mata fechada e outro com um campo aberto \n Digite 1 para seguir o da mata fechada e 2 para o do campo aberto", 
          new String[] {"1", "2"},"Capitulo 2", 17, 17, y, nome1, nome2);
            capitulo2_1.mostrar();
            int escolhaCap2_1 = capitulo2_1.escolher();
            
            if(escolhaCap2_1 == 0){
              Capitulo capitulo3_1 = new Capitulo("Eles seguem pela mata fechada e vão ficando cada vez mais perdidos na densa vegetação" + 
              " e ficam completamente esgotados ", new String[] {}, "Capitulo3_1", 17, 17, y, nome1, nome2);
              capitulo3_1.mostrar();
            }
            
            else if (escolhaCap2_1 == 1){
              Capitulo capitulo3_3 = new Capitulo("No campo eles conseguem ver com clareza o fim do labirinto e apesar de estaram muito" + 
              " cansados eles conseguem achar o \u001B[32mfim do labirinto\u001B[0m", new String [] {}, "Capitulo3_3", 0, 0, y, nome1, nome2);  
              capitulo3_3.mostrar();

            }
        }
        else if(escolhaCap1 == 1){
            Capitulo capitulo2_2 = new Capitulo("Eles passam reto pela fruta e seguem em direção ao meio do labirinto, até que eles avistam um animal" +
            " ao chegar perto o animal começa a andar em uma direção do labirinto. \nEntão eles pensam se deveriam seguir-lo ou não \n Digite 1 para não seguir-lo 2 para seguir-lo"
            , new String[] {"1","2"}, "Capitulo2_2", 0, 0, y, nome1, nome2);
            capitulo2_2.mostrar();
            int escolhaCap2_2 = capitulo2_2.escolher();
            
            if (escolhaCap2_2 == 0){
              Capitulo capitulo3_2 = new Capitulo("Eles decidem ir para outro caminho, após muita caminhada eles não encontram a saída e ficam presos" + 
              " eles perdem toda a energia",new String[] {}, "Capitulo3_2", 20, 20, y, nome1, nome2);  
              capitulo3_2.mostrar();
            }

            else if(escolhaCap2_2 == 1){
              Capitulo capitulo3_4 = new Capitulo("Eles decidem seguir o animal e ele os leva a um campo onde eles conseguem ver a " + 
              "\u001B[32msaída do labirinto!!\u001B[0m", new String [] {}, "Capitulo3_4", 0, 0, y, nome1, nome2);  
              capitulo3_4.mostrar();
                
            }
          }
        }
      }