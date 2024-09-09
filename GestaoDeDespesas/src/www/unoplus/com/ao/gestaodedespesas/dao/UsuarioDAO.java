package www.unoplus.com.ao.gestaodedespesas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import www.unoplus.com.ao.gestaodedespesas.model.Usuario;
import www.unoplus.com.ao.gestaodedespesas.utils.DatabaseUtil;

public class UsuarioDAO {

    public void adicionarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nomeUsuario, emailUsuario, senhaUsuario) VALUES (?)";
        try (Connection connect = DatabaseUtil.getConnection();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getSenhaUsuario());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void editarUsuario(Usuario usuario) {
        String sql = "ALTER FROM usuario WHERE (nomeUsuario, emailUsuario, senhaUsuario) VALUES (?)";
        try (Connection connect = DatabaseUtil.getConnection();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.setString(2, usuario.getEmailUsuario());
            stmt.setString(3, usuario.getSenhaUsuario());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void removerUsuario(Usuario usuario) {
        String sql = "DELEE FROM usuario WHERE (nomeUsuario, emailUsuario, senhaUsuario) VALUES (?)";
        try (Connection connect = DatabaseUtil.getConnection();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNomeUsuario());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Usuario buscarUsuarioPorNome(String nome) {
        String sql = "SELECT * FROM usuario WHERE nomeUsuario = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(rs.getInt("idUsuario"), rs.getString("nomeUsuario"), rs.getString("emailUsuario"), rs.getString("senhaUsuario"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Usuario buscarUsuarioPorEmail(String email) {
        String sql = "SELECT * FROM usuario WHERE emailUsuario = ?";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(rs.getInt("idUsuario"), rs.getString("nomeUsuario"), rs.getString("emailUsuario"), rs.getString("senhaUsuario"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getInt("idUsuario"), rs.getString("nomeUsuario"), rs.getString("emailUsuario"), rs.getString("senhaUsuario"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
