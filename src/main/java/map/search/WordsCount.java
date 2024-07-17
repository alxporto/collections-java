package main.java.map.search;

import java.util.*;
public class WordsCount {
  //attributes
  private Map<String, Integer> words;

  //constructor
  public WordsCount() {
      this.words = new HashMap<>();
  }
  public void addWords(String language, Integer counting) {
      words.put(language, counting);
  }
  public void removeWords(String word) {
      if (!word.isEmpty()) {
          words.remove(word);
      } else {
          System.out.println("The map is empty.");
      }
  }
  public int showWordsCounting() {
      int totalCounting = 0;
      for (int counting: words.values()) {
           totalCounting += counting;
      }
      return totalCounting;
  }
  public String findMostFrequentWords() {
      String mostFrequentLanguage = null;
      int highestCounting = 0;
      for (Map.Entry<String, Integer> entry : words.entrySet()) {
          if (entry.getValue() > highestCounting) {
              highestCounting = entry.getValue();
              mostFrequentLanguage = entry.getKey();
          }
      }
      return mostFrequentLanguage;
  }
  public static void main(String[] args) {
    //creating an instance for the wordscount class
    WordsCount languagesCounting = new WordsCount();

    //adding languages and its countings
    languagesCounting.addWords("Java", 2);
    languagesCounting.addWords("Python", 8);
    languagesCounting.addWords("JavaScript", 1);
    languagesCounting.addWords("C#", 6);

    //showing the total counting of languages
    System.out.println("There are " + languagesCounting.showWordsCounting() + " words.");

    //finding and showing the most frequent language
    String mostFrequentLanguage = languagesCounting.findMostFrequentWords();
    System.out.println("The most frequent language is: " + mostFrequentLanguage);
  }
}
