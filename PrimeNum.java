import java.util.*;

import javax.sound.midi.SysexMessage;


public class PrimeNum {
    public static void main(String[] args) {
        // int count =0;
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        // for(int i=a;i<=b;i++){
        //     for(int j=2;j<=i/2;j++){
        //         // if(count<3){
        //         //     if(isPrime(i)){
        //         //         System.out.println(i);
        //         //         count++;
        //         //     }
        //         // }
        //         alternatePrime(a, b);
                
        //     }
        // }
        // int count =0;
        // for(int n=a;n<=b;n++){
            
        //         boolean flag=true;
        //         if(n<=1){
        //             continue;
        //         }
        //         for(int i=2;i<=n/2;i++){
        //             if(n%i ==0){
        //                 flag =false;
        //                 break;
        //             }

        //         }
        //         if(flag){
        //             count++;
        //             if(count%2 !=0){
        //                 System.out.println(n);
        //             }
        //         }
            
        // }
        
        largestPrime(a, b);
       

    }

    // public static boolean isPrime(int n){
        
    //     boolean flag= true;
    //     if(n<=1) continue;

    //     for(int i=2;i<=n/2;i++){
    //         if(n%i == 0){
    //             flag =false;
    //             return flag;
    //         }
    //     }
    //     return flag;
    // }

    public static void alternatePrime(int a,int b){
    
    int count=0;
    int n;
    for(n=a;n<=b;n++){
boolean flag =true;
if(n<=1) continue;
        for(int j=2;j<= n;j++){
            if(n%j ==0){
                flag =false;
                break;
            }

        }
        if(flag){
            count++;
            if(count%2!=0){
                System.out.println(n);
            }
        }
    }
}

public static void largestPrime(int a,int b){
    int n;
    for(n=b;n<=a;n--){
        boolean flag =true;
        if(n<=1){
            continue;
        }
        for(int i =2;i<=n/2;i++){
            
            if(n%i==0){
                flag =false;
                break;
            }

        }if(flag){
            System.out.println(n);
            break;
        }
        
    }
    
}


}

