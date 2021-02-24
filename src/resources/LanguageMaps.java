package resources;

import java.util.HashMap;
import java.util.Map;

public class LanguageMaps {
    public static final String PT_BR = new String("pt-br");
    public static final String EN_US = new String("en-us");
    private static Map portugueseStringMap = new HashMap();
    private static Map englishStringMap = new HashMap();

    public LanguageMaps(){
        setPortugeseStringMap();
        setEnglishStringMap();
    }

    private void setEnglishStringMap() {
        englishStringMap.put("greeting", "hello");
        englishStringMap.put("file", "File");
        englishStringMap.put("help", "Help");
    }

    private void setPortugeseStringMap() {
        portugueseStringMap.put("greeting","oi");
        portugueseStringMap.put("file", "Arquivo");
        portugueseStringMap.put("help", "Ajuda");
    }

    public Map getPortugueseStringMap(){
        return this.portugueseStringMap;
    }

    public Map getEnglishStringMap(){
        return this.englishStringMap;
    }

    public static void main(String[] args){
        LanguageMaps lm = new LanguageMaps();
        System.out.println(lm.getPortugueseStringMap().get("greeting"));
    }
}
