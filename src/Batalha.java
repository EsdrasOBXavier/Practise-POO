
 public class Batalha {

        public void iniciarBatalha(Treinador treinador1,
                                   Treinador treinador2) {

            boolean turnoTreinador1 = true;

            System.out.println("===== INICIO DA BATALHA =====");

            while (!treinador1.pokemonFoiDerrotado() &&
                    !treinador2.pokemonFoiDerrotado()) {

                if (turnoTreinador1) {

                    System.out.println("\nTurno de " + treinador1.getNomeTreinador());
                    System.out.println("---------------------");

                    treinador1.atacar(treinador2);

                } else {

                    System.out.println("\nTurno de " + treinador2.getNomeTreinador());
                    System.out.println("---------------------");

                    treinador2.atacar(treinador1);
                }

                turnoTreinador1 = !turnoTreinador1;
            }

            if (treinador1.pokemonFoiDerrotado()) {

                treinador1.registrarDerrota();
                treinador2.registrarVitoria();

                System.out.println("---------------------");
                System.out.println(treinador2.getNomeTreinador() +" venceu!");

            } else {

                treinador2.registrarDerrota();
                treinador1.registrarVitoria();

                System.out.println("---------------------");
                System.out.println(treinador1.getNomeTreinador() +" venceu!");
            }

            System.out.println("---------------------");
            System.out.println("===== FIM DA BATALHA =====");
        }
    }
