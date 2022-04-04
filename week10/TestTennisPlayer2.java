public class TestTennisPlayer2
{
  public static void main(String[] args)
  {
    PeregrimTennisPlayer tp1 = new PeregrimTennisPlayer();
    PeregrimTennisPlayer tp2 = new PeregrimTennisPlayer("Serena Williams", "USA");
    PeregrimTennisPlayer tp3 = new PeregrimTennisPlayer("Simona Halep", "Romania", 20, 30);
    PeregrimTennisPlayer tp4 = new PeregrimTennisPlayer("Sloane Stephens", "USA", 65, 28, 18, 11);
    
    tp1.displayPlayer();
    tp2.displayPlayer();
    tp3.displayPlayer();
    tp4.displayPlayer();
    
    
   
    
  }
}