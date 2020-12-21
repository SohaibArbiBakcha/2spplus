/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageEleve;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import tools.cnx;

/**
 *
 * @author SpyECho
 */
public class insertClient extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String civi,cin,Prenom,nom,Adress,CodePs,Ville,Tele,Mail;
            civi=request.getParameter("civi");
            cin= request.getParameter("cin");
            Prenom = request.getParameter("prenom");
            nom = request.getParameter("nom");
            Adress = request.getParameter("adresse");
            CodePs = request.getParameter("codepostal");
            Ville = request.getParameter("ville");
            Tele= request.getParameter("telephone");
            Mail= request.getParameter("email");
            
            String nome,Prenome,naissane,Adresse,Villee,Codepse,maile,telee,nive,matiere [];
            
            nome     = request.getParameter("enom");
            Prenome  = request.getParameter("eprenom");
            naissane = request.getParameter("edaten");
            Adresse  = request.getParameter("eadresse");
            Villee   = request.getParameter("ville");
            Codepse  = request.getParameter("ecodepostal");
            maile    = request.getParameter("eemail");
            telee    = request.getParameter("etelephone");
            nive     = request.getParameter("eniveau");
            matiere = request.getParameter("matieres").split(",");
            
            JSONArray ary = new JSONArray();
            if (matiere.length>0){       
                
                for (int j = 0; j < matiere.length; j++) {
                    JSONObject obj  = new JSONObject();
                    obj.put("mat",matiere[j]);
                    ary.add(obj);
                }
                
            }
            
            String reqParents = "insert into parents values('"+cin+"','"+civi+"','"+nom+"','"+Prenom+"','"+Adress+"','"+Ville+"',"+CodePs+",'"+Tele+"','"+Mail+"')";
            String reqEleve = "insert into Eleve values (concat('ETU',eleveSeq.nextval),'"+nome+"','"+Prenome+"',to_date('"+naissane+"','yyyy-mm-dd'),'"+Adresse+"','"+Villee+"',"+Codepse+",'"+telee+"','"+maile+"','"+cin+"','"+nive+"','"+ary+"')";
            System.out.println(reqParents +"\n"+ reqEleve);
            
            try {
                ResultSet rs = cnx.getConnexion().createStatement().executeQuery("select * from Parents where cin = '"+cin+"'");
                
                if (rs.next()!=true) {
                    cnx.getConnexion().createStatement().executeUpdate(reqParents);
                   
                }       
                cnx.getConnexion().createStatement().executeQuery(reqEleve);
                
                request.setAttribute("ajoute","l'élève "+nome+" "+Prenome+" est ajouté ");
                request.getRequestDispatcher("inscription.jsp").forward(request, response);
            } catch (Exception e) {
                e.fillInStackTrace();
            }
            //request.getRequestDispatcher("inscription.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
