public class Decryption {
    private String cipherText;
    private int shift;
public Decryption(String cipherText,int shift){
this.cipherText = cipherText;
this.shift = shift;
}
    public  String getCipherText() {
        return this.cipherText;
    }
    public int getShift(){
    return this.shift;
    }
}
