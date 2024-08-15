public class Login {
    private String nomeCompleto;

    private String senha;

    private String dataNascimento; // dd/mm/aaaa

    private char genero;

    private String email;


    // Construtor padrão

    public Login() { }

    // Construtor com parâmetros

    public Login(String nomeCompleto, String senha, String dataNascimento, char genero, String email) {

        this.nomeCompleto = nomeCompleto;

        this.senha = senha;

        this.dataNascimento = dataNascimento;

        this.genero = genero;

        this.email = email;
    }



    // Método

    public void login() {

        System.out.println("Olá " + nomeCompleto + ", seu login foi realizado com sucesso!");

    }

}