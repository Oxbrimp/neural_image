import java.io.DataInputStream;
import java.io.FileInputStream;

public class MNISTLabelReader{
    public static int readLabel(String path, int index) throws Exception{
        try (DataInputStream reference = new DataInputStream(new FileInputStream(path))){
            reference.readInt(); // Numb
            reference.readInt(); // Number of labels

            reference.skipBytes(index);
            return reference.readUnsignedByte();

        }
    }
}