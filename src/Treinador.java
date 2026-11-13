public class Treinador {

    // Atributos

    private String nomeTreinador;
    private int quantVitorias;
    private int quantDerrotas;
    private Pokemon pokemon;



    // Getters/Setters

    public String getNomeTreinador() {
        return nomeTreinador;
    }
    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }
    public int getQuantVitorias() {
        return quantVitorias;
    }
    public void setQuantVitorias(int quantVitorias) {
        this.quantVitorias = quantVitorias;
    }
    public int getQuantDerrotas() {
        return quantDerrotas;
    }
    public void setQuantDerrotas(int quantDerrotas) {
        this.quantDerrotas = quantDerrotas;
    }


    // métodos

    public Treinador(String nomeTreinador, Pokemon pokemon) {
        this.nomeTreinador = nomeTreinador;
        this.pokemon = pokemon;

        this.quantDerrotas = 0;
        this.quantVitorias = 0;
    }

    public void atacar(Treinador adversario) {
        this.pokemon.atacar(adversario.pokemon);
    }

    public void registrarVitoria() {
        this.quantVitorias++;
    }

    public void registrarDerrota() {
        this.quantDerrotas++;
    }

    public boolean pokemonFoiDerrotado() {
        return this.pokemon.getVida() <= 0;
    }

    public void TrainerStatus(){
        System.out.println("Treinador: " + this.getNomeTreinador());
        System.out.println("Vitórias: " + this.quantVitorias);
        System.out.println("Derrotas: " + this.quantDerrotas);

        System.out.println("Pokémon: " + pokemon.getNomePokemon());
        System.out.println("Tipo: " + pokemon.getTipo());
        System.out.println("Ataque: " + pokemon.getAtaque());
        System.out.println("Vida: " + pokemon.getVida());
    }


}
