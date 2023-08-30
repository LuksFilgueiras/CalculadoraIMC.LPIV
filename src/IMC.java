import java.util.Arrays;

public class IMC
{

    private double peso;
    private double altura;
    private boolean masculino;


    public IMC(double peso, double altura, boolean masculino){
        this.peso = peso;
        this.altura = altura;
        this.masculino = masculino;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double value){
        peso = value;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double value){
        altura = value;
    }
    public boolean getSexo(){
        return masculino;
    }
    public void setSexo(boolean value){
        masculino = value;
    }

    public String CalcularImc(){
        double imc = peso / Math.pow(altura, 2);


        String condicoes[] = {"abaixo do peso", "normal", "pouco acima do peso", "acima do peso", "obeso"};
        String condicaoDoPaciente = "base";

        double valorImcMulheres[] = {19.1f, 25.8, 27.3f, 32.3f, Float.POSITIVE_INFINITY};
        double valorImcHomens[] = {20.7f, 26.4f, 27.8f, 31.1f, Float.POSITIVE_INFINITY};

        int index = 0;

        while(index < condicoes.length){
            if(masculino) {
                if(imc < valorImcHomens[index]){
                    condicaoDoPaciente = condicoes[index];
                    index = condicoes.length;
                }
            }else{
                if(imc < valorImcMulheres[index]){
                    condicaoDoPaciente = condicoes[index];
                    index = condicoes.length;
                }
            }

            index++;
        }

        return condicaoDoPaciente;
    }
}



//Requisitos:
//Deve construir uma única classe chamada Imc
//Deve ter um único método chamado calcularImc
//Construir métodos de get/set
//Não deve ter entrada de dados
//Não pode exibir nada em console