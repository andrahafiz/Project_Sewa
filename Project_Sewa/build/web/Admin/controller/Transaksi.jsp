<%@page import="Admin.Method_Transaksi" %>
<%@page import="Admin.Transaksi" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Method_Transaksi transfaced = new Method_Transaksi();
    Transaksi[] dataTransaksi = transfaced.getDataTransaksi();
    String pesan = request.getParameter("pesan");

%>
<div class="main-content">
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="table-responsive table--no-card m-b-30">
                        <table class="table table-borderless table-striped table-earning">
                            <thead>
                                <tr>

                                    <th>No</th>
                                    <th>Transaksi ID</th>
                                    <th>Nama Penyewa</th>
                                    <th >Barang sewa</th>
                                    <th >Tanggal Peminjaman</th>
                                    <th >Tanggal Pemulangan</th>
                                    <th>total</th>
                                    <th >Status Pembayaran</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%                                    for (int i = 0; i < dataTransaksi.length; i++) {%>
                                <tr>
                                    <td> <% out.print((i + 1)); %></td>
                                    <td><% out.print(dataTransaksi[i].getTransaksi_id()); %></td>
                                    <td><% out.print(dataTransaksi[i].getPenyewa_nama()); %></td>
                                    <td><% out.print(dataTransaksi[i].getBarang_nama()); %> (<% out.print(dataTransaksi[i].getBarang_id()); %>)</td>
                                    <td><% out.print(dataTransaksi[i].getTransaksi_tglsewa()); %></td>
                                    <td><% out.print(dataTransaksi[i].getTransaksi_tglkembali()); %></td>
                                    <td>Rp. <% out.print(dataTransaksi[i].getTransaksi_total()); %></td>
                                    <td> <% String key = null;
                                        if (dataTransaksi[i].getTransaksi_status().equalsIgnoreCase("lunas")) {
                                            out.print("<span class='status--process'>" + dataTransaksi[i].getTransaksi_status() + "</span>");
                                        } else {
                                            out.print("<span class='status--denied'>" + dataTransaksi[i].getTransaksi_status() + "</span>");
                                        }%></td>




                                </tr>
                                <%}%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>