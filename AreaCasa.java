class AreaCasa {
    static void areaCasa(float lateral, float cquarto) {
        float areaq;
        float areas;
        float areat;
        System.out.println("Programa para calculo de area de casa");
        areas = lateral * lateral;
        System.out.println("A area total da sala é de " + areas);
        areaq = cquarto*(lateral/2);
        System.out.println("A area total do banheiro é de " + areaq);
        areat = areas + 2*areaq;
        System.out.println("A area total da casa é de " + areat);
    }
    static double areaPiscina(double raio) {
        return(Math.PI * Math.pow(raio, 2));
    }
    public static void main(String[] args) {
        double areap;    
        areaCasa(11, 7);
        areap = areaPiscina(2);
        System.out.println("A area total da piscina é de " + areap);
    }
}