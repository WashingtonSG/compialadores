package cida;

import java.util.ArrayList;

import java.util.List;

import cida.analysis.*;
import cida.node.*;
import cida.node.ATipoVectorATipo;


// Nesta classe eu defino as ações de acordo com os nós, sobrescrevendo 
// os métodos da classe DepthFirstAdapter quando necessário.
// Evitem dar override nos métodos caseXXX. Caso precisem, garantam que
// os comandos de acesso aos nós filhos não são apagados nem que
// tenham sua ordem de chamada invertida.
public class Semantico extends DepthFirstAdapter {

	@Override
	public void inStart(Start node)
	    {
		   System.out.println("-------------------------------------------------");
		   System.out.println("Iniciando análise semântica...");
	    }
	
	 @Override
	 public void outStart(Start node)
	    {
		    System.out.println("-------------------------------------------------");
	        System.out.println("Fim da análise semântica");
	        System.out.println("-------------------------------------------------");
			  
	    }
	 
	@Override
	 //neste ponto eu assumo que acabei de sair de um nó declaração
	 //logo, seus filhos já foram visitados.
	 public void outADecAlterableADeclaracao(ADecAlterableADeclaracao node)
	    {
		 //O nó atual (node) tem dois filhos: tipo (node.getTipo) 
		 //e uma lista de ids (node.getIdentificadores()). 
		 //Olhem o arquivo com a classe do nó quando precisarem saber 
		 //quais são os filhos possíveis.
		 //Neste caso, as informações estão em ADeclaracoesDeclaracao.java 
		 
		 
		 // node.getTipo é do tipo abstrato PTipo. Quando precisarem identificar 
		 // que instância de um nó está sendo usada, vocês
		 // devem verificar quem são as filhas dela no pacote tipo.node
		 // Neste exemplo, node.getTipo pode ser uma instância de TReal ou 
		 // de TInteiro.		 
		  System.out.println("-------------------------------------------------");
		  System.out.println("O tipo desta declaração é " + node.getATipo());
		  System.out.println("-->Inserir ( "+ node.getId()+", "+node.getATipo()+")");
		  
		  //node.getIdentificadores é a lista de nome de veriáveis. Ela é uma lista porque eu 
		  //a defini desta maneira na minha gramática abstrata.
		  System.out.print("Variáveis: ");
		  List<TId> copy = new ArrayList<TId>();
		  copy.add(node.getId());
          for(TId e : copy)
          {
        	  //e contém o token associado a cada var da lista. 
              System.out.print(e.toString());
          } 
          System.out.println();
          System.out.println("Ações a serem tomadas na tabela de símbolos:" + node.getId());
          for(TId e : copy)
          {
              System.out.println("-->Inserir ( "+ e.toString()+", "+node.getATipo()+")");
          }
	    }
	 
	 @Override
	 public void outADecUnalterableADeclaracao(ADecUnalterableADeclaracao node)
	    {		 
		  System.out.println("-------------------------------------------------");
		  System.out.println("O tipo desta declaração é " + node.getATipoBase());
		  
		  System.out.print("Variáveis: ");
		  List<TId> copy = new ArrayList<TId>();
		  copy.add(node.getId());
          for(TId e : copy)
          {
              System.out.print(e.toString());
          } 
          System.out.println();
          System.out.println("O valor atribuido a essa declaração é " + node.getExpr());
          System.out.println("Ações a serem tomadas na tabela de símbolos:");
          for(TId e : copy)
          {
              System.out.println("-->Inserir ( "+ e.toString()+", " +node.getATipoBase()+ ", " + node.getExpr() +")");
          }
	    }
	 
	 @Override //variaveis já declaradas e que estão sendo atribuido valores
	 public void outAComandoLocalAComandoComposto(AComandoLocalAComandoComposto node)
	    {		 
		  System.out.println("-------------------------------------------------");
		  //System.out.println("O tipo desta declaração é " + node.getATipoBase());
		  
		  System.out.print("Variáveis: ");
		  List<PALocal> copy = new ArrayList<PALocal>();
		  copy.add(node.getALocal());
          for(PALocal e : copy)
          {
              System.out.print(e.toString());
          } 
          System.out.println();
          System.out.println("O valor atribuido a essa declaração é " + node.getExpr());
          System.out.println("Ações a serem tomadas na tabela de símbolos:");
          for(PALocal e : copy)
          {
              System.out.println("-->Inserir ( "+ e.toString()+", "  + node.getExpr() +")");
          }
	    }
	 
	 @Override //variaveis já declaradas e que estão sendo atribuido valores
	 public void outAConsideringAComandoComposto(AConsideringAComandoComposto node)
	    {		 
		  System.out.println("-------------------------------------------------");
		  //System.out.println("O tipo desta declaração é " + node.getATipoBase());
		  
		  System.out.print("Variáveis: ");
		  List<PALocal> copy = new ArrayList<PALocal>();
		  copy.add(node.getALocal());
          for(PALocal e : copy)
          {
              System.out.print(e.toString());
          } 
          System.out.println();
          Node[] expArray = {node.getExp1(), node.getExp2(), node.getExp3()};
          System.out.println("O valor atribuído à declaração 1 é " + expArray[0]);
          System.out.println("O valor atribuído à declaração 2 é " + expArray[1]);
          System.out.println("O valor atribuído à declaração 3 é " + expArray[2]);

          System.out.println("Ações a serem tomadas na tabela de símbolos:");
          for(PALocal e : copy)
          {
              System.out.println("-->Inserir ( "+ e.toString()+", "  + "[" + expArray[0]+", "+expArray[1]+", "+expArray[2] +"])");
          }
	    }
	 
	 @Override 
	 public void outACaptureAComandoComposto(ACaptureAComandoComposto node)
	    {		 
		  System.out.println("-------------------------------------------------");
		  //System.out.println("O tipo desta declaração é " + node.getATipoBase());
		  
		  System.out.print("Variáveis: ");
		  List<PALocalVirgula> copyVirgula = new ArrayList<PALocalVirgula>();
		  copyVirgula.addAll(node.getALocalVirgula());
		  for(PALocalVirgula e : copyVirgula)
		  {
		      System.out.print(e.toString() +", ");
		  }
		  
		  List<PALocal> copy = new ArrayList<PALocal>();
		  copy.add(node.getALocal());
		  for(PALocal e : copy)
		  {
		      System.out.print(e.toString());
		  }

		  System.out.println();
		  System.out.println("Ações a serem tomadas na tabela de símbolos:");
		  for(PALocal e : copy)
		  {
		      System.out.println("-->Inserir ( "+ e.toString() +")");
		  }
		  for(PALocalVirgula e : copyVirgula)
		  {
		      System.out.println("-->Inserir ( "+ e.toString() +")");
		  }
	    }
	 

	 
}
