/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class UpdateBarangAction extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String pesan = null;
            String mes = null;
            String kode = request.getParameter("kode");
            String kode_barang = request.getParameter("kode-input");
            String nama_barang = request.getParameter("nama-input");
            int harga_barang = Integer.parseInt(request.getParameter("harga-input"));
            String satuan_barang = request.getParameter("satuan-input");
            String deskripsi_barang = request.getParameter("deskripsi-input");
            String foto_barang = "non-image.png";
            String kondisi_barang = request.getParameter("kondisi");
            String kategori_barang = request.getParameter("kategori");
            String status_barang = request.getParameter("status");
            if (status_barang == null) {
                status_barang = "True";
            }

            J_Barang sup = new J_Barang();
            sup.setBarang_id(kode_barang);
            sup.setBarang_nama(nama_barang);
            sup.setBarang_harga(harga_barang);
            sup.setBarang_satuan(satuan_barang);
            sup.setBarang_deskripsi(deskripsi_barang);
            sup.setBarang_foto(foto_barang);
            sup.setBarang_keadaan(kondisi_barang);
            sup.setKategori_nama(kategori_barang);
            sup.setBarang_status(Boolean.parseBoolean(status_barang));

            String update = "UPDATE `tb_barang` SET "
                    + "`barang_nama` = '" + nama_barang + "', "
                    + "`barang_harga` = '" + harga_barang + "', "
                    + "`barang_satuan` = '" + satuan_barang + "', "
                    + "`barang_deskripsi` = '" + deskripsi_barang + "', "
                    + "`barang_foto` = 'non-image.png', "
                    + "`barang_kondisi` = '" + kondisi_barang + "',"
                    + "`barang_kategori` ='" + kategori_barang + "', "
                    + "`barang_status` = '" + status_barang + "' "
                    + "WHERE `tb_barang`.`barang_id` = '" + kode_barang + "'";
            out.print(update);
//
            Method_Barang supplierbean = new Method_Barang();
            if (supplierbean.edit(sup) == true) {
                pesan = "succesedit";
            } else {
                pesan = "failededit";
            }
            request.setAttribute("pesan", pesan);
            request.setAttribute("mes", mes);
            request.setAttribute("kode", kode);
//
            RequestDispatcher control = null;
            response.sendRedirect("Admin/view/ViewBarang.jsp?pesan=" + pesan);
        } finally {
            out.close();
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
