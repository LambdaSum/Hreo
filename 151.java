/*Author:���
*Time��10.1
*Questioin:���յ��ʷ�ת����
*Tips:��������ƥ�䵥��
*/
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        s="";
        for(int i=words.length-1;i>=0;i--){
         s=s+words[i];
         if(i>0)s+=" ";
        }
        return s;
    }
}