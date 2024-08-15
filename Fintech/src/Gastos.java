public class Gastos {
    private double valorGasto;

    private String dataGasto; // dd/mm/aaaa

    private String categoria;

    private String descricaoGasto;


    // Construtor padrão

    public Gastos() { }

    // Construtor com descrição opcional

    public Gastos(double valorGasto, String dataGasto, String categoria) {

        this.valorGasto = valorGasto;

        this.dataGasto = dataGasto;

        this.categoria = categoria;

    }

    // Construtor com descrição obrigatória

    public Gastos(double valorGasto, String dataGasto, String categoria, String descricaoGasto) {

        this.valorGasto = valorGasto;

        this.dataGasto = dataGasto;

        this.categoria = categoria;

        this.descricaoGasto = descricaoGasto;

    }

    // Método

    public void gasto() {

        System.out.println("Seu gasto no valor de: " + valorGasto + " reais, foi cadastrado com sucesso!");

    }
}
