import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet başlatılıyor.");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        LocalDate localDate = LocalDate.now();

        PrintWriter printWriter = resp.getWriter();

        printWriter.print("<html><body>");
        printWriter.print("<h1>Merhaba Servlet</h1>");
        printWriter.print("<h1>Today: " + localDate + "</h1>");
        if (userName != null) {
            printWriter.print("<h1>" + userName + "</h1>");
        }

        if (password != null) {
            printWriter.print("<h1>" + password + "</h1>");
        }

        printWriter.print("</body></html>");

    }

    @Override
    public void destroy() {
        System.out.println("Servlet sonlandırılıyor..");

    }

}