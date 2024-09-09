package www.unoplus.com.ao.gestaodedespesas.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import www.unoplus.com.ao.gestaodedespesas.model.Categoria;
import www.unoplus.com.ao.gestaodedespesas.model.Despesa;
import www.unoplus.com.ao.gestaodedespesas.model.Usuario;
import www.unoplus.com.ao.gestaodedespesas.utils.DatabaseUtil;

public class DespesaDAO {
    
    public void adicionarDespesa(Despesa despesa) {
        String sql = "INSERT INTO despesa (dataDespesa, valorDespesa, descricaoDespesa, id_usuario, id_categoria) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, despesa.getDataDespesa());
            stmt.setBigDecimal(2, despesa.getValorDespesa());
            stmt.setString(3, despesa.getDescricaoDespesa());
            stmt.setInt(4, despesa.getUsuario().getIdUsuario());
            stmt.setInt(5, despesa.getCategoria().getIdCategoria());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void editarDespesa(Despesa despesa) {
        String sql = "UPDATE despesa SET dataDespesa = ?, valorDespesa = ?, descricaoDespesa = ?, usuario_id = ?, categoria_id = ? WHERE idDespesa = ?;";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, despesa.getDataDespesa());
            stmt.setBigDecimal(2, despesa.getValorDespesa());
            stmt.setString(3, despesa.getDescricaoDespesa());
            stmt.setInt(4, despesa.getUsuario().getIdUsuario());
            stmt.setInt(5, despesa.getCategoria().getIdCategoria());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void removerDespesa(Despesa despesa) {
        String sql = "DELETE FROM despesa WHERE (idDespesa) VALUES (?)";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, despesa.getIdDespesa());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Despesa> listarDespesas() {
        List<Despesa> despesas = new ArrayList<>();
        String sql = "SELECT d.idDespesa, d.dataDespesa, d.valorDespesa, d.descricaoDespesa, " +
                    "u.idUsuario, u.nomeUsuario, c.idCategoria, c.nomeCategoria " +
                    "FROM despesa d " +
                    "JOIN usuario u ON d.id_usuario = u.idUsuario " +
                    "JOIN categoria c ON d.id_categoria = c.idCategoria";

        try (Connection conn = DatabaseUtil.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("idUsuario"), rs.getString("nomeUsuario"), null, null);
                Categoria categoria = new Categoria(rs.getInt("idCategoria"), rs.getString("nomeCategoria"));
                Despesa despesa = new Despesa(rs.getInt("idDespesa"), rs.getDate("dataDespesa"), 
                rs.getBigDecimal("valorDespesa"), rs.getString("descricaoDespesa"), usuario, categoria);
                despesas.add(despesa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return despesas;
    }
    
    public boolean existeDespesa(String data, BigDecimal valor, String descricao, Usuario usuario, Categoria categoria) {
        String sql = "SELECT COUNT(*) AS count FROM despesa WHERE data = ? AND valor = ? AND descricao = ? AND usuario_id = ? AND categoria_id = ?";
        try (Connection connect = DatabaseUtil.getConnection();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, data);
            stmt.setBigDecimal(2, valor);
            stmt.setString(3, descricao);
            stmt.setInt(4, usuario.getIdUsuario());
            stmt.setInt(5, categoria.getIdCategoria());
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
