public class Shopping {
    public static void main(String args[]){
        int [][][] cart=
        {//conveyar belt 1
            { //cart 1
                {20,10},            //perishable and non perishable items
                {10,30},
                {55,20},    
            },
            {  //cart 2
                {10,10},
                {5,5},
                {10,20},
            },
            {  //cart 3
                {30,50},
                {9,9},
                {40,60},  
            }
        };
        
        int[] cartprice=new int[3];          //total cost of each cart
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<2;k++){
                cartprice[i]+=cart[i][j][k];
            }
        }
    }

    for(int i=0;i<3;i++){   
        System.out.println("The total cost in cart "+i+": "+cartprice[i]);
    }
    System.out.println("All perishable items are sold");

    int maxnp=0;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(cart[i][j][1]>maxnp){
            int temp=maxnp;
            maxnp=cart[i][j][1];
            }
        }
    }
    System.out.println("The costliest non-perishable item is: "+maxnp);
}
}
