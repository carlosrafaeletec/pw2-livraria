import java.util.IllegalFormatCodePointException;

public class Livro {
    // Encapsulamento = deixar atributos e métodos como privados
    private String nome;
    private String resumo;
    private double preco;
    private int paginas;
    private String autor;
    private Editora editora;
    private TipoCapaEnum tipoCapa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if (paginas <= 0)
            System.out.println("Páginas Inválidas");
        else
            this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public Livro(String nome, double preco) {
        this.nome = nome; // this é referencia aos atributos
        this.preco = preco;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preço: " + preco);
        System.out.println("Páginas: " + paginas);
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de capa: " + tipoCapa);
        if (temEditora())
            System.out.println("Editora: " + editora.nome);
        System.out.println("-------");
    }

    void aplicarDesconto(double percentual) {
        if (percentual > 0.3){
            System.out.println("Desconto não permitido");
        }
        else {
            preco = preco - (preco * percentual);
        }
    }

    boolean temEditora() {
        if (editora == null) {
            return false;
        }
        else{
            return true;
        }
    }
}
