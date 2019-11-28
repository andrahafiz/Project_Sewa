<%-- 
    Document   : registrasi
    Created on : Nov 28, 2019, 9:41:17 PM
    Author     : Abdul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">

    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" content="CodePixar">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>Karma Shop</title>

        <!--
                CSS
                ============================================= -->
        <link rel="stylesheet" href="css/linearicons.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="css/themify-icons.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="css/nouislider.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
    </head>

    <body>

        <%@include file="header.jsp" %>

        <!-- Start Banner Area -->
        <section class="banner-area organic-breadcrumb">
            <div class="container">
                <div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
                    <div class="col-first">
                        <h1>Login/Register</h1>
                        <nav class="d-flex align-items-center">
                            <a href="index.jsp">Home<span class="lnr lnr-arrow-right"></span></a>
                            <a href="login.jsp">Login</a>
                            <a href="registrasi.jsp">/Register</a>
                        </nav>
                    </div>
                </div>
            </div>
        </section>
        <!-- End Banner Area -->

        <!--================Login Box Area =================-->
        <section class="login_box_area section_gap">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="login_form_inner">
                            <h3>Registrasi</h3><br>
                            <form class="row login_form" action="contact_process.php" method="post" id="contactForm" novalidate="novalidate" style="
                                  max-width: 800px;
                                  ">
                                <div class="col-md-6 form-group">
                                    <input type="text" class="form-control" id="name" name="nama_depan" placeholder="Nama Depan" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Nama Depan'">
                                </div>
                                <div class="col-md-6 form-group">
                                    <input type="text" class="form-control" id="name" name="nama_belakang" placeholder="Nama Belakang" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Nama Belakang'">
                                </div>
                                <div class="col-md-12 form-group">
                                    <input type="email" class="form-control" id="name" name="email" placeholder="Alamat Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Alamat Email'">
                                </div>
                                <div class="col-md-12 form-group">
                                    <input type="text" class="form-control" id="name" name="username" placeholder="Username" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Username'">
                                </div>
                                <div class="col-md-12 form-group">
                                    <input type="password" class="form-control" id="name" name="password" placeholder="Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Password'">
                                </div>
                                <div class="col-md-12 form-group">
                                    <input type="password" class="form-control" id="name" name="password" placeholder="Re-Password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Re-Password'">
                                </div>
                                <div class="col-md-4 form-group">
                                    <div class="form-select" id="default-select">
                                        <select name="jenis">
                                            <option value="0">Jenis Kelamin</option>
                                            <option value="Laki Laki">Laki Laki</option>
                                            <option value="Perempuan">Perempuan</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-md-12 form-group">
                                    <textarea class="single-textarea" name="alamat" placeholder="Alamat Rumah" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Alamat Rumah'"
                                              required></textarea>
                                </div>
                                <div class="col-md-12 form-group">
                                    <input type="text" class="form-control" id="name" name="nohp" placeholder="No HP/Telepon" onfocus="this.placeholder = ''" onblur="this.placeholder = 'No HP/Telepon'">
                                </div>

                                <div class="col-md-12 form-group">
                                    <div class="creat_account">
                                        <input type="checkbox" id="f-option2" name="selector">
                                        <label for="f-option2">Menerima Syarat Dan Ketentuan Yang Ada</label>
                                    </div>
                                </div>
                                <div class="col-md-4 form-group">
                                    <button type="submit" value="submit" class="primary-btn">Daftar</button>
                                    <a href="login.jsp">Sudah Memiliki Akun</a>
                                </div>



                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Login Box Area =================-->


        <%@include file="footer.jsp" %>


        <script src="js/vendor/jquery-2.2.4.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
        crossorigin="anonymous"></script>
        <script src="js/vendor/bootstrap.min.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery.sticky.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <!--gmaps Js-->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
        <script src="js/gmaps.min.js"></script>
        <script src="js/main.js"></script>
    </body>

</html>