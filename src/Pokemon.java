public class Pokemon {

    private String nomePokemon;
    private String tipo;
    private String tipo2;
    private int ataque;
    private int vida;
    private int vidaMaxima;

    public Pokemon(String nome, String tipo, String tipo2, int ataque, int vida, int vidaMaxima) {
        this.nomePokemon = nome;
        this.tipo = tipo;
        this.tipo2= tipo2;
        this.ataque = ataque;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
    }

    public String getNomePokemon() {
        return nomePokemon;
    }
    public void setNomePokemon(String nome) {
        this.nomePokemon = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVidaMaxima(){
        return vidaMaxima;
    }
    public void setVidaMaxima(int vidaMaxima){
        this.vidaMaxima = vidaMaxima;
    }

    public void atacar(Pokemon alvo) {

        System.out.println(this.nomePokemon + " está atacando!");

        alvo.receberDano(this.ataque);
    }

    public void receberDano(int dano) {

        this.vida -= dano;

        if (this.vida < 0) {
            this.vida = 0;
        }

        System.out.println(this.nomePokemon + " recebeu " + dano + " de dano!");
        System.out.println("Vida restante: " + this.vida);
        System.out.println("---------------------");

        if (this.vida == 0) {
            System.out.println(this.nomePokemon + " foi derrotado!");
        }
    }

   public void PokemonStatus(){
       System.out.println("---------------------");
       System.out.println("Nome: " + this.getNomePokemon());
       System.out.println("Vida total deste pokemon: " + this.getVidaMaxima());
       System.out.println("Vida restante deste pokemon: " + this.getVida());
       System.out.println("Ataque deste pokemon: " + this.getAtaque());
       System.out.println("---------------------");

   }


}
