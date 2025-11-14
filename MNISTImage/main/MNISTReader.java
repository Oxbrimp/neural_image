import java.io.DataInputStream;
import java.io.FileInputStream;


public class MNISTReader{

    public static int[][] readImage(String path, int index) throws Exception{
        try (DataInputStream reference = new DataInputStream(new FileInputStream(path))){

            int numberOfImages = reference.readInt();
            int numberOfRows = reference.readInt();
            int numberOfColumns = reference.readInt();

            int imageSize = numberOfColumns * numberOfRows;
            reference.skipBytes(index * imageSize); // skp to position

            int[][] image = new int[numberOfRows][numberOfColumns];
            for (int r = 0; r < numberOfRows; r++){
                for (int c = 0; c < numberOfColumns; c++){
                    image[r][c] = reference.readUnsignedByte();
                }
            }

            return image;
        }
    }


}