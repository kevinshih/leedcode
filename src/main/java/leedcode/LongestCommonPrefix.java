package leedcode;
/**
 * 
 * @author kevin.shih
 *Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        String answer = "";
        for(int i=0;i<strs[0].length();i++){
            int k=0;
            for(int j=1;j<strs.length;j++){
                if(i<=strs[j].length()-1)
                    if(strs[0].charAt(i)==strs[j].charAt(i))
                        k++;
            }
            if(k==strs.length-1){
                answer = answer+strs[0].charAt(i);
                System.out.println(answer);
            }else
                break;
        }
        return answer;
    }
	
	//另一個解法
	public String longestCommonPrefix2(String[] strs) {        
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        int i = 1;
        while (i < strs.length){
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }
	
	public static void main(String[] args) {
		String Str = new String("a");
        String SubStr1 = new String("ab");
 
        
        System.out.print("子字符串 SubStr1 第一次出现在Str的位置:" );
        System.out.println( Str.indexOf( SubStr1 ));
	}
}
