package impl.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloWorld extends GenericPortlet {
        
    @RenderMode(name="VIEW")
    public void view(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Hello World");
    }
}
