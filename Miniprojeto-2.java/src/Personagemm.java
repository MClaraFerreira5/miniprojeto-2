public class Personagemm {
    String nome;
    int energia;
    public Personagemm(String nome, int energia){
        this.nome = nome;
        this.energia = energia;
        }

    public int perder(int energia){
        energia = energia - 50;
        return energia;
        }
    public int igual(int energia){
        return energia;
            }
        }
    
