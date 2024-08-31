package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("123りんご");
    stringList.add("ゴリラ456");
    stringList.add("GHI789さくら");
    stringList.add("東京123ひまわり");
    stringList.add("ABCおにぎり");
    stringList.add("456たいやき");
    stringList.add("789スカイ");
    stringList.add("仙台ABCまつり");
    stringList.add("名古屋123うどん");
    stringList.add("京都XYZすし");
    stringList.add("青葉789たい焼き");
    stringList.add("大阪DEFにんぎょう");
    stringList.add("中京456さくらんぼ");
    stringList.add("東京GHIはな");
    stringList.add("ひらがな789うどん");
    stringList.add("123マリオ");
    stringList.add("新潟JKLりんご");
    stringList.add("長野456そば");
    stringList.add("札幌MNOねこ");
    stringList.add("福岡789いちご");
    stringList.add("123中野スイカ");
    stringList.add("名古屋QRSねずみ");
    stringList.add("宇都宮789さくらんぼ");
    stringList.add("横浜TUVたこやき");
    stringList.add("高松123やま");
    stringList.add("福井XYZたんぽぽ");
    stringList.add("広島ABCかたくり");
    stringList.add("新宿456かき");
    stringList.add("川崎DEFうさぎ");
    stringList.add("岡山12もも3");
    stringList.add("仙台GHIくるま");
    stringList.add("2023カレー");
    //PatternとMatcherはエラー表示が出て、import classをすれば、エラーは消えた？
    // number.matches("\\d+")こうしてしまうと、文字列全体が数字であるときのみマッチする。つまり一部がマッチしても意味がない。

    System.out.print("第1課題：数字のみ");
    List<String> numberList = new ArrayList<>();
    Pattern numberPattern = Pattern.compile("\\d+");

    for (String number : stringList) {
      Matcher numberMatcher = numberPattern.matcher(number);
      while (numberMatcher.find()) {
        numberList.add(numberMatcher.group());
      }
    }
    System.out.println(numberList);

    System.out.print("第2課題：文字のみ");
    List<String> characterList = new ArrayList<>();
    Pattern stringPattern = Pattern.compile("\\D+");

    for (String string : stringList) {
      Matcher stringMatcher = stringPattern.matcher(string);
      while (stringMatcher.find()) {
        characterList.add(stringMatcher.group());
      }
    }
    System.out.println(characterList);

    System.out.print("第3課題：英数字の大文字だけ");
    List<String> uppercaseList = new ArrayList<>();
    Pattern uppercasePattern = Pattern.compile("[A-Z0-9]+");

    for (String uppercase : stringList) {
      Matcher uppercaseMatcher = uppercasePattern.matcher(uppercase);
      while (uppercaseMatcher.find()) {
        uppercaseList.add(uppercaseMatcher.group());
      }
    }
    System.out.println(uppercaseList);

    System.out.print("第4課題：日本語のみ");
    List<String> japaneseList = new ArrayList<>();
    Pattern japanesePattern = Pattern.compile("[\\p{IsHiragana}\\p{IsKatakana}\\p{IsHan}]+");

    for (String japanese : stringList) {
      Matcher japaneseMatcher = japanesePattern.matcher(japanese);
      while (japaneseMatcher.find()) {
        japaneseList.add(japaneseMatcher.group());
      }
    }
    System.out.println(japaneseList);
    
    System.out.println("第5課題：英数字以外");
    List<String> notAlphabumericList = new ArrayList<>();
    Pattern notAlphanumericPattern = Pattern.compile("[^A-Za-z0-9]+"); //^でそれ以外を表す。

    for (String notAlphanumeric : stringList) {
      Matcher notAlphanumericMatcher = notAlphanumericPattern.matcher(notAlphanumeric);
      while (notAlphanumericMatcher.find()) {
        notAlphabumericList.add(notAlphanumericMatcher.group());
      }
    }
    System.out.println(notAlphabumericList);
  }
}
