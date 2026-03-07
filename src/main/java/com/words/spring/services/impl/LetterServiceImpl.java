package com.words.spring.services.impl;


import com.words.spring.services.LetterService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LetterServiceImpl implements LetterService {
    private Random random = new Random();
    private char[] greekLetters = {'Α', 'Ά', 'α', 'ά', 'Β', 'β', 'Γ', 'γ', 'Δ', 'δ', 'Ε', 'Έ', 'ε', 'έ', 'Ζ', 'ζ', 'Η', 'Ή', 'η', 'ή', 'Θ', 'θ', 'Ι', 'Ί', 'Ϊ', 'ι', 'ί', 'ϊ', 'ΐ', 'Κ', 'κ', 'Λ', 'λ', 'Μ', 'μ', 'Ν', 'ν', 'Ξ', 'ξ', 'Ο', 'Ό', 'ο', 'ό', 'Π', 'π', 'Ρ', 'ρ', 'Σ', 'σ', 'ς', 'Τ', 'τ', 'Υ', 'Ύ', 'Ϋ', 'υ', 'ύ', 'ϋ', 'ΰ', 'Φ', 'φ', 'Χ', 'χ', 'Ψ', 'ψ', 'Ω', 'Ώ', 'ω', 'ώ'};

    @Override
    public String generateRandomGreekLetters(int count) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < count) {
            char randomLetter = greekLetters[random.nextInt(greekLetters.length)];
            stringBuffer.append(randomLetter);
            i++;
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomEnglishLetters(int count) {
        char[] englishAlphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < count) {
            char randomLetter = englishAlphabet[random.nextInt(englishAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomGermanLetters(int count) {
        char[] germanAlphabet = {'A', 'a', 'Ä', 'ä', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'Ö', 'ö', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'ß', 'T', 't', 'U', 'u', 'Ü', 'ü', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < count) {
            char randomLetter = germanAlphabet[random.nextInt(germanAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomItalianLetters(int count) {
        char[] italianAlphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'È', 'è', 'É', 'é', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'Ì', 'ì', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'Ò', 'ò', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'Ù', 'ù', 'V', 'v', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < count) {
            char randomLetter = italianAlphabet[random.nextInt(italianAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomSwedishLetters(int count) {
        char[] swedishAlphabet = {'A', 'a', 'Å', 'å', 'Ä', 'ä', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'Ö', 'ö', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            char randomLetter = swedishAlphabet[random.nextInt(swedishAlphabet.length)];
            stringBuffer.append(randomLetter);
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomAlbanianLetters(int count) {
        char[] albanianAlphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'Ç', 'ç', 'D', 'd', 'E', 'e', 'Ë', 'ë', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'X', 'x', 'Y', 'y', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            char randomLetter = albanianAlphabet[random.nextInt(albanianAlphabet.length)];
            stringBuffer.append(randomLetter);
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomMongoliaLetters(int count) {
        char[] mongolianAlphabet = {'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и', 'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'Ө', 'ө', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ү', 'ү', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Э', 'э', 'Ю', 'ю', 'Я', 'я'};
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            char randomLetter = mongolianAlphabet[random.nextInt(mongolianAlphabet.length)];
            stringBuffer.append(randomLetter);
        }
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomPolishLetters(int count) {
        char[] polishAlphabet = {'A', 'a', 'Ą', 'ą', 'B', 'b', 'C', 'c', 'Ć', 'ć', 'D', 'd', 'E', 'e', 'Ę', 'ę', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'Ł', 'ł', 'M', 'm', 'N', 'n', 'Ń', 'ń', 'O', 'o', 'Ó', 'ó', 'P', 'p', 'R', 'r', 'S', 's', 'Ś', 'ś', 'T', 't', 'U', 'u', 'W', 'w', 'Y', 'y', 'Z', 'z', 'Ź', 'ź', 'Ż', 'ż'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = polishAlphabet[random.nextInt(polishAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomFrenchLetters(int count) {
        char[] frenchAlphabet = {'A', 'a', 'À', 'à', 'Â', 'â', 'Æ', 'æ', 'B', 'b', 'C', 'c', 'Ç', 'ç', 'D', 'd', 'E', 'e', 'É', 'é', 'È', 'è', 'Ê', 'ê', 'Ë', 'ë', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'Î', 'î', 'Ï', 'ï', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'Ô', 'ô', 'Œ', 'œ', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'Ù', 'ù', 'Û', 'û', 'Ü', 'ü', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Ÿ', 'ÿ', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = frenchAlphabet[random.nextInt(frenchAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomSpanishLetters(int count) {
        char[] spanishAlphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'Ñ', 'ñ', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = spanishAlphabet[random.nextInt(spanishAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomBulgarianLetters(int count) {
        char[] bulgarianAlphabet = {'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ж', 'ж', 'З', 'з', 'И', 'и', 'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ь', 'ь', 'Ю', 'ю', 'Я', 'я'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = bulgarianAlphabet[random.nextInt(bulgarianAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomSerbianCyrillicLetters(int count) {
        char[] serbianCyrillicAlphabet = {'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Ђ', 'ђ', 'Е', 'е', 'Ж', 'ж', 'З', 'з', 'И', 'и', 'Ј', 'ј', 'К', 'к', 'Л', 'л', 'Љ', 'љ', 'М', 'м', 'Н', 'н', 'Њ', 'њ', 'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т', 'Ћ', 'ћ', 'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Џ', 'џ', 'Ш', 'ш'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = serbianCyrillicAlphabet[random.nextInt(serbianCyrillicAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

    // 'Dž','dž','Lj','lj','Nj','nj',
    @Override
    public String generateRandomSerbianLatinLetters(int count) {
        char[] serbianLatinAlphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'Č', 'č', 'Ć', 'ć', 'D', 'd', 'Đ', 'đ', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'R', 'r', 'S', 's', 'Š', 'š', 'T', 't', 'U', 'u', 'V', 'v', 'Z', 'z', 'Ž', 'ž'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = serbianLatinAlphabet[random.nextInt(serbianLatinAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

    @Override
    public String generateRandomRussianLetters(int count) {
        char[] russianAlphabet = {'А', 'а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е', 'е', 'Ё', 'ё', 'Ж', 'ж', 'З', 'з', 'И', 'и', 'Й', 'й', 'К', 'к', 'Л', 'л', 'М', 'м', 'Н', 'н', 'О', 'о', 'П', 'п', 'Р', 'р', 'С', 'с', 'Т', 'т', 'У', 'у', 'Ф', 'ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э', 'Ю', 'ю', 'Я', 'я'};
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        do {
            char randomLetter = russianAlphabet[random.nextInt(russianAlphabet.length)];
            stringBuffer.append(randomLetter);
            i++;
        } while (i < count);
        return stringBuffer.toString();
    }

}

