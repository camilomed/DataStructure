package reverseNum;

public class reverseM1 {
	public int reverse(int x) {

	       

        String str = String.valueOf(x);
        int dirrection=1;
        String strModify="";
        if(str.charAt(0)==('-')){
             strModify = str.substring(1);
            dirrection=-dirrection;
        }else{
            strModify=str;
        }
        if(x >= 0 && x <= 9){
            return x;
        }

        StringBuilder sB= new StringBuilder();
        for(int i=strModify.length()-1;i>=0;i--){
            sB.append(strModify.charAt(i));
        }


        long reversedLong = Long.parseLong(sB.toString());
        while(reversedLong%10==0){
                reversedLong=reversedLong/10;
            }
        if (reversedLong > Integer.MAX_VALUE || reversedLong < Integer.MIN_VALUE) {
            return 0;
        }
       

       
            
       
        return (int) reversedLong*dirrection;
    }

}
