public class Ganhos {
    private double valorGanho;

    private String dataGanho; // dd/mm/aaaa

    private String descricaoGanho;


    // Construtor padrão

    public Ganhos() { }

    // Construtor com descrição opcional

    public Ganhos(double valorGanho, String dataGanho) {

        this.valorGanho = valorGanho;

        this.dataGanho = dataGanho;

    }

    // Construtor com descrição obrigatória

    public Ganhos(double valorGanho, String dataGanho, String descricaoGanho) {

        this.valorGanho = valorGanho;

        this.dataGanho = dataGanho;

        this.descricaoGanho = descricaoGanho;
    }


    // Método

    public void ganho() {

        System.out.println("Seu ganho no valor de: " + valorGanho + " reais, foi cadastrado com sucesso!");

    }
}

