package www.unoplus.com.ao.gestaodedespesas.controller;

import java.util.List;
import www.unoplus.com.ao.gestaodedespesas.dao.UsuarioDAO;
import www.unoplus.com.ao.gestaodedespesas.model.Usuario;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void adicionarUsuario(int id, String nome, String email, String senha) {
        Usuario usuario = new Usuario(id, nome, email, senha);
        usuarioDAO.adicionarUsuario(usuario);
    }

    public void listarUsuarios() {
        List<Usuario> usuarios = usuarioDAO.listarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNomeUsuario() + " - " + usuario.getEmailUsuario() + 
                               " (Usuario: " + usuario.getNomeUsuario() + ")");
        }
    }
}
