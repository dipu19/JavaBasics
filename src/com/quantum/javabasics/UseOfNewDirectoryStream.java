package com.quantum.javabasics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UseOfNewDirectoryStream {

	public static void main(String[] args) throws IOException
	{
		Files.newDirectoryStream(Paths.get("."))
		.forEach(System.out::println);
	}
}
