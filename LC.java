import java.util.Hashtable;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class LC {

    public static Hashtable<String,String> TabelaSimbolos;

    public static void inicializarTabelaSimbolos() {
        TabelaSimbolos.put("TRUE", "boolean");
        TabelaSimbolos.put("FALSE", "boolean");

        TabelaSimbolos.put("=", "=");

        TabelaSimbolos.put("<", "comparacao");
        TabelaSimbolos.put("<=", "comparacao");
        TabelaSimbolos.put(">", "comparacao");
        TabelaSimbolos.put(">=", "comparacao");
        TabelaSimbolos.put("!=", "comparacao");

        TabelaSimbolos.put("+", "operador");
        TabelaSimbolos.put("-", "operador");
        TabelaSimbolos.put("*", "operador");
        TabelaSimbolos.put("/", "operador");

        TabelaSimbolos.put(";", "pontuacao");
		TabelaSimbolos.put(",", "pontuacao");

        TabelaSimbolos.put("and", "operador_logico");
        TabelaSimbolos.put("or", "operador_logico");
        TabelaSimbolos.put("not", "operador_logico");

        TabelaSimbolos.put("aspas", ""+(char)34);

        TabelaSimbolos.put("()", "parentese");
        TabelaSimbolos.put(")", "parentese");

        TabelaSimbolos.put("final", "final");
		TabelaSimbolos.put("begin", "begin");

        TabelaSimbolos.put("int", "tipo");
        TabelaSimbolos.put("byte", "tipo");
        TabelaSimbolos.put("string", "tipo");
        TabelaSimbolos.put("boolean", "tipo");

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
		
		TabelaSimbolos = new Hashtable<String,String>();
        inicializarTabelaSimbolos();
		
		while(reader.ready())
		{
			char c = (char)reader.read();
			System.out.println(c);
		}
	}
}
