package views;
import models.*;
import java.util.Scanner;
public class ListaTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Lista list = new Lista(); // cria o cont�iner de List
		int selecaoServico = -1;
		int selecaoMicroServico;
		// insere inteiros na lista
		try{
		System.out.println("Bem Vindo ao programa da Lista");
		System.out.println("**********************************");
		System.out.println("Siga as instruções para acessar aos nossos serviços");
			do {
				System.out.println("(1) Inserir Novo elemento" + "\n");
				System.out.println("(2) Remover Elemento" + "\n");
				System.out.println("(3) Buscar elemento" + "\n");
				System.out.println("(4) Imprimir elementos" + "\n");
				selecaoServico = leia.nextInt();
				
				if(selecaoServico == 1){
					System.out.println("Você clicou na opção 'Inserir novo Elemento'");
					System.out.println("Insira a opção de inserção");
					System.out.println("(1)Inserir no Início");
					System.out.println("(2)Inserir no Fim");
					System.out.println("(3)Inserir por posição");
					selecaoMicroServico = leia.nextInt();
					while(selecaoMicroServico == 1){
						System.out.println("Digite o valor para inserir no início");
						Object elemento = leia.nextInt();
						list.insereNoInicio(elemento);
						list.print();
						System.out.println("Deseja inserir mais elementos? (1)Sim (0)Não");
						selecaoMicroServico = leia.nextInt();
					}
					while(selecaoMicroServico == 2){
						System.out.println("Digite o valor para inserir no fim");
						Object elemento = leia.nextInt();
						list.insereNoFim(elemento);
						list.print();
						System.out.println("Deseja inserir mais elementos? (2)Sim (0)Não");
						selecaoMicroServico = leia.nextInt();
					}
					while(selecaoMicroServico == 3){
						System.out.println("Digite o valor para inserir na posicao: ");
						Object elemento = leia.nextInt();
						System.out.println("Digite a posição que deseja inserir: ");
						System.out.println("Lista comeca com a posicao 0");
						int posicao = leia.nextInt();
						list.inserirNaPosicao(posicao, elemento);
						list.print();
						System.out.println("Deseja inserir mais elementos? (3)Sim (0)Não");
						selecaoMicroServico = leia.nextInt();
						
					}
				  if(selecaoServico == 2){
					
				  }
				}
			}while(selecaoServico != 0);

		}catch(Exception e ){
			System.out.println(e);
		}
	}// fim de main
}// fim da classe ListTest