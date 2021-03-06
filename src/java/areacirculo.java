

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/areacirculo"})
public class areacirculo extends HttpServlet {
    
    static String URL_CIRC = "<img src=\"img/circulo.png\" width=20%>";
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DecimalFormat formater = new DecimalFormat("#.00");
                
        double a = Double.parseDouble(request.getParameter("r"));
        
        double p = 2 * Math.PI * a;
        double area = Math.PI * Math.pow(a, 2);
        
        String forma = "Circulo";
        String imagem = URL_CIRC;
                
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
             out.println("<style>");
            
            out.println  ("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n" +"");
              out.println("</style>");  
            
            out.println("<style>");
            out.println("body{");
             out.println("margin: auto;");
              out.println(" margin-top: 20px;");
               out.println("margin-bottom: 300px;");
                out.println("background-color: lightblue;");
                 out.println(" }");
                  
                 
                 
                 out.println("h3{");
                   out.println("text-align: center;");
                      out.println("}");
                      
                      
                        out.println("p{");
                   out.println("text-align: center;");
                      out.println("}");
                      
                           out.println("img{");
                   out.println("display: block;");
                   out.println("  margin-left: auto;");
                    out.println("  margin-right: auto;");
                    out.println("}");
                    
                           out.println("input{");
                   out.println("display: block;");
                   out.println("  margin-left: auto;");
                    out.println("  margin-right: auto;");
                     out.println("background-color: lightgreen");

                      out.println("}");


                   

                   out.println("</style>");
                   
                 
                 
            out.println("</head>");
            out.println("<body>");
            
           
          
            
            
            
            
            
            
            out.println("<h3>Dimens??es " + forma + "</h3>");
            
            
            
            out.println();
              out.println(imagem);  
            out.println("<p>A <span style=\"color:#FF7F27\">??rea</span> do " + forma + " com raio " + formater.format(a) + " ?? de: " + formater.format(area) + " cm.</p>");
            
             out.println("<input type=\"button\" onclick=\"location.href='index.html';\" value=\"Ir para a P??gina Inicial das figuras\" />"); 
            
            out.println("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" +
               "");
             out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n" +
             "");
             out.println("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script> \n" +
                "");
             
            out.println("</body>");
            out.println("</html>");
        }
    }
}
