public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Jessica Felix");

        Livro livro = new Livro();
        livro.setTitulo("Java for Beginners");
        livro.setGenero("Tecnologia");
        livro.setAutorPrincipal(autor);

        Usuario usuario = new Usuario();
        usuario.setNome("Lucas Rafael");
        usuario.setIdade(25);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        emprestimo.setDataRetirada(LocalDate.now());
        emprestimo.setDataDevolucao(LocalDate.now());

        livro.adicionarEmprestimo(emprestimo);
        usuario.adicionarEmprestimo(emprestimo);

        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
            System.out.println("Livro: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutorPrincipal().getNome());
            System.out.println("Genero: " + livro.getGenero());
            System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
            System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
            System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
            System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
        }
    }