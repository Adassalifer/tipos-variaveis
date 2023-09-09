public class Operadores {
    public static void main(String[] args){
        String nomeCompleto = "linguagem" + "java";
        System.out.print(nomeCompleto);

            int a = 30;
            int b = 5;
            int c = 10;
            int total = (a + b + c) / 10;
            System.out.println("O resultado = "+total);
    int idade = 16;
    if(idade <= 16){
      System.out.println("É menor de idade");

      int estoque =  2; 
      //valor recuperado do sistema

if (estoque >= 100) {
	System.out.println("Produto com quantidade suficiente.");
} else if (estoque < 100 && estoque > 50) {
	System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
} else {
	System.out.println("ATENÇÃO! Faça um novo pedido.");
}
//Operadores relacionais
int desafioUm = 5;
System.out.println(desafioUm  += ++desafioUm );

int desafioDois = 5;
System.out.println(desafioDois  += desafioDois++);

int valorA = 1;
int valorB = 2;

if (valorA > valorB) {
                System.out.println("maior");
}

if (valorA >= valorB) {
                System.out.println("maior ou igual");
}

if (valorA < valorB) {
                System.out.println("menor");
}

if (valorA <= valorB) {
                System.out.println("menor ou igual");
}
    }
  }
}
