package Hash;

public class P3 {
    public static void main(String[] args) {
        
        String s="aacbcbaabzA"; //assuming all charectors are lowercase
        int freq[] = new int[256];
        int i;

        for(i=0;i<s.length();i++){

            char ch = s.charAt(i);
            freq[ch]++;
        }

        //print array
        for(i=0;i<freq.length;i++){
            if(freq[i]>0)
            System.out.println((char)(i)+" Occurs "+freq[i]+ " times");
        }

    }
}
