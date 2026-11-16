
 public class Batalha {

        public void iniciarBatalha(Treinador desafiante,
                                   Treinador desafiado) {

            boolean turnoDesafiante = true;

            System.out.println("===== INICIO DA BATALHA =====");

            while (!desafiante.pokemonFoiDerrotado() &&
                    !desafiado.pokemonFoiDerrotado()) {

                if (turnoDesafiante) {

                    System.out.println("Turno de " + desafiante.getNomeTreinador());
                    System.out.println("---------------------");

                    desafiante.atacarAdversario(desafiado);

                } else {

                    System.out.println("Turno de " + desafiado.getNomeTreinador());
                    System.out.println("---------------------");

                    desafiado.atacarAdversario(desafiante);
                }

                turnoDesafiante = !turnoDesafiante;
            }

            if (desafiante.pokemonFoiDerrotado()) {

                desafiante.registrarDerrota();
                desafiado.registrarVitoria();

                System.out.println("===== RESULTADOS =====");
                System.out.println(desafiado.getNomeTreinador() +" venceu!");

            } else {

                desafiado.registrarDerrota();
                desafiante.registrarVitoria();

                System.out.println("---------------------");
                System.out.println(desafiante.getNomeTreinador() +" venceu!");
            }

            System.out.println("---------------------");
            System.out.println("===== FIM DA BATALHA =====");
        }
    }
