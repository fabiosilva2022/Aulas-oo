public class Sala {

    private String descricao;
    private String localizacao;
    private int cadeiras;
    private String tela;

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;

    }

    public String getLocalizacao(){
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public int getCadeiras(){
        return this.cadeiras;
    }

    public void setCadeiras(int cadeiras){
        this.cadeiras = cadeiras;
    }

    public String getTela(){
        return this.tela;
    }

    public void setTela(String tela){
        this.tela = tela;
    }
}
