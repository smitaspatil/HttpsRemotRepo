package com;

import java.io.File;

public class DisplayFileNames {
public static void main(String[] args) {
	String path="E:\\Company_Locker\\";
	File f=new File(path);
	File filen[]=f.listFiles();
	for(File ff:filen) {
		System.out.println(ff);
	}
	

}
}
