package com.starwoodhotels.web.restfulws;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

@Path("/helloWS")
public class TestRestfulWS {

	@GET
    @Produces("text/html")
    public String getHelloWord() {
		CharArrayWriter charArrayWriter = new CharArrayWriter();
		PrintWriter writer = new PrintWriter(charArrayWriter);

        writer.println("<html>");
        
        writer.println("<head>");
        writer.println("<title>Hello World</title>");
        writer.println("</head>");
        
        writer.println("<body>");
        writer.println("<h1>Hello World Again!!</h1>");
        writer.println("</body>");
        
        writer.println("</html>");
		
		return charArrayWriter.toString();
    }
}
