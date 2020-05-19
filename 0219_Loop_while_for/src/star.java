
public class star {
   public static void main(String[] args) {
      int lineCount=5;//*찍을 라인 생성
      int spaceCount=lineCount/2+1;
      int starCount=1;
      
      for(int i=0;i<lineCount;i++) { //i=0,1,2,3,4
         for(int j=0;j<spaceCount;j++) {
            System.out.print(' ');
         }
         for (int j=0;j<starCount;j++) {
            System.out.print('*');
         }
         for(int j=0;j<spaceCount;j++) {
            System.out.print(' ');
         }
         System.out.println();
         if(i<=1) { //i=1 // st=3 sp=2  i=2
            starCount=starCount +2;
            spaceCount=spaceCount-1;
         }
         else {
            starCount=starCount -2;
            spaceCount=spaceCount+1;
         }

      }
      
   }
}