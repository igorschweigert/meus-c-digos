/**
 * @author : Igor Willms Schweigert
 * @version : 1.0
 * Data : 02/03/2026
 */

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Funciona");

        //inteiros
        byte numeroPequeno = 123; // -128 a 127
        short numeroShort = 12345; // -32,767 a 32,767
        int numeroInt = 1234567890; // -2,147,483,648 a 2,147,483,647
        long numeroLong = 1234567890123456789L; // -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

              System.out.println(  numeroPequeno);
              System.out.println(numeroShort);
              System.out.println(numeroInt);
              System.out.println(numeroLong);  
        
        //flutuantes
        float numeroFloat = 3.14f; // 6-7 dígitos de precisão
        double numeroDouble = 3.141592653589793; // 15-16 dígitos de precisão

              System.out.println(numeroFloat);
              System.out.println(numeroDouble);   
        
        //variavel do tipo  caractere      
        char caractere = 'w'; // um único caractere entre aspas simples
              
              System.out.println(caractere);

        //vsriavel do tipo falso ou verdadeiro
        boolean estou_com_fome = true; // pode ser true ou false
                
              System.out.println(estou_com_fome);

        //variavel do tipo texto
        String texto = "Olá, mundo!";   //pode conter textos longos.(entre aspas duplas"")
                
              System.out.println(texto);

              
    }
}