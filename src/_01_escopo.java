public class _01_escopo {
    static String boasvindas= "ola seja bem vindo";
    public static void main(String[] args) {
        System.out.println(boasvindas);

        Pessoa p1= new Pessoa( "beltrano", 23, 1000);
        if (p1.renda == 1000){

            double aumento = p1.renda * 0.5;
            p1.renda = p1.renda+aumento;
            System.out.println("A renda de " + p1.nome + "É" + p1.renda);
        }

    }

    public static class Pessoa {

        String nome;

        int idade;

        double renda;

        public Pessoa (String nome, int idade, double renda){
            this.nome = nome;
            this.idade = idade;
            this.renda = renda;

        }
    }
}
