public class PeregrimTennisPlayer
{
  private String playerName;
  private String country;
  
  private int rank;
  private int age;
  
  private int wins;
  private int losses;

  public PeregrimTennisPlayer()
  {
    playerName = "";
    country = "";
    rank = 0;
    age = 0;
    wins = 0;
    losses = 0;
  }
  
  public PeregrimTennisPlayer(String n, String c)
  {
    playerName = n;
    country = c;
    rank = 0;
    age = 0;
    wins = 0;
    losses = 0;
  }

  public PeregrimTennisPlayer(String n, String c, int r, int a)
  {
    playerName = n;
    country = c;
    rank = r;
    age = a;
    wins = 0;
    losses = 0;
  }

  public PeregrimTennisPlayer(String n, String c, int r, int a, int w, int l)
  {
    playerName = n;
    country = c;
    rank = r;
    age = a;
    wins = w;
    losses = l;
  }


  public void setPlayerName(String n)
  {
    playerName = n;
  }
  public String getPlayerName()
  {
    return playerName;
  }

  public void setCountry(String c)
  {
    country = c;
  }
  public String getCountry()
  {
    return country;
  }

  public void setRank(int r)
  {
    rank = r;
  }
  public int getRank()
  {
    return rank;
  }

  public void setAge(int a)
  {
    age = a;
  }
  public int getAge()
  {
    return age;
  }

  public void setWins(int w)
  {
    wins = w;
  }
  public int getWins()
  {
    return wins;
  }

  public void setLosses(int l)
  {
    losses = l;
  }
  public int getLosses()
  {
    return losses;
  }

  public double calcWinPercentage()
  {
    double gamesPlayed = wins + losses;
    if (gamesPlayed == 0) 
    {
      return -1;
    }
    else 
    {
      return wins / gamesPlayed;
    }
  }

  public void displayPlayer()
  {
    System.out.println("----------------------------------");
    System.out.println("Tennis Player: " + playerName);
    System.out.println("Country: " + country);
    System.out.println("");
    System.out.println("Current Rank: " + rank);
    System.out.println("");
    System.out.println("Age: " + age);
    System.out.println("");
    System.out.println("Wins: " + wins);
    System.out.println("Losses: " + losses);
    System.out.println("");
    double winPercentage = calcWinPercentage() * 100;
    
    if (winPercentage > 0)
    {
      System.out.printf("Winning Percentage: %.1f%%", winPercentage);
    }
    else
    {
      System.out.println("Winning Percentage: No games played.");
    }

    System.out.println("");
    System.out.println("----------------------------------");
    System.out.println("");
  }



}