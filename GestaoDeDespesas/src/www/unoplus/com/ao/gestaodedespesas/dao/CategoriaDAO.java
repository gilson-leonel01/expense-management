package www.unoplus.com.ao.gestaodedespesas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import www.unoplus.com.ao.gestaodedespesas.model.Categoria;
import www.unoplus.com.ao.gestaodedespesas.utils.DatabaseUtil;

public class CategoriaDAO {
    public void adicionarCategoria(Categoria categoria) {
        String sql = "INSERT INTO categoria (nomeCategoria) VALUES (?)";
        try (Connection connect = DatabaseUtil.getConnection();
            PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void editarCategoria(Categoria categoria) {
        String sql = "ALTER FROM categoria WHERE (nomeCategoria) VALUES (?)";
        try (Connection connect = DatabaseUtil.getConnection();
            PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void removerCategoria(Categoria categoria) {
        String sql = "DELETE FROM categoria WHERE (nomeCategoria) VALUES (?)";
        try (Connection connect = DatabaseUtil.getConnection();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Categoria buscarCategoriaPorNome(String nome) {
        String sql = "SELECT * FROM categoria WHERE nomeCategoria = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Categoria(rs.getInt("idCategoria"), rs.getString("nomeCategoria"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Categoria> listarCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria";
        try (Connection conn = DatabaseUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                Categoria categoria = new Categoria(rs.getInt("idCategoria"), rs.getString("nomeCategoria"));
                categorias.add(categoria);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categorias;
    }
    
    public boolean existeCategoria(String nomeCategoria) {
    String sql = "SELECT COUNT(*) AS count FROM categoria WHERE nomeCategoria = ?";
        try (Connection connect = DatabaseUtil.getConnection();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, nomeCategoria);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }
}
