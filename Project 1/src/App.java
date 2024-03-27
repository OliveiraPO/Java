import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i = 1, erro = 1;
        System.out.println("    Calculadora     \n\n");
        Calculadora calc = new Calculadora(0f, 0f);
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("        MENU    \n\n1 SOMA - 2 SUBTRAÇÃO\n3 MULTIPLICAÇÃO - 4 DIVISÃO\n5 POTENCIAÇÃO - 6 FATORAÇÃO\n0 para encerrar!\n\n");
            System.out.println("Qual será a operação?\n");
            int operação = in.nextInt();
            if(operação!=1&&operação!=2&&operação!=3&&operação!=4&&operação!=5&&operação!=6&&operação!=0){
                System.out.println("Digite um numero válido!\n");
            }else{
                switch (operação) {
                    case 1:
                        do{
                            System.out.println("Digite o primeiro número:\n");
                            calc.setNum1(in.nextInt());
                            if(calc.getNum1() < 0 || calc.getNum1() > 50){
                                System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                            }else{
                                System.out.println("Digite o segundo número:\n");
                                calc.setNum2(in.nextInt());
                                if(calc.getNum2() < 0 || calc.getNum2() > 50){
                                    System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                                }else{
                                    System.out.println("O resultado é "+calc.Somar());
                                    erro=0;
                                }
                            }
                        }while(erro==1);
                    break;
                    case 2:
                        do{
                            System.out.println("Digite o primeiro número:\n");
                            calc.setNum1(in.nextInt());
                            if(calc.getNum1() < 0 || calc.getNum1() > 50){
                                System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                            }else{
                                System.out.println("Digite o segundo número:\n");
                                calc.setNum2(in.nextInt());
                                if(calc.getNum2() < 0 || calc.getNum2() > 50){
                                    System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                                }else{
                                    System.out.println("O resultado é "+calc.Subtrair());
                                    erro=0;
                                }
                            }
                        }while(erro==1);
                    break;
                    case 3:
                        do{
                        System.out.println("Digite o primeiro número:\n");
                            calc.setNum1(in.nextInt());
                            if(calc.getNum1() < 0 || calc.getNum1() > 50){
                                System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                            }else{
                                System.out.println("Digite o segundo número:\n");
                                calc.setNum2(in.nextInt());
                                if(calc.getNum2() < 0 || calc.getNum2() > 50){
                                    System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                                }else{
                                    System.out.println("O resultado é "+calc.Mult());
                                    erro=0;
                                }
                            }
                        }while(erro==1);
                    break;
                    case 4:
                        do{
                            System.out.println("Digite o primeiro número:\n");
                            calc.setNum1(in.nextInt());
                            if(calc.getNum1() < 0 || calc.getNum1() > 50){
                                System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                            }else{
                                System.out.println("Digite o segundo número:\n");
                                calc.setNum2(in.nextInt());
                                if(calc.getNum2() <= 0 || calc.getNum2() > 50){
                                    System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                                }else{
                                    System.out.println("O resultado é "+calc.Div());
                                    erro=0;
                                }
                            }
                        }while(erro==1);
                    break;
                    case 5:
                        do{
                            System.out.println("Digite o primeiro número:\n");
                            calc.setNum1(in.nextInt());
                            if(calc.getNum1() < 0 || calc.getNum1() > 50){
                                System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                            }else{
                                System.out.println("Digite o segundo número:\n");
                                calc.setNum2(in.nextInt());
                                if(calc.getNum2() <= 0 || calc.getNum2() > 50){
                                    System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                                }else{
                                    System.out.println("O resultado de "+ calc.getNum1()+"^"+ calc.getNum2()+" é "+calc.Pot());
                                    erro=0;
                                }
                            }
                        }while(erro==1);
                    break;
                    case 6:
                        do{
                            System.out.println("Digite o número para o fatorial:\n");
                            calc.setNum1(in.nextInt());
                            if(calc.getNum1() < 0 || calc.getNum1() > 50){
                                System.out.println("Digite numero maiores que 0 e menores que 50!\n");
                            }else{
                                    System.out.println("O resultado do fatorial de "+calc.getNum1()+" é "+calc.Fat());
                                    erro=0;
                                }
                            }while(erro==1);
                    break;
                    case 0:
                    System.out.println("Calculadora OFF\n");
                        i=0;
                    break;
                }
            }
        }while(i==1);
    }
}

//validadeção de email: return email.contains("@") && email.contains(".") && email.indezOf("@") < email.lastIndexOf(".");