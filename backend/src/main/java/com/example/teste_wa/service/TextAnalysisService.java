package com.example.teste_wa.service;

import org.springframework.stereotype.Service;

@Service
public class TextAnalysisService {

    public int analyzeText(String text, int depth) {
        
        String[] words = text.split("\\s+");
        return words.length; 
    }
}
