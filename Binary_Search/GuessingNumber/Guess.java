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


/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//         //System.out.println(n);
//         //System.out.println(guess(n));
//         int picknumber=0;
//         int lower=1;
//         int higher= n;
//         while(lower<=higher){
//             System.out.println(higher + "," + lower);
//         picknumber=lower+(higher-lower)/2;
//             System.out.println(picknumber);
//                System.out.println(guess(picknumber));
        
//         if(guess(picknumber) == 0){
//             return picknumber;
//         }
//         if(guess(picknumber)==-1){
//             higher=picknumber-1;
            
//         }
//         if(guess(picknumber)==1){//5<6
//             lower=picknumber+1;
//         }
//         }
//         return 0;
        
//     }
// }