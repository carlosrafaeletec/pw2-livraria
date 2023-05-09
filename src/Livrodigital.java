public class LivroDigital extends Livro{

    private String marcaDAgua;

    public LivroDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    void aplicarDesconto(double percentual) {
        if (percentual > 0.15)
            System.out.println("Desconto não permitido");
        else
            super.aplicarDesconto(percentual);
    }

    @Override
    void exibirDados() {
        super.exibirDados();
        System.out.println("Marca DAgua: " + marcaDAgua);
    }

    public String getMarcaDAgua() {
        return marcaDAgua;
    }
    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }
}
