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
        englishStringMap.put("open", "Open");
        englishStringMap.put("close", "Close");
        englishStringMap.put("about", "About");
        englishStringMap.put("loginScreenTitle", "Login");
        englishStringMap.put("login", "Login");
        englishStringMap.put("username", "Username");
        englishStringMap.put("password", "Password");
    }

    private void setPortugeseStringMap() {
        portugueseStringMap.put("greeting","oi");
        portugueseStringMap.put("file", "Arquivo");
        portugueseStringMap.put("help", "Ajuda");
        portugueseStringMap.put("open", "Abrir");
        portugueseStringMap.put("close", "Fechar");
        portugueseStringMap.put("about", "Sobre");
        portugueseStringMap.put("loginScreenTitle", "Login");
        portugueseStringMap.put("login", "Login");
        portugueseStringMap.put("username", "Usuário");
        portugueseStringMap.put("password", "Senha");
    }

    public Map getPortugueseStringMap(){
        return this.portugueseStringMap;
    }

    public Map getEnglishStringMap(){
        return this.englishStringMap;
    }
}
