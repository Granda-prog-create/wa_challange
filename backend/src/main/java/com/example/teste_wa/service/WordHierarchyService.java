package com.example.teste_wa.service;

import com.example.teste_wa.domain.WordNode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Service
public class WordHierarchyService {
    private WordNode root;

    public void loadHierarchy(String jsonFilePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = getClass().getResourceAsStream(jsonFilePath);
        Map<String, Object> jsonMap = objectMapper.readValue(inputStream, new TypeReference<Map<String, Object>>() {});

        root = buildHierarchyTree(jsonMap);
    }

    private WordNode buildHierarchyTree(Map<String, Object> jsonMap) {
        WordNode rootNode = new WordNode("root");
        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            WordNode node = new WordNode(entry.getKey());
            addChildren(node, entry.getValue());
            rootNode.addChild(node);
        }
        return rootNode;
    }

    private void addChildren(WordNode parentNode, Object childObj) {
        if (childObj instanceof Map) {
            Map<String, Object> childMap = (Map<String, Object>) childObj;
            for (Map.Entry<String, Object> entry : childMap.entrySet()) {
                WordNode childNode = new WordNode(entry.getKey());
                parentNode.addChild(childNode);
                addChildren(childNode, entry.getValue());
            }
        }
    }

    public WordNode getRoot() {
        return root;
    }
}