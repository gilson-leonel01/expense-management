package www.unoplus.com.ao.gestaodedespesas.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import www.unoplus.com.ao.gestaodedespesas.dao.DespesaDAO;
import www.unoplus.com.ao.gestaodedespesas.model.Categoria;
import www.unoplus.com.ao.gestaodedespesas.model.Despesa;
import www.unoplus.com.ao.gestaodedespesas.model.Usuario;
import www.unoplus.com.ao.gestaodedespesas.utils.DataFormatUtil;

public class DespesaController {
    private DespesaDAO despesaDAO;
    DataFormatUtil dftu = new DataFormatUtil();
    
    public DespesaController() {
        this.despesaDAO = new DespesaDAO();
    }

    public void adicionarDespesa(String data, BigDecimal valor, String descricao, Usuario usuario, Categoria categoria) throws ParseException {
        if (despesaDAO.existeDespesa(data, valor, descricao, usuario, categoria)) {
            JOptionPane.showMessageDialog(null, "Despesa já existe");
            return; 
        }

        Despesa despesa = new Despesa(0, dftu.formatarDataDiaMesAno(data), valor, descricao, usuario, categoria);
        despesaDAO.adicionarDespesa(despesa);
        JOptionPane.showMessageDialog(null, "Despesa adicionada com sucesso");
    }
    
    public void removerDespesa(String data, BigDecimal valor, String descricao, Usuario usuario, Categoria categoria) throws ParseException {
        if (!despesaDAO.existeDespesa(data, valor, descricao, usuario, categoria)) {
            JOptionPane.showMessageDialog(null, "Despesa não encontrada");
            return; 
        }

        Despesa despesa = new Despesa(0, dftu.formatarDataDiaMesAno(data), valor, descricao, usuario, categoria);
        despesaDAO.removerDespesa(despesa);
        JOptionPane.showMessageDialog(null, "Despesa removida com sucesso");
    }

    
    public void listarDespesas() {
        List<Despesa> despesas = despesaDAO.listarDespesas();
        for (Despesa despesa : despesas) {
            System.out.println(despesa.getDescricaoDespesa() + " - " + despesa.getValorDespesa() + 
                               " (Categoria: " + despesa.getCategoria().getNomeCategoria() + ")");
        }
    }
}
