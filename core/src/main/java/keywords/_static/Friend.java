package keywords._static;

class Friend {

    String name;
    static int numberOfFriends;

    // a criação de uma variável static faz com o que o valor dela seja referencia para todas as demais daquela classe
    // caso o static seja removido, cada variavel criada a partir desse objeto vai conter o valor da variavel que deveria ser static
    // com o static, só uma copia existe, e essa copia se aplica a toda a classe.

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have  "+numberOfFriends+" friends");
    }
}
