package com.example.teste_wa.domain;

import java.util.ArrayList;
import java.util.List;

public class WordNode {
    private final String name;
    private final List<WordNode> children;

    public WordNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addChild(WordNode child) {
        this.children.add(child);
    }

    public List<WordNode> getChildren() {
        return children;
    }
}