package aula19_03_24;



public class MediaAritimetica {
    public static void main(String[] args) {
    /*Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
    A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
    
    (7+5+6)/3=18/3=6
                   + = 11
    (4+5+6)/3=15/3=6
    */
   
    //variaves da primeira media 7 5 6
    int num7 = 7;
    int num5 = 5;
    int num6 = 6;
    
    int media1 = (num7+num6+num5)/3;
    
    //variaveis da segunda media 4 5 6
    int num4 = 4;
    num5 = 5;
    num6 = 6;
    
    int media2=(num4+num5+num6)/3;
    
    //media das medias
    int medias=(media1+media2)/2;
    System.out.println("MEDIA ARITIMETICA"
            +"\nA media dos numeros 7,5 e 6 é: "+ media1 
            +"\nA media dos numeros 4,5 e 6 é: "+ media2
            +"\nA media das medias é: "+ medias);
    
    }
    
}
