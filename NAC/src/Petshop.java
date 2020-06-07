package nac;
public class Petshop extends Animal{
    //atributo
    private float total;
    //metodos
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Porte: " + this.getPorte());
        System.out.println("Total: " + this.getTotal());
        System.out.println("-----------------------------");
    }
    public void examinar(){
        setTotal(getTotal() + 70);
    }
    public void banhar(){
        if(getPorte().equalsIgnoreCase("pequeno")){
            setTotal(getTotal() + 40);
        }else if (getPorte().equalsIgnoreCase("medio")){
            setTotal(getTotal() + 50);
        }else if (getPorte().equalsIgnoreCase("grande")){
            setTotal(getTotal() + 60);
        }else{
            System.out.println("Porte InvÃ¡lido");
        }
    }
    
    public void vacinar(){
        if("cachorro".equalsIgnoreCase(getTipo()) || "gato".equalsIgnoreCase(getTipo())){
            setTotal(getTotal() + 100);
        }else{
            setTotal(getTotal() + 150);
        } 
    }
 
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
