import java.util.Calendar;

public class Perecivel extends Produto {

    private int[] validity = new int[3];

    public Perecivel(String desc, double valor, int[] validity) {

        super(desc, valor);
            this.validity = validity;

    }

    public boolean Expired() {

        Calendar today = Calendar.getInstance();

            int day = today.get(Calendar.DAY_OF_MONTH);
                int month = today.get(Calendar.MONTH) + 1;
                    int year = today.get(Calendar.YEAR);

        
                    int ValidDays = day + month*30 + year*365; // Calcula os dias totais do dia atual
                        int AllValidDays = validity[0] + validity[1]*30 + validity[2]*365; // Calcula os dias totais do dia de validade

        if (AllValidDays < ValidDays) { // Se o total da validade for menor que o dia atual, o produto está vencido
            
            return true;
        }

            return false;
    }

    public void Discount (double percentage) {

        super.setValor(super.getValor() * (100 - percentage) /100);

    }

    @Override
    public String toString() {

        return super.getDesc() + " \n\t-> Valor: " + super.getValor() + "\n\t -> Validade: " + validity[0] + "/"
                + validity[1] + "/" + validity[2];

    }
}