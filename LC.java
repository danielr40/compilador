import java.util.Hashtable;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class LC {

    public static HashTable<String,String> TabelaSimbolos;

    public static void inicializarTabelaSimbolos() {
		
		// adicionar palavras reservadas 
        TabelaSimbolos.put("TRUE", "const");
        TabelaSimbolos.put("FALSE", "const");
        TabelaSimbolos.put("=", "=");
        TabelaSimbolos.put("<", "<");
        TabelaSimbolos.put("<=", "<=");
        TabelaSimbolos.put(">", ">");
        TabelaSimbolos.put(">=", "<=");
        TabelaSimbolos.put("!=", "!=");
        TabelaSimbolos.put("+", "+");
        TabelaSimbolos.put("-", "-");
        TabelaSimbolos.put("*", "*");
        TabelaSimbolos.put("/", "/");
        TabelaSimbolos.put(";", ";");
		TabelaSimbolos.put(",", ",");
        TabelaSimbolos.put("and", "and");
        TabelaSimbolos.put("or", "or");
        TabelaSimbolos.put("not", "not");
        TabelaSimbolos.put("aspas", ""+(char)34);
        TabelaSimbolos.put(")", ")");
        TabelaSimbolos.put("(", "(");
        TabelaSimbolos.put("final", "final");
		TabelaSimbolos.put("begin", "begin");
        TabelaSimbolos.put("int", "int");
        TabelaSimbolos.put("byte", "byte");
        TabelaSimbolos.put("string", "string");
        TabelaSimbolos.put("boolean", "boolean");
        TabelaSimbolos.put("readln", "readln");
        TabelaSimbolos.put("writeln", "writeln");
        TabelaSimbolos.put("while", "while");
        TabelaSimbolos.put("if", "if");
        TabelaSimbolos.put("else", "else");
    }
    
    public static void inserirTabelaSimbolos(String identificador){
        TabelaSimbolos.put(identificador, "identificador");
    }

	public static boolean pesquisarTabelaSimbolos(String lexema){
		return TabelaSimbolos.containsKey(lexema);
	}
	
	public static void main(String [] args) throws Exception
	{	
		if(args.length==0)
		{
			System.out.println("Erro: Especifique um arquivo para compilar!");
			System.exit(0);
		}
		else if(args[0].substring(args[0].indexOf(".")).equals(".L")==false)
		{
			System.out.println("Erro: Arquivo invalido!");
			System.exit(0);
		}
		
		File programaFonte = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(programaFonte));
		
		TabelaSimbolos = new HashTable<String,String>();
        inicializarTabelaSimbolos();
		
		while(reader.ready())
		{
			char c = (char)reader.read();
			System.out.println(c);
		}
	}
}
