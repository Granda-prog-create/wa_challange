package com.example.teste_wa.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.teste_wa.domain.WordNode;
import com.example.teste_wa.service.WordHierarchyService;

@Component
public class CommandLineInterface {

    @Autowired
    private WordHierarchyService wordHierarchyService;

    public void analyzePhrase(String phrase, int depth, boolean verbose) {
        String[] words = phrase.split(" ");
        WordNode root = wordHierarchyService.getRoot();
        int matches = 0;

        for (String word : words) {
            matches += searchWordAtDepth(root, word, depth, 0);
        }

        System.out.println("Matches at depth " + depth + ": " + matches);

        if (verbose) {
            System.out.println("Verbose Mode Enabled");
        }
    }

    private int searchWordAtDepth(WordNode node, String word, int targetDepth, int currentDepth) {
        if (currentDepth == targetDepth && node.getName().equalsIgnoreCase(word)) {
            return 1;
        }
        int matchCount = 0;
        for (WordNode child : node.getChildren()) {
            matchCount += searchWordAtDepth(child, word, targetDepth, currentDepth + 1);
        }
        return matchCount;
    }
}