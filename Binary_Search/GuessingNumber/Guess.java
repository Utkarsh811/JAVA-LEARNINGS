// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         long small=1;
//         long big=n;
//     long mid=0;
//         while(small<=big){//1<3
//             mid=(small+big);
//             mid=mid/2;//2
//             System.out.println("big="+big);
//             System.out.println("small="+small);
//               System.out.println("mid ="+mid);
//             if(guess((int)mid)==-1){
//                 big=mid-1;
//               //System.out.println("big="+big);
//             }
            
//             if(guess((int)mid)==1){//2<3
            
//                 small=mid+1;
//                   //System.out.println("small="+small);
                  
//             }
//             if(guess((int)mid)==0){
//                 System.out.println(mid) ;
//                 return (int)mid;
                
//             }
//         }
//         return (int)mid;
        
    
// }
// }