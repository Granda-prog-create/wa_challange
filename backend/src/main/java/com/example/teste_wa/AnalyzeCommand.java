package com.example.teste_wa;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class AnalyzeCommand {

    @ShellMethod("Analyze a given phrase with a specific depth.")
    public String analyze(
        @ShellOption(value = "--depth", defaultValue = "1") int depth,
        @ShellOption(value = "--phrase") String phrase,
        @ShellOption(value = "--verbose", defaultValue = "false") boolean verbose
    ) {
        
        return "Analysis complete!"; 
    }
     
}

