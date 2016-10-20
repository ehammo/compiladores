package gramatica;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.midi.SysexMessage;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import visitor.PrettyPrintVisitor;

public class Teste {
    public static void main(String[] args) throws Exception {
        InputStream file = new FileInputStream("teste/QuickSort.java"); 
        ANTLRInputStream input = new ANTLRInputStream(file); // S/ precedencia nos op e nao reconhece blank space
        gramaticaLexer lexer = new gramaticaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramaticaParser parser = new gramaticaParser(tokens);
        Program tree = parser.goal().p;
        PrettyPrintVisitor vis = new PrettyPrintVisitor();
        vis.visit(tree);
    }
}