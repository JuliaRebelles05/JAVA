public class Main {
    public static void main(String[] args) {
        // Criar um objeto para representar um cachorro
        Cachorro dogBelga = new Cachorro();

        //Atribuir valores aos atributos do objeto
        dogBelga.nome = "Thor";
        dogBelga.peso = 30;
        dogBelga.idade = 6;
        dogBelga.castrado = true;

        //Exibir os dados do objeto cachorro
        System.out.println(dogBelga.nome + ", tem " + dogBelga.idade + " anos " +
                " pesa " + dogBelga.peso + " Kg e é castrado? " + dogBelga.castrado);

        //Criar um outro objeto cachorro

        //Atribuir outros valores

        //Exibir os valores do outro objeto

        Cachorro dogViraLata = new Cachorro();

        dogViraLata.nome = "";
        dogViraLata.peso = 20;
        dogViraLata.idade = 15;
        dogViraLata.castrado = true;

        System.out.println(dogViraLata.nome + ", tem " + dogViraLata.idade + " anos" +
                " pesa " + dogViraLata.peso + " Kg e é castrado? " + dogViraLata.castrado);

        //Chamar os métodos
        dogViraLata.andar();
        dogBelga.andar();


    }
}