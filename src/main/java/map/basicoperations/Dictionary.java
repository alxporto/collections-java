package main.java.map.basicoperations;

import java.util.HashMap;
import java.util.Map;
public class Dictionary {
  //attributes
  private Map<String, String> dictionary;

  //constructor
  public Dictionary() {
      this.dictionary = new HashMap<>();
  }
  public void addWord(String word, String definition) {
      dictionary.put(word, definition);
  }
  public void removeWord(String word) {
      if (!dictionary.isEmpty()) {
          dictionary.remove(word);
      } else {
          System.out.println("The dictionary is empty.");
      }
  }
  public String searchByWord(String word) {
      String definition = dictionary.get(word);
      if (definition != null) {
          return definition;
      }
      return "Language not found in the dictionary.";
  }
  public void showWords() {
      if (!dictionary.isEmpty()) {
          System.out.println(dictionary);
      } else {
          System.out.println("The dictionary is empty.");
      }
  }
  public static void main(String[] args) {
    //creating an instance for the dictionary class
    Dictionary dictionary = new Dictionary();

    //adding words
    dictionary.addWord("Java", "Object-oriented programming language.");
    dictionary.addWord("Typescript", "Superset of the javascript language that adds static typing.");
    dictionary.addWord("Kotlin", "Modern programming language for the jvm.");

    //show all the words
    dictionary.showWords();

    //searching for the words
    String javaDefinition = dictionary.searchByWord("Java");
    System.out.println("'Java' language definition: " + javaDefinition);

    String csharpDefinition = dictionary.searchByWord("Csharp");
    System.out.println(csharpDefinition);

    //removing a word
    dictionary.removeWord("Typescript");
    dictionary.showWords();
  }
}
