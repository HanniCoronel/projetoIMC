public class ProjetoImc {
    public static void main(String[] args){

        //declarando variaveis
        String nome = "Jorge Silva";
        int idade = 30;
        double altura = 1.70;
        double peso = 70.0;
        boolean ativo = true;

        //calculando IMC
        double imc = peso / (altura * altura);

        //Exibindo os dados
        System.out.println("==== Cadastro Pesoal ====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Cadastro ativo: " + ativo);

        //Verificando maioridade
        if (idade >= 18){
            System.out.println("Status: Maior de idade");
        } else {
            System.out.println("Status: Menor de idade");
        }

    }

}
