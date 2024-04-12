package cida;
import cida.parser.*;
import cida.lexer.*;
import cida.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "teste/sucesso/03_2_delarações_compostas_tipos.ci";
  
   Parser p =
    new Parser(
    new Lexer(
    new PushbackReader(  
    new FileReader(arquivo), 1024))); 
   
   Start tree = p.parse();

   tree.apply(new ASTDisplay());
   
   //aplicação da análise semântica em minha AST
   tree.apply(new Semantico());
   
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}