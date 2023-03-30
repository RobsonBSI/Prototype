public class Cliente implements Cloneable{
    private int id;
    private String nome;
    private Endereco endereco;
    private String telefone;
    public Cliente(int id, String nome, Endereco endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone= telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public Cliente clone() throws CloneNotSupportedException {
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.endereco = (Endereco) clienteClone.endereco.clone();
        return clienteClone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ",nome='" + nome + '\'' +
                ",endereco=" + endereco +
                ",telefone='" + telefone + '\'' +
                '}';
    }
}
