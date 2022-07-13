package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if(query.toLowerCase().contains("plus")){
            String[] s=query.split(" ");
            return (Integer.parseInt(s[s.length-1])+Integer.parseInt(s[s.length-3]))+"";
        }
        if(query.toLowerCase().contains("largest")){

        }
        return "";
    }
}
