# Project-gen

Project-gen is a project structure management tool based on an ANTLR4 grammar. It allows defining and validating the hierarchy of directories, files, and npm dependencies of a project.

## Features

- Define project structure with a simple syntax
- Support for nested directories and files
- Dedicated section for managing npm dependencies
- Project structure validation
- Create the defined project structure
- Automatically install specified npm dependencies

## Installation
```bash
git clone https://github.com/your-username/projects-gen.git
cd ProjectGrammar
compile the Java code
```

## Usage
Run the program with two arguments: the input file path and the output path.
```bash
java -jar ProjectGrammar.jar <input_file_path> <output_path>
```
- <input_file_path>: Path to a file containing the project structure definition that matches the grammar.
- <output_path>: Path where the project structure will be created and dependencies will be installed

## Structure Example
```bash
root {
  src {
    main.js
    utils {
      helper.js
    }
  }
  test {
    test_main.js
  }
  script {
    npm {
      dependencies 'package1 package2'
    }
  }
}
```
