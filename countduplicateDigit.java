
public class UniqueRepeatingDigits {
    public static int countUniqueRepeatingDigits(int number) {
 number=Math.abs(number);
 
 int digitCount[]=new int[10];
 
 
 while(number>0){
   int digit=number%10;
   digitCount[digit]++;
   number/=10;
 }
 int repetecount=0;
 for (int i=0;i<digitCount.length ;i++ ){
   if(digitCount[i]>1){
     repetecount++;
   }
 } 
        
        return repetecount;
    }

    public static void main(String[] args) {
        int number = 1223334444;
        int result = countUniqueRepeatingDigits(number);
        System.out.println("Count of unique repeating digits: " + result);
    }
}
