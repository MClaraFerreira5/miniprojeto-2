import java.util.Scanner;
public class Miniprojeto2 {
    public static void main(String[] args) throws Exception {
        Scanner y = new Scanner(System.in);
        System.out.println("Digite o nome do seu personagem: ");
        String user = y.nextLine();
        Personagemm nome = new Personagemm(user, 100);
        System.out.println("Pronto!! \nSeu personagem se chama " + nome.nome + ", e ele tem " + nome.energia + " de energia." );
        System.out.println("Agora crie o seu segundo personagem");
        String user2 = y.nextLine();
        Personagemm nome2 = new Personagemm(user2, 100);
        System.out.println("Pronto!! \nSeu segundo personagem se chama " + nome2.nome + ", e ele tem " + nome2.energia + " de energia." );
        System.out.println("Agora eles vão lutar entre si");
        System.out.println("Você quer seguir o " + nome.nome + "ou" + nome2.nome + "?");
        String per = y.nextLine();
        if (per.equals(nome.nome)){
            System.out.println("Agora você deseja atacar ou defender? ");
            String atacdef = y.nextLine();
            if (per.equals("atacar")){
                
            }
            else if(per.equals("defesa")){

            }
        }
        else if(per.equals(nome2.nome)){
            System.out.println("Agora você deseja atacar ou defender? ");
            String atacdef2 = y.nextLine();
            if(per.equals("atacar")){

            }
            else if(per.equals("defesa")){

            }
        }
    }
}
