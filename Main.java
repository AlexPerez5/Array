class Main {
  public static void main(String[] args) {
   String [] food = {"Pizza", "Taco", "Hamburger", "Hotdog", "Fries", "Chicken", "Cake"};
   for (int  i = 0; i<6; i++){
     System.out.println(food[i]);
   }

   food[6] = "Cheese";

   
     System.out.print("\n Here is our updated list: \n");

     for(int i = 0; i <food.length; i++){
        System.out.println(food[i]);

        for(int t = 6; t >=0; t--){
          System.out.println(food[i]);
        }
     } 
  }
 }
