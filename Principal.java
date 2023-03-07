import java.net.SocketTimeoutException;

public class Principal {

    public static void main(String[] args) {
        
        Filme filme1 = new Filme();
        filme1.setTitulacao("Era do Camelo Doido");
        filme1.setDuracao(122);
        filme1.setAno(2023);
        filme1.setSinopse("O Camelo que ataca as pessoas...");


        System.out.println(filme1.getTitulacao());
        System.out.println(filme1.getDuracao());
        System.out.println(filme1.getAno());
        System.out.println(filme1.getSinopse());

    }
    
}
