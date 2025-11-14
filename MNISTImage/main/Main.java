


public class Main{
    public static void main(String[] args){


    int counter = 0;
    


    int testIndex = 42;

        try{
            int[][] image = MNISTReader.readImage("../data/train-images-idx3-ubyte/train-images-idx3-ubyte", 0);
            int label = MNISTLabelReader.readLabel("../data/train-labels-idx1-ubyte/train-labels-idx1-ubyte", 0);
            //System.out.println("Labels " + label);

            MNISTViewer.image = image;
            MNISTViewer.main(args); // Launch FX port


            /** 
            for (int rows = 0; rows < image.length; rows++){
                for (int columns = 0; columns < 28; columns++){
                    //System.out.println(image[rows][columns] > 128 ? "#" : " ");
                }
                counter ++;
                //System.out.println();
            }
            */

           /**
            for (int r = 0; r < 28; r++){
                for (int c = 0; c < 28; c++){
                    System.out.println(image[r][c] > 128 ? '#' : " ");
                }
                System.out.println();
            }
            */

        } 
        catch (Exception e){
            System.out.println("Image load fail : " + e.getMessage());
        }

        //System.out.println(counter);
    }
}