package com.practice;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadingPDF {
	
	@Test
	public void pdfTest() throws IOException {
		
		URL url = new URL("file:///E:/desktop/Objects%20First%20with%20Java,%205th%20Edition.pdf");
		
		InputStream is = url.openStream();
		BufferedInputStream filephar = new BufferedInputStream(is);
		PDDocument document = null;
		
		document = PDDocument.load(filephar);
		String pdfcontent = new PDFTextStripper().getText(document);
		System.out.println(pdfcontent);
		
		Assert.assertTrue(pdfcontent.contains("ONLINE ACCESS"));
		Assert.assertTrue(pdfcontent.contains("To log in after you have registered"));
		Assert.assertTrue(pdfcontent.contains("BlueJ"));
		Assert.assertTrue(pdfcontent.contains("Selection statements"));
		
	}

}
