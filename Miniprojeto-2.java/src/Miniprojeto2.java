import java.util.Scanner;
public class Miniprojeto2 {
    public static void main(String[] args) throws Exception {
        Scanner y = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String user = y.nextLine();
        Personagemm nome = new Personagemm(user, 20);
        
        System.out.println("Pronto!! \nSeu personagem se chama " + nome.nome + ", e ele tem " + nome.energia + " de energia." );
        
        System.out.println("Agora crie o seu segundo personagem");
        String user2 = y.nextLine();
        
        Personagemm nome2 = new Personagemm(user2, 20);
        
        System.out.println("Pronto!! \nSeu segundo personagem se chama " + nome2.nome + ", e ele tem " + nome2.energia + " de energia." );
        System.out.println("\u001B[33mO labirinto\u001B[0m");
        System.out.println(nome.nome + " e " + nome2.nome + " estão em um labirinto no meio de uma floresta sem comida ou água e " +
        "eles devem sair rápido ou irão morrer \nEles começam a seguir em frente até que encontram uma fruta misteriosa. \n" +
        "Escolha se os personagens irão comer a fruta. Digite sim ou nao." );
        
        String per = y.nextLine();
        
        if (per.equals("sim")){
                nome.diminuirEnergia();
                nome2.diminuirEnergia();
                System.out.println("A fruta que eles comeram era venenosa e " + nome.nome + " e " + nome2.nome + "passaram mal");
                System.out.println("Após eles serem envenenados " +  nome.nome + " e " + nome2.nome + " ficam desesperados em busca de uma saida eles avistam 2" + 
                " caminhos um com mata fechada e outro com um campo aberto");
                System.out.println("Digite 1 para seguir o da mata fechada e 2 para o do campo aberto");
                String mata_campo = y.nextLine();
                
                if(mata_campo.equals("1")){
                    System.out.println("Eles seguem pela mata fechada e vão ficando cada vez mais perdidos na densa vegetação" + 
                    "e ficam completamente esgotados ");
                    nome.diminuirEnergia();
                    nome2.diminuirEnergia();
            System.err.println();
                }
                else if(mata_campo.equals("2")){
                    System.out.println("No campo eles conseguem ver com clareza o fim do labirinto e apesar de estaram muito" + 
                    " cansados eles conseguem achar o \u001B[32mfim do labirinto\u001B[0m");
                }           
            }
        
        
        else if(per.equals("nao")){
            System.out.println("Eles passam reto pela fruta e seguem em direção ao meio do labirinto, até que eles avistam um animal" +
            " ao chegar perto o animal começa a andar em uma direção do labirinto. \nEntão eles pensam se deveriam seguir-lo ou não");
            System.out.println("Digite se você deseja seguir-lo ou não. Digite sim ou nao");
            String segue_ou_n = y.nextLine();
           
            if(segue_ou_n.equals("sim")){
                System.out.println("Eles decidem seguir o animal e ele os leva a um campo onde eles conseguem ver a " + 
                "\u001B[32msaída do labirinto!!\u001B[0m");
            }
            
            else if(segue_ou_n.equals("nao")){
                System.out.println("Eles decidem ir para outro caminho, após muita caminhada eles não encontram a saída e ficam" + 
                " mais e eles perdem energia");
                nome.diminuirEnergia();
                nome2.diminuirEnergia();
                System.out.println("Após muito tempo e por estarem esgotados eles ficam sem suprimentos.");
                nome.diminuirEnergia();
                nome2.diminuirEnergia();
            }
            }
        y.close();
        }

}

