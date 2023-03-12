package views;
import models.*;

public class ListaTeste {
	public static void main(String[] args) {
		
		Lista list = new Lista(); // cria o cont�iner de List
		
		// insere inteiros na lista
		try{
		list.inserirNaPosicao(0, 9);		
		list.print();
		list.inserirNaPosicao(1, 5);		
		list.print();
		list.inserirNaPosicao(2, 3);		
		list.print();		
		}catch(Exception e ){
			System.out.println(e);
		}
	}// fim de main
}// fim da classe ListTest