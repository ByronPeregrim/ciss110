public class TestTennisPlayer3
{
  public static void main(String[] args)
  {
    
    PeregrimTennisPlayer tp1 = new PeregrimTennisPlayer("Nick Kyrgios", "Australia");
    PeregrimTennisPlayer tp2 = new PeregrimTennisPlayer("Coco Gauff", "USA", 22, 17, 19, 11);
    PeregrimTennisPlayer tp3 = new PeregrimTennisPlayer("Stefanos Tsitsipas", "Greece", 4, 23, 34, 15);
    
    tp1.displayPlayer();
    tp2.displayPlayer(); 
    tp3.displayPlayer();
   
  }
}