package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public Integer getPontos() {
        Integer totalPontos;
        Integer pontoVitorias = vitorias * 3;

        return totalPontos = pontoVitorias + empates;
    }

    public Integer getTotalPartidas() {
        Integer totalPartidas;

        return totalPartidas = vitorias + empates + derrotas;
    }

    public Integer getAproveitamento() {
        //Retorna o percentual de vitórias em relação ao total de partidas disputadas.
        Integer perceptualV;
        perceptualV = (vitorias * 100)/getTotalPartidas();

        return perceptualV;
    }

    public void compararAproveitamento(Time adversario) {
        if (getAproveitamento() > adversario.getAproveitamento()) {
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(nome, adversario.nome));
        } else if (getAproveitamento() < adversario.getAproveitamento()) {
            System.out.println("O time %s tem um aproveitamento maior que o time %s".formatted(adversario.nome, nome));
        } else {
            System.out.println("Os times %s e %s tem o mesmo aproveitamento".formatted(nome, adversario.nome));
        }
    }

    public void exibirInformacoes() {
        var texto = """
                Time: %s
                Vitórias: %d
                Empates: %d
                Derrotas: %d

                Pontos: %d
                Total de Partidas: %d
                Aproveitamento: %d%%
                    """.formatted(
                nome,
                vitorias,
                empates,
                derrotas,
                getPontos(),
                getTotalPartidas(),
                getAproveitamento());

        System.out.println(texto);
    }
}