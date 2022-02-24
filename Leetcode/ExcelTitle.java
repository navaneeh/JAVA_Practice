package Leetcode;
// https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelTitle {
    public static void main(String[] args) {
        int n=703;
        System.out.println(convertToTitleOptimized(n));

    }

        public static String convertToTitle(int columnNumber) {
            StringBuilder res=new StringBuilder();
            char temp;
            boolean checked=false;
            while(columnNumber>=0)
            {
                if(columnNumber<=26)
                {
                    int num=(columnNumber-1)+'A';
                    temp=(char)num;
                    res.append(temp);
                    break;
                }

                int cuurent_letter=columnNumber%26;
                int num2;

                if(cuurent_letter==0)
                {
                    int carry=(columnNumber/26);
                    num2=carry-2+'A';
                    checked=true;
                    columnNumber=(columnNumber/carry);
                }else
                {
                    num2=(cuurent_letter-1)+'A';
                    columnNumber/=26;
                }
                temp =(char)num2;
                res.append(temp);
            }
            if(checked)
            {
                return res.toString();
            }
            else
            {
                return res.reverse().toString();
            }


        }

        public static String convertToTitleOptimized(int columnNumber) {
            StringBuilder sb = new StringBuilder();
            while (columnNumber > 0) {
                columnNumber--;
                int k = columnNumber % 26;
                sb.append((char)(k+'A'));
                columnNumber /= 26;

            }
            return sb.reverse().toString();
        }


}
