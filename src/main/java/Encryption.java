
public class Encryption {
    private String plainText;
    public Encryption(String plainText, int shift){
        this.plainText = plainText;
    }

    public  String getPlainText() {
      return this.plainText;
    }
}
