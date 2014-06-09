package com.starwoodhotels.web.servlet;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestServletTest {
	@Test
	public void doGetTest() {
		TestServlet testServlet = new TestServlet();
		
		// Set up mocks
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		PrintWriter writer = new PrintWriter(charArrayWriter);
		try {
			when(response.getWriter()).thenReturn(writer);
		} catch (Exception exception) {}
		
		// Execute test method
		try {
			testServlet.doGet(request, response);
		} catch (Exception exception) {
			fail("No exception should be thrown!");
		}

		// Verify
		String html = charArrayWriter.toString();
		assertTrue(html.contains("<h1>Hello World!!</h1>"));
	}
}
