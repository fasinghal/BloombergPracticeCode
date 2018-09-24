package leetorg4g;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {

    public static ArrayList<ArrayList<String>> grpAnagrams(String [] words){

        int primes[] = {};

        HashMap<Integer, ArrayList<String>> h = new HashMap<>();

        if(words==null|| words.length ==0 ) return new ArrayList<ArrayList<String>>();

        for(int i=0;i<words.length;i++){
            int prod =1;
            for(int j=0;j<words[i].length();j++){
                prod *= primes[words[i].charAt(j)-'a'];
            }

            ArrayList<String> l = h.get(prod);
            if(l==null){
                l = new ArrayList<String>();
            }
            l.add(words[i]);
            h.put(prod, l);



        }
        ArrayList<java.util.ArrayList<String>> list = new ArrayList<>();
        h.forEach((k,v)->list.add(v));
        return list;

    }
}
