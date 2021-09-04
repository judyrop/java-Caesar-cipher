
public class Encryption {
    private String plainText;
    private int shift;
    public Encryption(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }

    public  String getPlainText() {
      return this.plainText;
    }
    public int getShift(){
        return this.shift;
    }
}
