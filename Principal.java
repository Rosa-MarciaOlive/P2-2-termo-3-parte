public class Principal {

    public static void  main(String[] args) {

        Veiculo v=new Veiculo();
        v.setAno(2022);
        v.setMarca("Fiat");
        v.setModelo("Completo Turb");

        Carro c=new Carro();
        c.setPlaca("CRR-12345");

        System.out.println(c.getPlaca());

    }   
}
