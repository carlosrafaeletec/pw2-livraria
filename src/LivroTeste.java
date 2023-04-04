public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro();
        meuLivro.nome = "O Hobbit";
        meuLivro.preco = 50.99;
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora();
        editora1.nome = "Editora Erica";
        editora1.email = "edErica@gmai.com.br";
        meuLivro.editora = editora1;

        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.preco = 36.99;
        livroFavorito.autor = "Dan Brown";

        livroFavorito.editora = editora1;

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
