package JKendrickParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = "public class MainModel { ... }";
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        ModelLexer lexer = new ModelLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ModelParser parser = new ModelParser(tokens);
        ParseTree tree = parser.parse();
        
        // Récupération des paramètres du modèle
        double S = Double.parseDouble(tree.getChild(0).getChild(0).getText());
        double I = Double.parseDouble(tree.getChild(0).getChild(1).getText());
        double R = Double.parseDouble(tree.getChild(0).getChild(2).getText());
        double beta = Double.parseDouble(tree.getChild(1).getChild(0).getText());
        double gamma = Double.parseDouble(tree.getChild(1).getChild(1).getText());
        double mu = Double.parseDouble(tree.getChild(1).getChild(2).getText());
        double step = Double.parseDouble(tree.getChild(2).getText());
        double last = Double.parseDouble(tree.getChild(3).getText());
        int nbCycles = Integer.parseInt(tree.getChild(4).getText());
        
 
    }
}

