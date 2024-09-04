package teste;

public class hello {
	public static void main(String[] args) {
       int indice = 13;	//indice (contador) até 13
       int soma = 0;	//soma inicia o contador com zero
       int k = 0;		// k iniciar o contador com zero
       
       //enquanto o valor de k for menor que o valor do indice...
       while (k < indice) {
    	   k = k + 1 ;
    	   soma = soma + k;
       }
       
       /*
       k = 1
       soma = 0 + 1(k)
       soma = 1
       
       k = 2
       soma = 1 + 2(k)
       soma = 3
       
       k = 3
       soma = 3 + 3(k)
       soma = 6
       
       ...
       
       k = 13(indice) AQUI ENCERRA A CONTAGEM
       soma = 78 + 12(k)
       soma = 91
       */
       System.out.print(soma);
        
    }
}

