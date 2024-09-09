package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class ProjectStructureListener extends ProjectGrammarBaseListener {
    private File currentDirectory;


    @Override
    public void enterProject(ProjectGrammarParser.ProjectContext ctx) {
        // Créer le répertoire racine
        currentDirectory = new File("C:\\Users\\HP\\Desktop\\testTravaill");
        currentDirectory.mkdir();
    }

    @Override
    public void enterDirectory(ProjectGrammarParser.DirectoryContext ctx) {
        // Créer un nouveau répertoire
        String dirName = ctx.IDENTIFIER().getText();
        File newDir = new File(currentDirectory, dirName);
        newDir.mkdir();

        currentDirectory = newDir;
    }

    @Override
    public void exitDirectory(ProjectGrammarParser.DirectoryContext ctx) {
        // Remonter d'un niveau dans l'arborescence
        currentDirectory = currentDirectory.getParentFile();
    }

    @Override
    public void enterFile(ProjectGrammarParser.FileContext ctx) {
        // Créer un nouveau fichier
        String fileName = ctx.FILENAME().getText();
        File newFile = new File(currentDirectory, fileName);
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            System.err.println("Erreur lors de la création du fichier " + fileName + ": " + e.getMessage());
        }
    }

    @Override
    public void enterNpmSection(ProjectGrammarParser.NpmSectionContext ctx) throws IOException, InterruptedException {
        String dependencies = ctx.dependencies().getText();
        String[] dependencyList = dependencies.substring(13, dependencies.length() - 1).split(",");

        // Chemin complet vers npm
        String npmPath = "C:\\Program Files\\nodejs\\npm.cmd";

        // Répertoire de travail
        File workingDirectory = currentDirectory; // Assurez-vous que currentDirectory est correctement initialisé

        // Commande npm init -y
        String[] initCommand = {npmPath, "init", "-y"};
        executeCommand(initCommand, workingDirectory);

        // Commande npm install avec les dépendances
        String[] installCommand = Stream.concat(
                Arrays.stream(new String[] {npmPath, "install"}),
                Arrays.stream(dependencyList)
        ).toArray(String[]::new);
        executeCommand(installCommand, workingDirectory);
    }

    private void executeCommand(String[] command, File workingDirectory) throws IOException, InterruptedException {
        // Vérifiez et affichez la commande pour le débogage
        System.out.println("Command to run: " + String.join(" ", command));

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(workingDirectory); // Définir le répertoire de travail
        processBuilder.redirectErrorStream(true);

        // Démarrer le processus
        Process process = processBuilder.start();

        // Lire et afficher la sortie du processus
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        int exitCode = process.waitFor();
        System.out.println("Process exited with code: " + exitCode);
    }
}