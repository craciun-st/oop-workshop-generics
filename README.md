# oop-workshop-generics

Examples used in a mini-workshop. There are two cases where we might make good use of generics (each in separate packages under ``src/``).
Each one has a stand-alone Main class.

The first one has generics in the ``util.ListHandler`` class and the ``view.TerminalOutput`` one.
The second has them in the static functions directly in its Main.

[JANSI](https://search.maven.org/artifact/org.fusesource.jansi/jansi) is the only dependency in the ``pom.xml`` and is used 
for some color highlighting in the ``view.TerminalOutput`` of the 1st package
