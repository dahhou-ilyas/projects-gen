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

        if (args.length < 2) {
            System.out.println("Veuillez fournir le chemin du fichier et le chemin de sortie en arguments.");
            return;
        }

        String filePath = args[0];
        String outputPath = args[1];

        CharStream input = CharStreams.fromFileName(filePath);

        ProjectGrammarLexer lexer = new ProjectGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ProjectGrammarParser parser = new ProjectGrammarParser(tokens);

        ParseTree tree = parser.project();

        ProjectStructureListener listener = new ProjectStructureListener(outputPath);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        System.out.println("Structure de projet créée avec succès !");
    }
}