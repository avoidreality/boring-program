# boring-program
An absurd Java program that prints text to the console. Let us not kid ourselves. This is a text-based video game of the lowest quality.

<h1>How To Run The Program</h1>
To run the program download 'boring.jar' and execute it like so: <code>java -jar boring.jar</code>

<h1>To compile the program</h1>
Put all the sources files in a directory named "Boring". Then move out of the Boring directory. Move to the directory containing the Boring directory. Then issue this command: <code> javac Boring\*.java </code>

<h1>To Create Your Own Executable Jar File Of This Program</h1>
Download the boring.mf file and place it in your folder called "Boring". This .mf file is the manifest that tells Java where the main method is. The main method is what starts the program. Now, in the directory containing the "Boring" folder issue this command: <code>jar cfm stillboring.jar Boring\boring.mf Boring\*class</code> 
This will create a Java archive (JAR) file called 'stillboring.jar'. You can now execute this jar file like so: <code>java -jar stillboring.jar</code>
