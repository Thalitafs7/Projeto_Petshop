package nac;
public class NAC {
    public static void main(String[] args) {
         Petshop a1 = new Petshop();
        a1.setNome("Bethoven");
        a1.setTipo("cachorro");
        a1.setPorte("medio");
        a1.examinar();
        a1.banhar();
        a1.vacinar();
        a1.status();
        
        Petshop a2 = new Petshop();
        a2.setNome("Robson Gustavo");
        a2.setTipo("gato");
        a2.setPorte("Pequeno");
        a2.examinar();
        a2.banhar();
        a2.status();
        
        Petshop a3 = new Petshop();
        a3.setNome("Vilma");
        a3.setTipo("papagaio");
        a3.setPorte("grande");
        a3.examinar();
        a3.vacinar();
        a3.status();
        
        Petshop a4 = new Petshop();
        a4.setNome("Belinha");
        a4.setTipo("hamister");
        a4.setPorte("grande");
        a4.examinar();
        a4.vacinar();
        a4.status();
        
        Petshop a5 = new Petshop();
        a5.setNome("Chocolate");
        a5.setTipo("cachorro");
        a5.setPorte("pequeno");
        a5.vacinar();
        a5.banhar();
        a5.status();
    }
    
}
