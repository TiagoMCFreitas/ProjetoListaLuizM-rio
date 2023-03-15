package views;
import models.*;
import java.util.Scanner;
public class ListaTeste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Lista list = new Lista(); // cria o cont�iner de List
		int selecaoServico = 5;

		int selecaoMicroServico;
		// insere inteiros na lista
		try{
		System.out.println("Bem Vindo ao programa da Lista");
		System.out.println("**********************************");
		System.out.println("Siga as instruções para acessar aos nossos serviços");
			do {
				selecaoServico = 5;
		
				 selecaoMicroServico = 0;
					if(selecaoServico == 5){
					System.out.println("(1) Inserir Novo elemento" + "\n");
					System.out.println("(2) Remover Elemento" + "\n");
					System.out.println("(3) Buscar elemento" + "\n");
					System.out.println("(4) Imprimir elementos" + "\n");
					System.out.println("(0) Sair do programa da Lista");
					selecaoServico = leia.nextInt();
					while(selecaoServico != 1 && selecaoServico != 2 && selecaoServico != 3 && selecaoServico != 4 && selecaoServico != 0){
						System.out.println("(1) Inserir Novo elemento" + "\n");
						System.out.println("(2) Remover Elemento" + "\n");
						System.out.println("(3) Buscar elemento" + "\n");
						System.out.println("(4) Imprimir elementos" + "\n");
						System.out.println("(0) Sair do programa da Lista");
						selecaoServico = leia.nextInt();
					}	
				}
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
						while(list.buscaElemento(elemento)){
							System.out.println("Elemento ja inserido anteriormente, digite outro valor: ");
							elemento = leia.nextInt();
						}
						list.insereNoInicio(elemento);
						list.print();
						System.out.println("Deseja inserir mais elementos? (1)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;
						
					}
					while(selecaoMicroServico == 2){
							
						System.out.println("Digite o valor para inserir no fim");
						Object elemento = leia.nextInt();
						while(list.buscaElemento(elemento)){
							System.out.println("Elemento ja inserido anteriormente, digite outro valor: ");
							elemento = leia.nextInt();
						}
						list.insereNoFim(elemento);
						list.print();
						
						System.out.println("Deseja inserir mais elementos? (1)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;
				
					}
					while(selecaoMicroServico == 3){
					try{
						System.out.println("Digite o valor para inserir na posicao: ");
						Object elemento = leia.nextInt();
						while(list.buscaElemento(elemento)){
							System.out.println("Elemento ja inserido anteriormente, digite outro valor: ");
							elemento = leia.nextInt();
						}
						System.out.println("Digite a posição que deseja inserir: ");
						System.out.println("Lista comeca com a posicao 0");
						int posicao = leia.nextInt();
						
						list.inserirNaPosicao(posicao, elemento);
						list.print();
						System.out.println("Deseja inserir mais elementos? (1)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;	
					}catch(Exception e){
						System.out.println(e.getMessage());
					}					
					}
				}
				  if(selecaoServico == 2){
					System.out.println("Você clicou na opção 'Remover Elemento'");
					System.out.println("Insira a opção de remoção");
					System.out.println("(1)Remover no Início");
					System.out.println("(2)Remover no Fim");
					System.out.println("(3)Remover por valor");
					System.out.println("(4)Remover por posição");
					selecaoMicroServico = leia.nextInt();
					while(selecaoMicroServico == 1){
						list.print();
						System.out.println("Removendo item no início");
						list.removeNoInicio();
						System.out.println("Item removido");
						list.print();
						System.out.println("Deseja remover mais elementos? (2)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;					}
					while(selecaoMicroServico == 2){
						list.print();
						System.out.println("Removendo item no final");
						list.removeNoFim();
						System.out.println("Item removido");
						list.print();
						System.out.println("Deseja remover mais elementos? (2)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;					}
					while(selecaoMicroServico == 3){
						list.print();
						System.out.println("Digite o valor a ser removido da lista: ");
						Object valor = leia.nextInt();
						list.removerPorElemento(valor);
						System.out.println("Elemento removido"+"\n");
						list.print();
						System.out.println("Deseja remover mais elementos? (2)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;					}
					while(selecaoMicroServico == 4){
						try{
						list.print();
						System.out.println("Digite a posicao do item a ser removido: ");
						int posicao = leia.nextInt();
						list.removeFromPosicao(posicao);
						System.out.println("Item removido com sucesso:" + "\n");
						list.print();
						System.out.println("Deseja remover mais elementos? (2)Sim (5)Não");
						selecaoServico = leia.nextInt();
						selecaoMicroServico = 0;		
						}catch(Exception e){
							System.out.println(e.getMessage());
						}
					}
				}
				if(selecaoServico == 3){
					System.out.println("Nessa seção, você poderá verificar se o elemento buscado existe na lista " + "\n");
					System.out.println("Digite o elemento requisitado: ");
					Object elemento = leia.nextInt();
					if(list.buscaElemento(elemento)){
						System.out.println("O elemento: '" + elemento + "' existe na lista e está na posição: " + list.localizarIndice(elemento));
					}else{
						System.out.println("Elemento não encontrado");
					}
					System.out.println("Deseja procurar mais algum elemento e sua posição? (3)Sim (5)Não");
					selecaoServico = leia.nextInt();
					while(selecaoServico != 3 && selecaoServico != 5){
						System.out.println("Valor Inserido Errado, digite (3)Sim (5)Não");
						selecaoServico = leia.nextInt();
					}

				}
				if(selecaoServico == 4){
					System.out.println("Aqui você poderá ver, como está a sua lista e o tamanho dela: " + "\n");
					list.print();
					System.out.println("(4)Imprimir denovo (5)Sair");
					selecaoServico = leia.nextInt();
				}
				
			}while(selecaoServico != 0);
			leia.close();
		}catch(Exception e ){
			System.out.println(e);
	
		}
	
	}// fim de main
}// fim da classe ListTest