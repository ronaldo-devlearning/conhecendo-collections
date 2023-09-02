import map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws Exception {

        AgendaEventos agendaEventos = new AgendaEventos();
//      EstoqueProdutos estoque = new EstoqueProdutos();
//      AgendaContatosMap agendaContatosMap = new AgendaContatosMap();
//      AgendaContatos agendaContatos = new AgendaContatos();
//      CadastroProdutos cadastroProdutos = new CadastroProdutos();
//      ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
//      CatalogoLivros catalogoLivros = new CatalogoLivros();
//      ListaTarefa listaTarefa = new ListaTarefa();

//      System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

//      listaTarefa.adicionarTarefa("Tarefa 1");
//      listaTarefa.adicionarTarefa("Tarefa 1");
//      listaTarefa.adicionarTarefa("Tarefa 2");
//      listaTarefa.adicionarTarefa("Tarefa 3");
//      System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

//      listaTarefa.removerTarefa("Tarefa 3");
//      System.out.println("O número de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

//      listaTarefa.obterDescricoesTarefas();

//      catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
//      catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
//      catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
//      catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
//      catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

//      System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
//      System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
//      System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

//      OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

//      ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
//      ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
//      ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
//      ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

//      System.out.println(ordenacaoPessoa.ordenarPorIdade());
//      System.out.println(ordenacaoPessoa.ordenarPorAltura());

//      conjuntoConvidados.exibirConvidados();

//      conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
//      conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
//      conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
//      conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

//      conjuntoConvidados.exibirConvidados();
//      System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

//      conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
//      System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

//      conjuntoConvidados.exibirConvidados();

//      AgendaContatosMap.exibirContatos();


//      cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
//      cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
//      cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
//      cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

//      System.out.println(cadastroProdutos.exibirProdutosPorNome());

//      System.out.println(cadastroProdutos.exibirProdutosPorPreco());

//      agendaContatos.adicionarContato("Francisco da Silva", 123456);

//      agendaContatos.adicionarContato("Francisco de Souza", 5665);
//      agendaContatos.adicionarContato("Francisco da Costa", 5665);
//      agendaContatos.adicionarContato("Francisco Cavalcante", 1111111);
//      agendaContatos.adicionarContato("Francisco", 654987);
//      agendaContatos.adicionarContato("Paulo Pereira", 1111111);

//      agendaContatos.exibirContatos();

//      System.out.println(agendaContatos.pesquisarPorNome("Francisco da Costa"));

//      System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Francisco da Costa", 5555555));

//      agendaContatos.exibirContatos();

//      agendaContatosMap.adicionarContato("Francisco da Silva", 123456);
//      agendaContatosMap.adicionarContato("Francisco de Souza", 5665);
//      agendaContatosMap.adicionarContato("Francisco da Costa", 5665);
//      agendaContatosMap.adicionarContato("Francisco Cavalcante", 1111111);
//      agendaContatosMap.adicionarContato("Francisco", 654987);
//      agendaContatosMap.adicionarContato("Paulo Pereira", 1111111);

//      agendaContatosMap.exibirContatos();

//      agendaContatosMap.removerContato("Paulo Pereira");

//      agendaContatosMap.exibirContatos();

//      System.out.println("O número é: " + agendaContatosMap.pesquisarPorNome("Francisco"));

//      estoque.exibirProdutos();
//      estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
//      estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
//      estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
//      estoque.adicionarProduto(8L, "Produto D", 2, 20.0);

//      estoque.exibirProdutos();

//      System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

//      System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 14), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

}
