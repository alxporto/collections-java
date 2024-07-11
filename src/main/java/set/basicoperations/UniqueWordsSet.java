package main.java.set.basicoperations;

import java.util.HashSet;
import java.util.Set;
public class UniqueWordsSet {
  //attributes
  private Set<String> uniqueWordsSet;

  //constructor
  public UniqueWordsSet() {
    this.uniqueWordsSet = new HashSet<>();
  }
  public void addWord(String word) {
    uniqueWordsSet.add(word);
  }
  public void removeWord(String word) {
    if (!uniqueWordsSet.isEmpty()) {
        if (uniqueWordsSet.contains(word)) {
            uniqueWordsSet.remove(word);
        } else {
            System.out.println("Word not found in set!");
        }
    } else {
        System.out.println("The set is empty!");
    }
  }
  public boolean verifyWord(String word) {
    return uniqueWordsSet.contains(word);
  }
  public void showUniqueWords() {
    if (!uniqueWordsSet.isEmpty()) {
        System.out.println(uniqueWordsSet);
    } else {
        System.out.println("The set is empty!");
    }
  }

  public static void main(String[] args) {
    //creating an instance of the uniquewordsset class
    UniqueWordsSet lanquagesSet = new UniqueWordsSet();

    //adding unique languages to the set
    lanquagesSet.addWord("Java");
    lanquagesSet.addWord("Python");
    lanquagesSet.addWord("JavaScript");
    lanquagesSet.addWord("Python");
    lanquagesSet.addWord("C++");
    lanquagesSet.addWord("Ruby");

    //showing the unique languages of the set
    lanquagesSet.showUniqueWords();

    //removing a language from the set
    lanquagesSet.removeWord("Python");
    lanquagesSet.showUniqueWords();

    //removing a nonexistent language
    lanquagesSet.removeWord("Swift");

    //checking whether a language is in the set
    System.out.println("The 'Java' language is in the set? " + lanquagesSet.verifyWord("Java"));
    System.out.println("The 'Python' language is in the set? " + lanquagesSet.verifyWord("Python"));

    //showing the updated unique languages in the set
    lanquagesSet.showUniqueWords();
  }
}
