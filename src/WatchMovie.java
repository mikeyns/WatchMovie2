public class WatchMovie {
    public static void main(String[] args) {
        double precoIngresso = 12.0; // Preço do ingresso
        int classificacaoFilme = 5; // Classificação do filme

        if (precoIngresso >= 12.0) {
            if (classificacaoFilme == 5) {
                System.out.println("Estou interessado em assistir o filme.");
            } else {
                System.out.println("Não estou interessado em assistir o filme.");
            }
        } else {
            System.out.println("Não estou interessado em assistir o filme.");
        }
    }
}