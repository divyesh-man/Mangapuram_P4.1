import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import java.util.HashSet;

import java.util.Iterator;

import java.util.Scanner;

import java.util.Set;

 

public class DuplicateRemover {

  // set of strings

   private Set<String> uniqueWords;

   // instance method called remove that takes a single parameter called dataFile

   public void remove(String dataFile) throws FileNotFoundException

   {

       String word;

       uniqueWords = new HashSet<String>();

       Scanner sc=new Scanner(new File(dataFile));

       // the set will only store unique words

       while(sc.hasNext())

       {

           word=sc.next();

           // storing unique words in an instance variable called uniqueWords

           uniqueWords.add(word);

       }

       sc.close();

   }

  //  an instance method called write that takes a single parameter called outputFile

   public void write(String outputFile) throws IOException

   {

    File f;

    FileWriter fw = null;

 

    f = new File(outputFile);

  

    if(!f.exists()) {

      f.createNewFile();

    }

    fw=new FileWriter(f);

    Iterator itr=uniqueWords.iterator();

 

    while(itr.hasNext())

    {

      // writing the words contained in uniqueWords to the file pointed to by outputFile

      String str=(String)itr.next();

      fw.write(str+"\n");    

    }

    fw.close();

    System.out.println("Done.");

 

   }

}