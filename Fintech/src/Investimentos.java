public class Investimentos {
    private String tipoInvestimento;

    private String nomeAplicacao;

    private String nomeBanco;

    private double valorAplicacao;

    private String dataInvestimento; // dd/mm/aaaa

    private String dataVencimento; // dd/mm/aaaa


    // Construtor padrão

    public Investimentos() { }

    // Construtor com data de vencimento opcional

    public Investimentos(String tipoInvestimento, String nomeAplicacao, String nomeBanco, double valorAplicacao, String dataInvestimento) {

        this.tipoInvestimento = tipoInvestimento;

        this.nomeAplicacao = nomeAplicacao;

        this.nomeBanco = nomeBanco;

        this.valorAplicacao = valorAplicacao;

        this.dataInvestimento = dataInvestimento;

    }

    // Construtor com data de vencimento obrigatória

    public Investimentos(String tipoInvestimento, String nomeAplicacao, String nomeBanco, double valorAplicacao, String dataInvestimento, String dataVencimento) {

        this.tipoInvestimento = tipoInvestimento;

        this.nomeAplicacao = nomeAplicacao;

        this.nomeBanco = nomeBanco;

        this.valorAplicacao = valorAplicacao;

        this.dataInvestimento = dataInvestimento;

        this.dataVencimento = dataVencimento;

    }

    // Método

    public void investimento() {

        System.out.println("Seu investimento: " + nomeAplicacao + ", no valor de " + valorAplicacao + " reais, no banco " + nomeBanco + " foi cadastrado com sucesso!");

    }
}
