package _3arrays;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
		System.out.println(checkIfPangram(sentence));
	}
	
	public static boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if(len < 26){
            return false;
        }
        if(sentence == null || len == 0){
            return false;
        }

        String sen = sentence.toLowerCase();
        for(int i = 0; i < len; ++i){
            int flag = 0;
            for(int j = 97; j < 123; ++j){
                if((char)(j) == sentence.charAt(i)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return false;
            }
        }

        return true;
    }

}
