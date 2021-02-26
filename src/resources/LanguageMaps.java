package resources;

import java.util.HashMap;
import java.util.Map;

public class LanguageMaps {

    public static final String PT_BR = new String("pt-br");
    public static final String EN_US = new String("en-us");
    private static final Map portugueseStringMap = new HashMap();
    private static final Map englishStringMap = new HashMap();

    public LanguageMaps(){
        setPortugeseStringMap();
        setEnglishStringMap();
    }

    private void setEnglishStringMap() {
        englishStringMap.put("greeting", "hello");
        englishStringMap.put("file", "File");
        englishStringMap.put("help", "Help");
        englishStringMap.put("new", "New");
        englishStringMap.put("open", "Open");
        englishStringMap.put("close", "Close");
        englishStringMap.put("about", "About");
        englishStringMap.put("student", "Student");
        englishStringMap.put("grade", "Grade");
        englishStringMap.put("loginScreenTitle", "Login");
        englishStringMap.put("login", "Login");
        englishStringMap.put("username", "Username");
        englishStringMap.put("password", "Password");
    }

    private void setPortugeseStringMap() {
        portugueseStringMap.put("greeting","oi");
        portugueseStringMap.put("file", "Arquivo");
        portugueseStringMap.put("help", "Ajuda");
        portugueseStringMap.put("new", "Novo");
        portugueseStringMap.put("open", "Abrir");
        portugueseStringMap.put("close", "Fechar");
        portugueseStringMap.put("about", "Sobre");
        portugueseStringMap.put("student", "Aluno");
        portugueseStringMap.put("grade", "Nota");
        portugueseStringMap.put("loginScreenTitle", "Login");
        portugueseStringMap.put("login", "Login");
        portugueseStringMap.put("username", "Usuário");
        portugueseStringMap.put("password", "Senha");
    }

    public static Map getPortugueseStringMap(){
        return portugueseStringMap;
    }

    public static Map getEnglishStringMap(){
        return englishStringMap;
    }
}
