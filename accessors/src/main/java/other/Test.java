package other;

/**
 * Author: Alan Christensen
 * 12/19/2014
 */
public class Test {
  private String privateValue;
  protected String protectedValue;
  public String publicValue;

  public String getPrivateValue() {
    return privateValue;
  }

  public void setPrivateValue(String privateValue) {
    this.privateValue = privateValue;
  }

  public String getProtectedValue() {
    return protectedValue;
  }

  public void setProtectedValue(String protectedValue) {
    this.protectedValue = protectedValue;
  }

  public String getPublicValue() {
    return publicValue;
  }

  public void setPublicValue(String publicValue) {
    this.publicValue = publicValue;
  }
}
