package resources;

import java.util.HashMap;
import java.util.Map;

public class LanguageMaps {
    private static Map portugueseStringMap = new HashMap();
    private static Map englishStringMap = new HashMap();

    public LanguageMaps(){
        setPortugeseStringMap();
        setEnglishStringMap();
    }

    private void setEnglishStringMap() {

    }

    private void setPortugeseStringMap() {
        portugueseStringMap.put("greeting","oi");
    }

    public Map getPortugueseStringMap(){
        return this.portugueseStringMap;
    }

    public static void main(String[] args){
        LanguageMaps lm = new LanguageMaps();
        System.out.println(lm.getPortugueseStringMap().get("greeting"));
    }
}
