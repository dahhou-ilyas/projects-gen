package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromFileName("C:\\Users\\HP\\Desktop\\project-init-parse-prj\\project-gen\\src\\main\\java\\org\\example\\test.txt");

        // Créer un lexer
        ProjectGrammarLexer lexer = new ProjectGrammarLexer(input);

        // Créer un token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Créer un parser
        ProjectGrammarParser parser = new ProjectGrammarParser(tokens);

        // Obtenir le contexte de l'arbre de parsing
        ParseTree tree = parser.project();

        // Créer notre listener personnalisé
        ProjectStructureListener listener = new ProjectStructureListener();

        // Parcourir l'arbre avec notre listener
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        System.out.println("Structure de projet créée avec succès !");
    }
}