public class AESmain {
    public static void main(String[] args) {
        final String secretKey="donotspeakAboutTHIS";
        String originalString="Pranay_Dabhade";
        String encSite=AES.encrypt(originalString, secretKey);//encrypted
        String decSite=AES.decrypt(encSite, secretKey);//decrypted
        System.out.println("Original: "+originalString);
        System.out.println("Encrypted text: "+encSite);
        System.out.println("Decrypted text: "+decSite);
    }
}
  