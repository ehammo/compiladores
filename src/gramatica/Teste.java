package gramatica;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.midi.SysexMessage;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import visitor.BuildSymbolTableVisitor;
import visitor.PrettyPrintVisitor;
import visitor.TypeCheckVisitor;

public class Teste {
    public static void main(String[] args) throws Exception {
        InputStream file = new FileInputStream("teste/QuickSort.java"); 
        ANTLRInputStream input = new ANTLRInputStream(file); // S/ precedencia nos op e nao reconhece blank space
        ehammoLexer lexer = new ehammoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ehammoParser parser = new ehammoParser(tokens);
        Program tree = parser.goal().p;
        BuildSymbolTableVisitor stVis = new BuildSymbolTableVisitor();
        tree.accept(stVis);
		tree.accept(new TypeCheckVisitor(stVis.getSymbolTable()));
        
    }
}