grammar ProjectGrammar;

project: 'project:' NEWLINE INDENT1 project_details;

project_details: name language version structure dependencies scripts;

name: 'name:' WS STRING NEWLINE;

language: 'language:' WS STRING NEWLINE;

version: 'version:' WS QUOTED_STRING NEWLINE;

structure: 'structure:' NEWLINE (INDENT2 (folder | file))+;

folder: '- folder:' WS STRING NEWLINE INDENT3 'files:' NEWLINE (INDENT4 '- ' STRING NEWLINE)+;

file: '- file:' WS STRING NEWLINE;

dependencies: 'dependencies:' NEWLINE (INDENT2 '- ' dependency NEWLINE)*;

dependency: STRING '==' STRING;

scripts: 'scripts:' NEWLINE (INDENT2 script_name ':' WS script_command NEWLINE)+;

script_name: STRING;

script_command: STRING;

STRING: [a-zA-Z0-9]+;

QUOTED_STRING: '"' STRING '"';

WS: ' ';

NEWLINE: '\r'? '\n';

INDENT1: '  ';

INDENT2: '    ';

INDENT3: '      ';

INDENT4: '        ';