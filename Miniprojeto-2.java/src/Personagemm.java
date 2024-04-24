public class Personagemm {
    String nome;
    int energia;
    public Personagemm(String nome, int energia){
        this.nome = nome;
        this.energia = energia;
        }
    public void diminuirEnergia() {
        this.energia -= 17;
            if (this.energia <= 0){
                System.out.println(" \u001B[31mToda a energia foi esgotada. O personagem" + this.nome + " morreu\u001B[0m");
            }
            else{
                System.out.println("Foram perdidos \u001B[31m17 pontos de energia\u001B[0m");
                System.err.println("Agora a energia de " + this.nome + " é: " + this.getEnergia());
            }
        }

    public int getEnergia() {
        return this.energia;
        }
    }