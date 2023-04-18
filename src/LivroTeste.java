public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O hobbit", 9.99);
        // meuLivro.nome = "O hobbit";
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora1 = new Editora();
        //editora1.nome = "Editora Erica";
        editora1.email = "edErica@gmai.com.br";
        meuLivro.setEditora(editora1);

        meuLivro.aplicarDesconto(0.5);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O Código Da Vinci",27.90);
        // livroFavorito.nome = "O Código Da Vinci";
        livroFavorito.setResumo("bla bla bla bla bla");
        livroFavorito.setPaginas(500);
        livroFavorito.setAutor("Dan Brown");
        livroFavorito.setTipoCapa(TipoCapaEnum.PERSONALIZADA);

        Editora editora2 = new Editora();
        //editora1.nome = "Editora Erica";
        editora2.email = "edErica@gmai.com.br";
        livroFavorito.setEditora(editora2);

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
