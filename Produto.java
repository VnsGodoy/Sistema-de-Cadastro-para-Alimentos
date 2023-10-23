public class Produto {

    static int contador = 0;
    private String desc;
    private int id;
    private double valor;
    static public int amount;

    public Produto(String desc, double valor) {

        this.desc = desc;
            this.valor = valor;
                id = amount;

                    amount++;
    }

    public int getId() {

        return id;
    }

     public int getAmount() {

        return amount;
    }

    public double getValor() {
        
        return valor;
    }

    public String getDesc() {

        return desc;
    }


    public void setId(int id) {

        this.id = id;
    }

     public void setDesc(String desc) {

        this.desc = desc;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public String toString() {

        return "\n\t-> Produto: \n\n\t - Descricao: " + getDesc() + "; \n\t - Id: " + getId() + "; \n\t - Valor: " + getValor() + "; \n\t - Quantidade: "
                + getAmount() + "\n\t";
    }
}