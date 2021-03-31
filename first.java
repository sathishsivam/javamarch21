
class one
  {
      one()
         {
             System.out.println("base class constructor..");           
         }   
      
       
      public void one(int x)
         {   
             System.out.println("second constructor..");
         }
  
      one(String name)
          {
              this.one(12);
              System.out.println("thrd constructor");             
          }
        
  }
 
class first
  {
     public static void main(String[]args)
      {
          one obj = new one("giri");
      }
   }