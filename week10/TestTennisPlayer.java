public class TestTennisPlayer
{
  public static void main(String[] args)
  {
    PeregrimTennisPlayer tp1 = new PeregrimTennisPlayer();
    PeregrimTennisPlayer tp2 = new PeregrimTennisPlayer();
    
    tp1.setPlayerName("Reilly Opelka");
    tp1.setCountry("USA");
    
    tp1.setRank(26);
    tp1.setAge(24);
    
    tp1.setWins(21);
    tp1.setLosses(23);
    
    tp2.setPlayerName("Sofia Kenin");
    tp2.setCountry("USA");
    
    tp2.setRank(12);
    tp2.setAge(23);
    
    tp2.setWins(11);
    tp2.setLosses(10);
    
    System.out.println("Player 1 name: " + tp1.getPlayerName());
    System.out.println("Player 1 country: " + tp1.getCountry());
    System.out.println("Player 1 rank: " + tp1.getRank());
    System.out.println("Player 1 age: " + tp1.getAge());
    System.out.println("Player 1 wins: " + tp1.getWins());
    System.out.println("Player 1 losses: " + tp1.getLosses());
    System.out.println();
    System.out.println("Player 2 name: " + tp2.getPlayerName());
    System.out.println("Player 2 country: " + tp2.getCountry());
    System.out.println("Player 2 rank: " + tp2.getRank());
    System.out.println("Player 2 age: " + tp2.getAge());
    System.out.println("Player 2 wins: " + tp2.getWins());
    System.out.println("Player 2 losses: " + tp2.getLosses());
    
  }
}