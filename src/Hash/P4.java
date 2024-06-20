package Hash;

public class P4 {

    public static void main(String[] args) {
        String s="aacbcbaabzA"; //assuming all charectors are lowercase
        int freq[] = new int[52];
        int i;
    
        for(i=0;i<s.length();i++){
    
            char ch = s.charAt(i);
            var c = (ch>=97)?freq[ch-97]++:freq[ch-65+26]++;

        }
    
        //print array
        for(i=0;i<freq.length;i++){
            if(freq[i]>0){
                char ch=(char)(i<=26?(i+97):(i-26+65));
                System.out.println(ch+" Occurs "+freq[i]+ " times");
            }
           
        }
    }
   

}