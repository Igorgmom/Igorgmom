package aula6_sistemaPedidos;

public class Client {
    private String idCliente;
    private String nome;
    private String email;
    private String telefone;
    private String userName;
    private String password;

    public Client(int idProduto, String nome, String descricao, float preco, int estoque) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.userName = userName;
        this.password = password;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


