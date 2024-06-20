package Hash;

public class P2 {
    public static void main(String[] args) {
        
        String s="aacbcbaabzA"; //assuming all charectors are lowercase
        int freq[] = new int[52];
        int i;

        for(i=0;i<s.length();i++){

            char ch = s.charAt(i);
            freq[ch-97]++;
        }

        //print array
        for(i=0;i<freq.length;i++){
            if(freq[i]>0)
            System.out.println((char)(i+97)+" Occurs "+freq[i]+ " times");
        }

    }
}
