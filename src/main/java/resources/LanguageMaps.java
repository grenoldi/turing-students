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
        englishStringMap.put("turing", "Turing Academy");
        englishStringMap.put("new-student", "New student");
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
        englishStringMap.put("name", "Name");
        englishStringMap.put("social","Social ID");
        englishStringMap.put("telephone","Telephone number");
        englishStringMap.put("address" , "Address");
        englishStringMap.put("street", "Street");
        englishStringMap.put("uf","UF");
        englishStringMap.put("zip-code","Zip code");
        englishStringMap.put("number", "Number");
        englishStringMap.put("save", "Save");
        englishStringMap.put("personal-data", "Personal data");
    }

    private void setPortugeseStringMap() {
        portugueseStringMap.put("greeting","oi");
        portugueseStringMap.put("turing", "Academia Turing");
        portugueseStringMap.put("new-student", "Novo aluno");
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
        portugueseStringMap.put("name", "Nome");
        portugueseStringMap.put("social","CPF");
        portugueseStringMap.put("telephone","Telefone");
        portugueseStringMap.put("address" , "Endereço");
        portugueseStringMap.put("street", "Rua");
        portugueseStringMap.put("uf","UF");
        portugueseStringMap.put("zip-code","CEP");
        portugueseStringMap.put("number", "Numero");
        portugueseStringMap.put("save", "Salvar");
        portugueseStringMap.put("personal-data", "Dados pessoais");
    }

    public static Map getPortugueseStringMap(){
        return portugueseStringMap;
    }

    public static Map getEnglishStringMap(){
        return englishStringMap;
    }

    public static Map getCurrentStringMap(String language){
        if (language.equals(LanguageMaps.PT_BR)) return portugueseStringMap;
        if (language.equals(LanguageMaps.EN_US)) return englishStringMap;
        return null;
    }
}
