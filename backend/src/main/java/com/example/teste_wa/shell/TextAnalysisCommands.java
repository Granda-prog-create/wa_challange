package com.example.teste_wa.shell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import com.example.teste_wa.service.TextAnalysisService;

@ShellComponent
public class TextAnalysisCommands {

    @Autowired
    private TextAnalysisService textAnalysisService;

    @ShellMethod(value = "Analyze the given text with the specified depth", key = "analyze")
    public String analyze(
        @ShellOption(help = "The depth of the analysis") int depth,
        @ShellOption(help = "The text to analyze") String phrase,
        @ShellOption(value = "--verbose", help = "Enable verbose mode", defaultValue = "false") boolean verbose) {

        if (phrase == null || phrase.isEmpty()) {
            return "Error: Phrase is required.";
        }

        int result = textAnalysisService.analyzeText(phrase, depth);

        String resultMessage = String.format("Analysis complete! Matches at depth %d: %d", depth, result);

        if (verbose) {
            resultMessage += "\nVerbose Mode Enabled";
        }

        return resultMessage;
    }
}