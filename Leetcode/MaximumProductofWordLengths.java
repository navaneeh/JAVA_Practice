package Leetcode;

public class MaximumProductofWordLengths {
    public static void main(String[] args) {
        //https://leetcode.com/problems/maximum-product-of-word-lengths/
        //String[] words={"abcw","baz","foo","bar","xtfn","abcdef"};
        String[] words={"edadc","ebbfe","aacdde","dfe","cb","fddddff","fabca","adccac","ece","ccaf","feba","bcb","edadc","aea","bacb","acefa","fcebffd","dfeebca","bedcbaa","deaccc","abedc","dadff","eef","ddebbb","abecab","cd","abdeee","eedce","deef","dceaddd","ced","fbbf","ba","eefeda","fb","cddc","adafbf","dded","aadbf","caefbaf","ccebf","dbb","ee","dadcecc","ddbcabb","afeaa","ec","aad","efde","cbcda","cdbdafd","cddc","ecaaa","ae","cfc","bccac","cdcc","abbbf","fcdface","ddbcdc","bfebb","daed","bc","dc","ecdfc","eeb","bb","dad","caecb","fbe","bbbc","cacea","dbc","fbe","bcfffbd","aeda","cff","ddfc","ea","bdfd","ccb","cb","ae","ceabefa","dcea","cbaed","bfedf","fa","ccd","fece","bceef","acabca","dafa","fdeec","dac","cae","adeeadb","ecacc","acfe","de"};
        int max_value=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++){
                int product=(words[i].length() * words[j].length());
                if(max_value<product) {
                    boolean check = notMatching(words[i], words[j]);
                    if (check) {
                        if (max_value < product) {
                            max_value = product;
                        }
                    }
                }
            }
        }
        System.out.println(max_value);

    }

    public static boolean notMatching(String A,String B)
    {
        for(int i=0;i<A.length();i++)
        {
            int b_length=B.length();
            int backward=b_length-1;

            for(int j = 0; j<b_length;j++,backward--)
            {
//
                if(A.charAt(i)==B.charAt(j) || A.charAt(i)==B.charAt(backward))
                {
                    return false;
                }

                if(j>=backward)
                {
                    break;
                }
            }
        }

        return true;
    }

    public static boolean notMatching2(String A,String B)
    {
        for(int i=0;i<A.length();i++)
        {
            int b_length=B.length();
            for(int j = 0; j<b_length;j++)
            {
                if(A.charAt(i)==B.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }


}
