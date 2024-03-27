public class Calculadora{
    private float num1;
    private float num2;

    public Calculadora(float num1,float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float Somar(){
        return num1+num2;
    }

    public float Subtrair(){
        return num1-num2;
    }

    public float Mult(){
        return num1*num2;
    }

    public float Div(){
        return (num1/num2);
    }

    public float Pot(){
        int resultado = 1;
        for(int i=0;i<num2;++i){
            resultado*=num1;
    }
    return resultado;
    }

    public double Fat(){
        int resultado = 1;
        for(int i=1;i<=num1;i++){
            resultado *= i;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
    }
    
}
