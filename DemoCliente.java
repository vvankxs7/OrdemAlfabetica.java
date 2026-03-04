import java.util.Scanner;
	public class DemoCliente{
		 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cliente [] c;

		String nome;
		float montanteVendas;
		float soma;	
		int n;

		System.out.println("Entre com a quant de clientes: ");
		n = sc.nextInt();
		
		c = new Cliente[n];

		System.out.println("========Entrada de Dados========");
		for(int i=0; i<c.length; i++){
		sc.nextLine();
		c[i] = new Cliente();
		System.out.println("Dados do cliente: " + (i+1) + ": ");
		System.out.println("Nome: ");
		nome = sc.nextLine();

		System.out.println("Montantes de vendas: ");
		montanteVendas = sc.nextFloat();

		c[i].setNome(nome);
		c[i].setMontanteVendas(montanteVendas);

		System.out.println("***\n");
		}
		
		System.out.println("\n=== Impressão de dados ===\n");
		for(int i=0; i<c.length; i++){
		System.out.println("\nDados do Cliente "+(i+1)+": "+c[i]);
		}

		System.out.println("====Soma do Montante de Vendas dos Clientes ===");
		soma = 0.0f;
		for(int i=0; i<c.length; i++) {
			soma = soma + c[i].getMontanteVendas();
		}
		System.out.println("Resultado total do montante de vendas: "+soma);
		
		System.out.println("\n=== Ordem alfabetica dos Clientes ===\n");
			Cliente aux;
			 for(int i=0; i<c.length-1; i++)
            for(int j=i+1; j<c.length; j++)
				if(c[i].getNome().compareTo(c[j].getNome())>0){
				aux = c[i];
				c[i] = c[j];
				c[j] = aux;
			}
		for(int i=0;i<c.length;i++) {
            System.out.println("\nDados do Cliente "+(i+1)+": "+c[i]);
        }

		System.out.println("=========Dados do ultimo Cliente=======");
		System.out.println(c[c.length-1]);
		
		sc.close();
		}
	}
	
