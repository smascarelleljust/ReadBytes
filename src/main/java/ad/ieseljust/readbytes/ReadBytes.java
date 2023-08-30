/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ad.ieseljust.readbytes;

import java.io.*;

/**
 *
 * @author Samuel
 */
public class ReadBytes {

    public static void main(String[] args) throws IOException
    {
        byte data[] = new byte[10];
        System.err.println("Enter some characters:");
        System.in.read(data);
        System.out.println("Has introducido: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i] );
        }
    }
}
