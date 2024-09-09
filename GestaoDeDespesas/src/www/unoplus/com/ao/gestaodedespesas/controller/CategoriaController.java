package www.unoplus.com.ao.gestaodedespesas.controller;

import java.util.List;
import javax.swing.JOptionPane;
import www.unoplus.com.ao.gestaodedespesas.dao.CategoriaDAO;
import www.unoplus.com.ao.gestaodedespesas.model.Categoria;

public class CategoriaController {
    private CategoriaDAO categoriaDAO;

    public CategoriaController() {
        this.categoriaDAO = new CategoriaDAO();
    }

    public void adicionarCategoria(int idCategoria, String nomeCategoria) {
        if (categoriaDAO.existeCategoria(nomeCategoria)) {
            JOptionPane.showMessageDialog(null, "Categoria já existe");
            return; 
        }
    
        Categoria categoria = new Categoria(0, nomeCategoria);
        categoriaDAO.adicionarCategoria(categoria);
        JOptionPane.showMessageDialog(null, "Categoria adicionada com sucesso");
    }

    
    public void editarCategoria(int idCategoria, String nomeCategoria) {
        Categoria categoria = new Categoria(0, nomeCategoria);
        categoriaDAO.editarCategoria(categoria);
    }
    
    public void removerCategoria(int idCategoria, String nomeCategoria) {
        if (!categoriaDAO.existeCategoria(nomeCategoria)) {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada");
            return; 
        }

        Categoria categoria = new Categoria(0, nomeCategoria);
        categoriaDAO.removerCategoria(categoria);
    }

    
    public void buscarCategoria(int idCategoria, String nomeCategoria) {
        Categoria categoria = new Categoria(0, nomeCategoria);
        categoriaDAO.buscarCategoriaPorNome(categoria.getNomeCategoria());
    }
    
    public void listarCategorias() {
        List<Categoria> categorias = categoriaDAO.listarCategorias();
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getIdCategoria() + " - " + categoria.getNomeCategoria() + 
                               " (Categoria: " + categoria.getNomeCategoria() + ")");
        }
    }
}
