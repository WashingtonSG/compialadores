package cida;
import cida.lexer.*;
import cida.node.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/sucesso/17_para.ci";
			
	
			Parser p =
					new Parser(
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024))); 
			
			Start tree = p.parse();
			tree.apply(new ASTDisplay());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}