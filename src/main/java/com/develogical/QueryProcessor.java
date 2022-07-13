package com.develogical;

import static java.lang.Integer.parseInt;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if(query.toLowerCase().contains("largest")){
            String[] s=query.split("largest:");
            s=s[1].split(",");
            for(String t:s){
                t=t.trim();
            }
            int max=Integer.MIN_VALUE;
            for(String t:s){
                max=Math.max(parseInt(t),max);
            }
            return max+"";
        }
        if(query.toLowerCase().contains("plus")){
            String[] s=query.split(" ");
            return Integer.max(parseInt(s[s.length-1]), parseInt(s[s.length-2]))+"";
        }
        if(query.toLowerCase().contains("multiplied")){
            String[] s=query.split(" ");
            return (Integer.parseInt(s[s.length-1])*Integer.parseInt(s[s.length-4]))+"";
        }
        return "";
    }
}
