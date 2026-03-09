package com.words.spring.controllers;


import com.words.spring.services.LetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/letters")
public class LetterController {

    private final LetterService letterService;

    @Autowired
    public LetterController(LetterService letterService) {
        this.letterService = letterService;
    }

    @GetMapping("/generaterandomgr/{count}")
    public ResponseEntity<String> generateRandomGreekLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomModernGreekLetters(count), HttpStatus.OK); // change status to CREATED once you have DB!!!!!!
    }

    @GetMapping("/generaterandomgrpl/{count}")
    public ResponseEntity<String> generateRandomPolytonicGreekLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomPolytonicGreekLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomen/{count}")
    public ResponseEntity<String> generateRandomEnglishLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomEnglishLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomger/{count}")
    public ResponseEntity<String> generateRandomGermanLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomGermanLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomit/{count}")
    public ResponseEntity<String> generateRandomItalianLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomItalianLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomsw/{count}")
    public ResponseEntity<String> generateRandomSwedishLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomSwedishLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomal/{count}")
    public ResponseEntity<String> generateRandomAlbanianLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomAlbanianLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandommon/{count}")
    public ResponseEntity<String> generateRandomMongoliaLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomMongoliaLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandompol/{count}")
    public ResponseEntity<String> generateRandomPolishLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomPolishLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomfr/{count}")
    public ResponseEntity<String> generateRandomFrenchLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomFrenchLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomsp/{count}")
    public ResponseEntity<String> generateRandomSpanishLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomSpanishLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandombg/{count}")
    public ResponseEntity<String> generateRandomBulgarianLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomBulgarianLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomsercy/{count}")
    public ResponseEntity<String> generateRandomSerbianCyrillicLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomSerbianCyrillicLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomserlat/{count}")
    public ResponseEntity<String> generateRandomSerbianLatinLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomSerbianLatinLetters(count), HttpStatus.OK);
    }

    @GetMapping("/generaterandomru/{count}")
    public ResponseEntity<String> generateRandomRussianLetters(@PathVariable("count") int count) {
        return new ResponseEntity<>(letterService.generateRandomRussianLetters(count), HttpStatus.OK);
    }
}
