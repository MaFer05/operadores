public class Operadores {
    public static void main(String[] args){
         int num = 6;

         String msg = ((num % 2) == 0) ? "Número par" : "Número ímpar";

        if ((num % 2) == 0) {
            msg = "Número par"
        } else {
            msg = "Número ímpar";0
        }
         System.out.println(msg);

         // String mag =  ((num > 10) && (num <  100)) ? "Número maior que 10 e menor que 100" : "Número menor ou igual á 10 ou maior que 100";
    }
}