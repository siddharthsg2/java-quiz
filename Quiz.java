import java.util.*;
public class Quiz
{
    String quizQuestions, quizOptions, answer, enter;
    char ch;
    int i, correct=0;
    Quiz[] quiz=new Quiz[61];
    public void initialise()
    {
        
        for(i=0; i<61; i++) 
        {
            quiz[i]=new Quiz();

        }
    }

    public void quizQuestions()
    {
        try
        {
            quiz[0].quizQuestions="Who Developed Java?";
            quiz[1].quizQuestions="What was the original name of Java?";
            quiz[2].quizQuestions="What is the full form of JDK?";
            quiz[3].quizQuestions="What is an class in Java?";
            quiz[4].quizQuestions="What is Abstraction in Java?";
            quiz[5].quizQuestions="What is Encapsulation in Java?";
            quiz[6].quizQuestions="What is an Method?";
            quiz[7].quizQuestions="What is the other name of Method?";
            quiz[8].quizQuestions="What is an Object?";
            quiz[9].quizQuestions="What is Message Passing?";
            quiz[10].quizQuestions="What is an Object Factory?";
            quiz[11].quizQuestions="How are methods related to an object?";
            quiz[12].quizQuestions="How do you implement Object into software?";
            quiz[13].quizQuestions="How do you implement Encapsulation into software?";
            quiz[14].quizQuestions="What is an Byte Code?";
            quiz[15].quizQuestions="What is an Source Code?";
            quiz[16].quizQuestions="What is the full form of JVM?";
            quiz[17].quizQuestions="What is JVM?";
            quiz[18].quizQuestions="What is Native Executable Code?";
            quiz[19].quizQuestions="What are Java APIs?";
            quiz[20].quizQuestions="What is the full form of WORA?";
            quiz[21].quizQuestions="What is WORA in Java?";
            quiz[22].quizQuestions="What is Platform Independence of Java?";
            quiz[23].quizQuestions="What are the names of two types of Java Programs?";
            quiz[24].quizQuestions="Which shortcut key(s) is use to save your Program in BlueJ?";
            quiz[25].quizQuestions="Which shortcut key(s) is use to generate Documentation of an Program/Project in BlueJ?";
            quiz[26].quizQuestions="What is an JAR File?";
            quiz[27].quizQuestions="Which shortcut key is use to Compile the Code within the BlueJ Editor?";
            quiz[28].quizQuestions="Which shortcut key is use to Compile the selected Programe within your Package in BlueJ?";
            quiz[29].quizQuestions="How would you describe Java language?";
            quiz[30].quizQuestions="Which statement is use to print any error in Java?";
            quiz[31].quizQuestions="Which of these is use to express an sigle line comment in Java?";
            quiz[32].quizQuestions="Which of these is use to express an multi line comment in Java?";
            quiz[33].quizQuestions="Which of these is use to print your text in a new line?";
            quiz[34].quizQuestions="Which of these is use to print your text in the last printed line?";
            quiz[35].quizQuestions="What is an Token?";
            quiz[36].quizQuestions="What are Keywords?";
            quiz[37].quizQuestions="Keywords are also known as?";
            quiz[38].quizQuestions="What are Identifiers?";
            quiz[39].quizQuestions="Which of these is an illegal Java Identifier?";
            quiz[40].quizQuestions="What are Literals?";
            quiz[41].quizQuestions="In Java Hexadecimal Literals are written as?";
            quiz[42].quizQuestions="Which of these is an Real Literal in Java?";
            quiz[43].quizQuestions="How are the characters, which are can not be directly typed by keyboard, represented in Java?";
            quiz[44].quizQuestions="Which of these represents new line?";
            quiz[45].quizQuestions="Which of these represents null?";
            quiz[46].quizQuestions="Which of these represents double quote?";
            quiz[47].quizQuestions="What are the means to identify the type of data stored in a variable?";
            quiz[48].quizQuestions="Which of these is not an Keyword?";
            quiz[49].quizQuestions="What is the default size of char dataype in Java?";
            quiz[50].quizQuestions="What is the full form of Java API?";
            quiz[51].quizQuestions="What is an variable?";
            quiz[52].quizQuestions="What is the use of \'new\' reserved word?";
            quiz[53].quizQuestions="How are the objects created?";
            quiz[54].quizQuestions="Java uses which character set?";
            quiz[55].quizQuestions="What is the Initial value of Boolean?";
            quiz[56].quizQuestions="What are Operators?";
            quiz[57].quizQuestions="What are Operands?";
            quiz[58].quizQuestions="Which of these is an Logical Operator?";
            quiz[59].quizQuestions="Which of these is an Relational Operator?";
            quiz[60].quizQuestions="Which of these is an alternate of if-else?";
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
    }

    public void quizOptions()
    {
        try
        {
            quiz[0].quizOptions="A: Charles Babbage\nB: Lady Ada Lovelace\nC: Tim Berners-Lee\nD: James Gosling";
            quiz[1].quizOptions="A: C++\nB: Groovey\nC: Oak\nD: HTML";
            quiz[2].quizOptions="A: Java Developing Kit\nB: Java Development Kit\nC: Java Developed Kit\nD: Java Disk Kit";
            quiz[3].quizOptions="A: It is an representation of a set of objects\nB: It is nothing more than a keyword\nC: An identifiable entity with some characteristics and behaviour\nD: Datatype";
            quiz[4].quizOptions="A: Representation for the specific behaviour of an object\nB: Wrapping up of data into a single unit\nC: Type of an Java Program\nD: Act of Representing essential features only without any background details";
            quiz[5].quizOptions="A: Wrapping up of data into a single unit\nB: Keyword\nC: Use to declaire an Object\nD: One of the Characteristics of Java";
            quiz[6].quizOptions="A: The number and types of Arguments\nB: Collection of similar datatype\nC: A sequence of statements that carry out specific task(s)\nD: Throwable Exception";
            quiz[7].quizOptions="A: Function\nB: Array\nC: Exception\nD: Class";
            quiz[8].quizOptions="A: Blue print of an Program\nB: Identifiable entity with some Characteristics and Behaviour\nC: Visibility mode of an Java statement\nD: Type of a Stream used in Java";
            quiz[9].quizOptions="A: A way of sending/receiving information to/from another class\nB: A way of sending/receiving information to/from another package\nC: A way of sending/receiving information to/from another instance of class\nD: A way to implement data abstraction in Java";
            quiz[10].quizOptions="A: A producer of method\nB: A producer of class\nC: A producer of memory location\nD: A producer of instance of a class";
            quiz[11].quizOptions="A: The behaviour of an object is represented through associated methods\nB: They don't have any relation with each other\nC: An object is created through an method\nD: An object is executed through an method";
            quiz[12].quizOptions="A: It wraps up the data and associated methods into a single unit called class\nB: Characteristics / attributes through data members, Behaviour through methods and Methods are wrapped up and given a unique name to it\nC: Characteristics / attributes through methods, Behaviour through member variables and Data and Methods are wrapped up and given a unique name to it\nD: Objects are not implemented in Software terms";
            quiz[13].quizOptions="A: The data and associated method is wrapped up into a single unit called class\nB: The data and associated method is wrapped up into a single unit called instance of a class\nC: The data and associated method is wrapped up into a single unit called member variable\nD: The data and associated method is wrapped up into a single unit called datatype";
            quiz[14].quizOptions="A: It is a machine instruction for JVM\nB: The code written by a programmer\nC: Resultant code in ordinary compilation\nD: Java interpreter";
            quiz[15].quizOptions="A: It is a machine instruction for your Operating System\nB: Java interpreter\nC: Resultant code in ordinary compilation\nD: The code written by a programmer";
            quiz[16].quizOptions="A: Java Visual Machine\nB: Java Virtual Machine Code\nC:Java Virtual Machine\nD: Java Virtual Manager";
            quiz[17].quizOptions="A: Java Interpreter\nB: Native Executable Code generator\nC: One of the Characteristic of Java\nD: An Feature of BlueJ";
            quiz[18].quizOptions="A: The code written by a programmer\nB: Special Code of Java which makes it platform independent\nC: Resultant Code of Ordinary Compilation\nD: Machine instruction to JVM";
            quiz[19].quizOptions="A: Uncompiled classes in Java\nB: Java Platform to program Applications\nC: An Java Application\nD: Libraries of compiled code which can be used in Java Program";
            quiz[20].quizOptions="A: Written Once Read Anytime\nB: Write Once Run Anywhere\nC: Write Once Read Anywhere\nD: Write Once Read After";
            quiz[21].quizOptions="A: It means Java Programs written once can be run on any platform without making any change to the code\nB: It means Java Programs written once can be run on any platform by making changes in the code\nC: Java don't offer WORA feature\nD: It means Java Programs written once can be read anytime";
            quiz[22].quizOptions="A: It means Java Programs can be use in any computer platform\nB: It means Java Programs can be use in any platform without making any changes to it\nC: It means Java can be run only in its own platform\nD: Java is not Platform Independent";
            quiz[23].quizOptions="A: JAR Appications and Stand Alone Applications\nB: Stand Alone Applications and Internet Appleats\nC: JAR and JAD\nD: Standard Applications and Internet Appleats";
            quiz[24].quizOptions="A: CTRL+S / CTRL+K\nB: CTRL+SHIFT+J\nC: CTRL+W\nD: CTRL+SHIFT+I";
            quiz[25].quizOptions="A: CTRL+W\nB: CTRL+SHIFT+J\nC: CTRL+J\nD: CTRL+ALT+J";
            quiz[26].quizOptions="A: File which contains all the files of your project\nB: Mobile file\nC: File containing an perticular program\nD: Type of a Java Program";
            quiz[27].quizOptions="A: CTRL+ALT+SHIFT+C\nB: CTRL+C\nC: ALT+S\nD: CTRL+K";
            quiz[28].quizOptions="A: CTRL+K\nB: ALT+S\nC: CTRL+SHIFT+K\nD: CTRL+ALT+C";
            quiz[29].quizOptions="A: Programming Language\nB: Platform\nC: High Level Language\nD: Programming Language and Platform";
            quiz[30].quizOptions="A: System.print(\"...\")\nB: System.out.println(\"...\")\nC: System.out.printline(\"...\")\nD: System.err.println(\"...\")";
            quiz[31].quizOptions="A: /*...*/\nB: //...\nC: /**...*/\nD: \\...\\";
            quiz[32].quizOptions="A: /*...\nB: //...\nC: /*...*/\nD: \\**...*\\";
            quiz[33].quizOptions="A: System.println(\"...\")\nB: System.out.println(\"...\")\nC: System.out.printf(\"...\")\nD: System.out.print(\"...\")";
            quiz[34].quizOptions="A: System.out.print(\"...\")\nB: System.out.println(\"...\")\nC: System.print(\"...\")\nD: System.err.println(\"...\")";
            quiz[35].quizOptions="A: An Keyword\nB: The smallest indivisual unit of an Java Program\nC: The name given to a specific part of a Program\nD: Reserved word";
            quiz[36].quizOptions="A: Reserved words\nB: Unreserved words\nC: The name given to a specific part of a Program\nD: Words which can be edited by any programmer";
            quiz[37].quizOptions="A: Identifiers\nB: unreserved words\nC: Reserved words\nD: Editable words";
            quiz[38].quizOptions="A: Reserved words\nB: The name given to a specific part of a Program according to the rules of declaration in Java\nC: Operators\nD: The name given to a specific part of a Program without following any rule";
            quiz[39].quizOptions="A: _CLASS\nB: default\nC: $chool\nD: cLaSs";
            quiz[40].quizOptions="A: Changable data values\nB: User defined data values\nC: Data items that are fixed data values\nD: Datatypes used in Java";
            quiz[41].quizOptions="A: OX(number)\nB: (number)OX\nC: OX/(number)\nD: \\uHn";
            quiz[42].quizOptions="A: Integer Literal\nB: Boolean Literal\nC: Floating Literal\nD: Character Literal";
            quiz[43].quizOptions="A: ASCII Values\nB: Keywords\nC: Escape Sequence\nD: UTF-8 value";
            quiz[44].quizOptions="A: \\v\nB: \\t\nC: \\0\nD: \\n";
            quiz[45].quizOptions="A: \\n\nB: \\null\nC: \\0\nD: \\f";
            quiz[46].quizOptions="A: \"...\nB: \\\"...\nC: \'...\nD: \\\\\"";
            quiz[47].quizOptions="A: By checking the value stored in it\nB: By Datatypes\nC: By Identifiers\nD: By developing a new Program";
            quiz[48].quizOptions="A: class\nB: new\nC: System\nD: Class";
            quiz[49].quizOptions="A: 2 bit\nB: 2 Byte\nC: 64 bit\nD: 8 bit";
            quiz[50].quizOptions="A: Application Programming Interface\nB: Appleat Program Interface\nC: Anything Programable Interface\nD: Application Programming Interpreter";
            quiz[51].quizOptions="A: Specific name of an part of an Program\nB: Named memory location\nC: Reserved words\nD: Representation of behaviour of an object";
            quiz[52].quizOptions="A: To define a new object.\nB: To allocate new memory size\nC: To declare a new class\nD: To change the predefined memory siez";
            quiz[53].quizOptions="A: <className> obj=new <className>();\nB: <className> obj=new();\nC: <className> <objectName>=new <className>();\nD: <objectName>.<className>=new <className>();";
            quiz[54].quizOptions="A: ASCII Code\nB: UTF\nC: UTF-8\nD: Unicode";
            quiz[55].quizOptions="A: true\nB: 0\nC: false\nD: null";
            quiz[56].quizOptions="A: Special words or symbols use to perform an specific operation with the operands\nB: Special symbols use to perform an specific operation with the operands\nC: Special characters use to do calculation\nD: Objects of the operation";
            quiz[57].quizOptions="A: Variable(s)\nB: Any number(s)\nC: Object of the operation\nD: Specify the operation(s)";
            quiz[58].quizOptions="A: ==\nB: +=\nC: &&\nD: <<";
            quiz[59].quizOptions="A: !=\nB: >>>\nC: [ ]\nD: ? :";
            quiz[60].quizOptions="A: ~\nB: ^\nC: ? :\nD: !=";
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
    }

    public void quizAnswers()
    {
        quiz[0].answer="D";
        quiz[1].answer="C";
        quiz[2].answer="B";
        quiz[3].answer="A";
        quiz[4].answer="D";
        quiz[5].answer="A";
        quiz[6].answer="C";
        quiz[7].answer="A";
        quiz[8].answer="B";
        quiz[9].answer="C";
        quiz[10].answer="B";
        quiz[11].answer="A";
        quiz[12].answer="B";
        quiz[13].answer="B";
        quiz[14].answer="A";
        quiz[15].answer="D";
        quiz[16].answer="C";
        quiz[17].answer="A";
        quiz[18].answer="C";
        quiz[19].answer="D";
        quiz[20].answer="B";
        quiz[21].answer="A";
        quiz[22].answer="B";
        quiz[23].answer="B";
        quiz[24].answer="A";
        quiz[25].answer="C";
        quiz[26].answer="A";
        quiz[27].answer="D";
        quiz[28].answer="C";
        quiz[29].answer="D";
        quiz[30].answer="D";
        quiz[31].answer="B";
        quiz[32].answer="D";
        quiz[33].answer="B";
        quiz[34].answer="A";
        quiz[35].answer="B";
        quiz[36].answer="A";
        quiz[37].answer="C";
        quiz[38].answer="B";
        quiz[39].answer="B";
        quiz[40].answer="C";
        quiz[41].answer="A";
        quiz[42].answer="C";
        quiz[43].answer="C";
        quiz[44].answer="D";
        quiz[45].answer="C";
        quiz[46].answer="D";
        quiz[47].answer="B";
        quiz[48].answer="D";
        quiz[49].answer="B";
        quiz[50].answer="A";
        quiz[51].answer="B";
        quiz[52].answer="B";
        quiz[53].answer="C";
        quiz[54].answer="D";
        quiz[55].answer="C";
        quiz[56].answer="A";
        quiz[57].answer="C";
        quiz[58].answer="C";
        quiz[59].answer="A";
        quiz[60].answer="C";
    }

    public void play()
    {
        try
        {
            Scanner scan=new Scanner(System.in);
            String temp="";
            Collections.shuffle(Arrays.asList(quiz));
            Collections.shuffle(Arrays.asList(quiz));
            for(i=0; i<20; i++)
            {
                System.out.println("Question "+(i+1)+": "+quiz[i].quizQuestions+"\nOptions:-\n"+quiz[i].quizOptions);
                System.out.printf("Your Answer (A/B/C/D): ");
                temp=scan.next();
                ch=temp.charAt(0);
                temp=Character.toString(ch);
                System.out.println("\n\n");
                if(temp.equalsIgnoreCase(quiz[i].answer))
                {
                    System.out.println("* * * Correct! * * *");
                    correct++;
                }
                else
                {
                    System.out.println("* * * Incorrect! * * *");
                }
                System.out.println("Answer: "+quiz[i].answer);
                System.out.println("\n\n");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
        catch(InputMismatchException e)
        {
            System.err.println("Error Occur!\n"+e.getMessage());
            System.exit(0);
        }
    }

    public void result()
    {
        System.out.println("Your Final Result:- ");
        System.out.println("You answered total 20 questions out of which you answered "+correct+" correct and "+(20-correct)+" incorrect!");
        if(correct<=5)
            System.out.println("Better Luck Next Time!");
        else if(correct<=10 && correct>5)
            System.out.println("You played nice. But more affort is needed!");
        else if(correct<=15 && correct>10)
            System.out.println("You did a great job!");
        else if(correct<=19 && correct>15)
            System.out.println("You were Amazing!");
        else if(correct==20)
            System.out.println("You did a Marvelous job!");
    }

    public static void main(String[] args)
    {
        Quiz obj=new Quiz();
        obj.initialise();
        obj.quizQuestions();
        obj.quizOptions();
        obj.quizAnswers();
        obj.play();
        obj.result();
    }
}
