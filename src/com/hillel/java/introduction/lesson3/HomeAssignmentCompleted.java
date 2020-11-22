package com.hillel.java.introduction.lesson3;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.stream.Stream;

import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class HomeAssignmentCompleted {

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

            System.out.println("Image has alpha channel? " + image.getAlphaRaster() != null);

            int[] imageRgb = image.getRGB(0, 0, imageWidth, imageHeight, null, 0, imageWidth);

            System.out.println("Image rgb values = " + imageRgb.length);
            System.out.println("Image type = " + image.getType());


            int[] newImageData = new int[imageRgb.length];

            int imagePart = imageHeight / 4;

            for (int i = 0; i < newImageData.length; i++) {
                int red = imageRgb[i] >> 16 & 0xFF;
                int green = imageRgb[i] >> 8 & 0xFF;
                int blue = imageRgb[i] & 0xFF;

                if (i % 100 == 0 &&  i % imageWidth != 0) {
                    if (i / imageWidth < imagePart) {
                        newImageData[i] = 0xFF << 16;
                    } else if (i / imageWidth < imagePart * 2) {
                        newImageData[i] = 0xFF << 8;
                  //      System.out.println(Integer.toBinaryString(newImageData[i]));
                    } else if (i / imageWidth < imagePart * 3) {
                        newImageData[i] = 0xFF;
                    } else {
                        newImageData[i] = 0x00FFFFFF;
                    }
                } else {
                    newImageData[i] = ((int) (red * 0.9) & 0xFF) << 16 | ((int) (green * 1.3) & 0xFF) << 8 | blue * 2 & 0xFF;
                //    System.out.printf("red %d green %d blue %d\n", red, green, blue);
            //        System.out.println(Integer.toBinaryString(newImageData[i]));
                }
            }

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
