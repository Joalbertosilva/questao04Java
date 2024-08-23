import entities.Categoria;
import entities.Produto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        novoProduto.setNome("Oculos de sol");
        novoProduto.setEstoque(30);
        novoProduto.setPreco(140.00);
        Categoria novaCategoria = new Categoria();
        novaCategoria.setTitulo("Acessorios");
        novoProduto.setCategoria(novaCategoria);
        System.out.println(novoProduto);
    }
}