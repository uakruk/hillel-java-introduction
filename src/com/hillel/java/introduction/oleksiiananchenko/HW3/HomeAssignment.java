package com.hillel.java.introduction.oleksiiananchenko;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Objects;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class HomeAssignment {

    public static void main(String[] args) {
        try {
            InputStream imageInputStream = new BufferedInputStream(Objects.requireNonNull(ClassLoader.getSystemResourceAsStream("image.jpg")));
            BufferedImage image = ImageIO.read(imageInputStream);

            if (image == null) {
                System.err.println("Failed to load image, aborting.");
                return;
            }

            int imageHeight = image.getHeight();
            int imageWidth = image.getWidth();

            int[] originalImageData = image.getRGB(0, 0, imageWidth, imageHeight, null, 0, imageWidth);

            System.out.println("Image rgb values = " + originalImageData.length);

            int[] newImageData = new int[originalImageData.length];

            // the RGB format:
            // We've got an array of integers. Each integer represents exactly ONE pixel. Each pixel is made of 3 colors: RED, GREEN and BLUE
            // The color value range is 0..255
            // They are "packed" inside the int, so you need to extract them.
            // For example, lets have rgb(255, 128, 10), which means RED = 255, GREEN = 128 and BLUE = 10;
            // in the binary format it would look like: [ 00000000   11111111   10000000   00001010 ]
            // which means                              [ not used   red=255    green=128  blue=10  ]
            // You need to extract each color value from this 4-byte pixel using the shifts and bitwise operations
            // The ">>", "&", "0xFF", "<<", "|" are your best friends here.



            for (int i = 0; i < originalImageData.length; i++) { // 1. create the for loop, go through the originalImageData array
                int red = (originalImageData[i] >> 16) & 0xFF;
                int green = (originalImageData[i] >> 8) & 0xFF;
                int blue = originalImageData[i] & 0xFF; // 2. extract red green and blue values from each pixel

                int newPixel = 0;
                newImageData[i] = newPixel;

                int imageParts = imageHeight / 4;
                int pixel = 0;

                if ( i % 100 == 0 && i % imageWidth != 0) { // 3*.Make each 100th pixel white, red, blue or green (red for the first 1/4 of image, green from the next 1/4 of image, blue for the next 1/4 of image and white for the rest)
                    if (i / imageWidth < imageParts) {
                        pixel =  0xFF << 16;

                    } else if ( i / imageWidth < imageParts * 2 ){
                        pixel =  0xFF << 8;
                    } else if ( i / imageWidth < imageParts * 3) {
                        pixel =  0xFF;
                    } else {
                        pixel = 0xFFFFFF;
                    }
                } else {
                    red = ((int)(red*0.9)) & 0xFF;  // 4. decrease RED value by 10%
                    green = ((int)(green*1.3)) & 0xFF; // 4. increase GREEN value by 30%
                    blue = ((int)(blue*2)) & 0xFF; // 5. double the BLUE value (multiply by 2)
                    pixel = (red << 16) | (green << 8) | blue; // 6. Create the pixel from the values you've just changed. You also need here shifting and bitwise operations.
                }

                newImageData[i] = pixel; // 7. Assign the pixel value to the corresponding pixel in the newImageData array. Use the same index as for the originalImageData. (just the "i" value inside the loop)
            }





            // REMEMBER: each pixel cannot exceed value of 255, so make sure you're not exceeding these values while you're increasing it.
            // Also remember about explicit type casting, you'll probably need it there.


            // 8. See the result.jpg inside the project folder. It should look like the original images but with "wrong" colors.

            // here is your code.

            // -------------------------

            BufferedImage resultImage = new BufferedImage(imageWidth, imageHeight, TYPE_INT_RGB);

            resultImage.setRGB(0, 0, imageWidth, imageHeight, newImageData, 0, imageWidth);

            ImageIO.write(resultImage, "jpg", new File("result.jpg"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
