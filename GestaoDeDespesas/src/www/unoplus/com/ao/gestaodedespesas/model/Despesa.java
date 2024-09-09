package www.unoplus.com.ao.gestaodedespesas.model;
import java.math.BigDecimal;
import java.sql.Date;

public class Despesa {
    private int idDespesa;
    private Date dataDespesa;
    private BigDecimal valorDespesa;
    private String descricaoDespesa;
    private Usuario usuario;
    private Categoria categoria;

    public Despesa(int idDespesa, Date dataDespesa, BigDecimal valorDespesa, String descricaoDespesa, Usuario usuario, Categoria categoria) {
        this.idDespesa = idDespesa;
        this.dataDespesa = dataDespesa;
        this.valorDespesa = valorDespesa;
        this.descricaoDespesa = descricaoDespesa;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public int getIdDespesa() { return idDespesa; }
    public void setIdDespesa(int idDespesa) { this.idDespesa = idDespesa; }

    public Date getDataDespesa() { return dataDespesa; }
    public void setDataDespesa(Date dataDespesa) { this.dataDespesa = dataDespesa; }

    public BigDecimal getValorDespesa() { return valorDespesa; }
    public void setValorDespesa(BigDecimal valorDespesa) { this.valorDespesa = valorDespesa; }

    public String getDescricaoDespesa() { return descricaoDespesa; }
    public void setDescricaoDespesa(String descricaoDespesa) { this.descricaoDespesa = descricaoDespesa; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
