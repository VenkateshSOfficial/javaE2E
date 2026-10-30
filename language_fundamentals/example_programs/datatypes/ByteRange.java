public class ByteRange{
    public static void main(String[] args) {
        byte b=true;
    }
}

/* 
byte b =128
error: incompatible types: possible lossy conversion from int to byte
        byte b=128;

byte b=10.5
error: incompatible types: possible lossy conversion from double to byte
        byte b=10.5

byte b=true
error: incompatible types: boolean cannot be converted to byte
        byte b=true;
*/