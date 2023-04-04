public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O hobbit", 9.99);
        // meuLivro.nome = "O hobbit";
        meuLivro.paginas = 521;
        meuLivro.resumo = "bla bla bla bla bla";
        meuLivro.autor = "J. R. Tolkien";

        Editora editora1 = new Editora();
        //editora1.nome = "Editora Erica";
        editora1.email = "edErica@gmai.com.br";
        meuLivro.editora = editora1;

        meuLivro.aplicarDesconto(0.1);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O Código Da Vinci",27.90);
        // livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.resumo = "bla bla bla bla bla";
        livroFavorito.paginas = 500;
        livroFavorito.autor = "Dan Brown";

        Editora editora2 = new Editora();
        //editora1.nome = "Editora Erica";
        editora2.email = "edErica@gmai.com.br";
        livroFavorito.editora = editora2;

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
