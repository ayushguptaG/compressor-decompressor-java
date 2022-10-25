/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compressor_decompressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author AYUSH
 */
public class decompressor {
    public static void method(File file) throws IOException{
        String fileDirectory= file.getParent();
        FileInputStream fis= new FileInputStream(file);
        GZIPInputStream gzipIS= new GZIPInputStream(fis);
        FileOutputStream fos= new FileOutputStream(fileDirectory + "/DecompressedFileCheck");
        
        byte[] buffer= new byte[1024];
        
        int len;
        while((len=gzipIS.read(buffer)) != -1) {
            System.out.println("length of file" + len);
            fos.write(buffer, 0 , len);
            
        }
        gzipIS.close();
        fis.close();
        fos.close();
        
    }
    public static void main(String[] args) throws IOException{
        File path = new File("G:\\compressor-project-2\\Compressedfile.gz");
        method(path);
        
        
    }
}
