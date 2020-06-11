import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloPostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello PostServlet");

        String adi = req.getParameter("adi");
        String soyadi = req.getParameter("soyadi");
        String kullaniciAdi = req.getParameter("kullaniciAdi");
        String sifre = req.getParameter("sifre");

        System.out.println("Adı: " + adi + " Soyadı: " + soyadi + " Kullanıcı Adı: " + kullaniciAdi + " Sifre: " + sifre);

        PrintWriter printWriter = resp.getWriter();

        printWriter.write("<html><body>");
        printWriter.write("<h1> Adı: " + adi + "</h1>");
        printWriter.write("<h1> Soyadı: " + soyadi + "</h1>");
        printWriter.write("<h1> Kullanıcı Adı: " + kullaniciAdi + "</h1>");
        printWriter.write("<h1> Şifresi: " + sifre + "</h1>");

    }
}