//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pokemon pikachu = new Pokemon("Pikachu", "Eletrico", "Eletrico" ,
            50, 100, 100);

    Pokemon charizard = new Pokemon("Charizard", "Fogo", "Voador",
            70, 110, 110);

    Treinador t1 = new Treinador("OCabaLá", pikachu);

    Treinador t2 = new Treinador("OtoCabaLá", charizard);

    Batalha batalha = new Batalha();

    batalha.iniciarBatalha(t1, t2);



    t1.TrainerStatus();
    System.out.println("---------------------");

    t2.TrainerStatus();

    charizard.PokemonStatus();

    t2.TrainerPokemonStatus();
    }

