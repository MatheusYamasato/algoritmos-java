/*
    Programa para calcular a área de uma casa(e seus cômodos) de 3 cômodos:
    uma sala de 10x10m,
    um banheiro e um quarto de 5x7m cada
*/

class CasaRet {
    public static void main(
        String[] args) {
            float lateral = 10; // comprimento da lateral da cabana
            float cquarto = 7; // comprimento da lateral maior do quarto
            float areaq; // area quarto
            float areas; // area salas
            float areat; // area total
            // float x = 18.5F
            areas = lateral * lateral;
            System.out.println("A area total da sala é de " + areas);
            areaq = cquarto * (lateral/2);
            System.out.println("A area total do banheiro é de " + areaq);
            System.out.println("A area total do quarto é de " + areaq);
            areat = areas + 2*areaq;
            System.out.println("A area total da casa é de " + areat);
            
        }
}