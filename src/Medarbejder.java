
public class Medarbejder extends Person {
  private String afdeling;
  
  public Medarbejder(String name, String afdeling) {
    super(name);
    
    this.afdeling = afdeling;
  }
  
  @Override
  public String toString() {
    return super.toString() + ", afdeling=" + afdeling;
  }
  
}
