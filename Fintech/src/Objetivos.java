public class Objetivos {
    private String nomeObjetivo;

    private double valorObjetivo;

    private String dataObjetivo; // dd/mm/aaaa

    private String descricaoObjetivo;


    // Construtor padrão

    public Objetivos() { }

    // Construtor com descrição opcional

    public Objetivos(String nomeObjetivo, double valorObjetivo, String dataObjetivo) {

        this.nomeObjetivo = nomeObjetivo;

        this.valorObjetivo = valorObjetivo;

        this.dataObjetivo = dataObjetivo;

    }

    // Construtor com descrição obrigatória

    public Objetivos(String nomeObjetivo, double valorObjetivo, String dataObjetivo, String descricaoObjetivo) {

        this.nomeObjetivo = nomeObjetivo;

        this.valorObjetivo = valorObjetivo;

        this.dataObjetivo = dataObjetivo;

        this.descricaoObjetivo = descricaoObjetivo;

    }

    // Método

    public void objetivo() {

        System.out.println("Seu objetivo: " + nomeObjetivo + ", que necessita de " + valorObjetivo + " reais, foi cadastrado com sucesso!");

    }
}
