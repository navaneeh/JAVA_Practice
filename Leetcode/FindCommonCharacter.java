package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacter {
    public static void main(String[] args) {

        String[] str={"testings","testin"
                ,"test"
        };
        ArrayList<HashMap<Character,Integer>> data=new ArrayList<HashMap<Character,Integer>>();

        for(int i=0;i<str.length;i++)
        {
            data.add(getOccurrence(str[i]));
        }

        System.out.println(countDataToAns(Matching(data)));
    }

    static HashMap<Character,Integer> getOccurrence(String str)
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            boolean isKeyExist=map.containsKey(c);
            if(isKeyExist)
            {
                map.put(c,map.get(c)+1);
            }else
            {
                map.put(c,1);
            }

        }

        return map;
    }

    static HashMap<Character,Integer> Matching(ArrayList<HashMap<Character,Integer>> data)
    {
        HashMap<Character,Integer> first_array=data.get(0);
        for(int i=1;i<data.size();i++)
        {
            HashMap<Character,Integer> temp = new  HashMap<Character,Integer> ();
            ;
            temp.putAll(first_array);

            HashMap<Character,Integer> current_value=data.get(i);
            for (Map.Entry<Character,Integer> entry : first_array.entrySet())
            {
                // entry.getValue()
               char c=entry.getKey();
              //  System.out.println(c);
                boolean isKeyExist=current_value.containsKey(c);
                if(isKeyExist)
                {
                    if(entry.getValue()>current_value.get(c))
                    {
                        temp.put(c,current_value.get(c));
                    }

                }else
                {
                    //System.out.println(c);
                    temp.remove(c);
                }
            }
            first_array=temp;
        }
        return  first_array;
    }

    public static List<String> countDataToAns(HashMap<Character,Integer> ans)
    {
        List<String> list=new ArrayList<String>();
        for(Map.Entry<Character,Integer> entry : ans.entrySet() )
        {
            int i=0;
            while(i<entry.getValue())
            {
                list.add(String.valueOf(entry.getKey()));
                i++;
            }

        }
        return list;
    }


}
