public class Solution {
    public string LargestGoodInteger(string num) {
        
        string res = "-100000";
        string str = "";
        for(int i=0;i<10;i++)
        {
            str = ""+i+i+i;
        
            if(num.Contains(str))
            {
                if(Convert.ToInt32(res)<Convert.ToInt32(str))
                {
                    res = str;
                }
                
            }
        }
        
        return res == "-100000"?"":res;
    }
}