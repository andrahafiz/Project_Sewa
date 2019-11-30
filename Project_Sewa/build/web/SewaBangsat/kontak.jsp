<%-- 
    Document   : Kontak
    Created on : Nov 27, 2019, 8:42:24 AM
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
					<h1>Hubungi Kami</h1>
					<nav class="d-flex align-items-center">
						<a href="index.jsp">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="kontak.jsp">Hubungi Kami</a>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->

        <!--================Contact Area =================-->
	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-4">
					
				</div>
				<div class="col-lg-6">
                                    <div class="login_form_inner" style="padding-bottom: 90px">
						<h3>Hubungi Kami</h3>
						<form class="row login_form" action="ceklogin.jsp" method="post" id="contactForm" novalidate="novalidate">
                                                    <div class="col-md-6 form-group">
                                                        <input type="text" class="form-control" id="name" name="nama_depan" placeholder="Nama Lengkap" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Nama Lengkap'">
                                                    </div>
                                                    <div class="col-md-6 form-group">
                                                        <input type="text" class="form-control" id="name" name="nama_belakang" placeholder="Alamat Email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Alamat Email'">
                                                    </div>
                                                    <div class="col-md-4 form-group">
                                                        <input type="text" class="form-control" id="name" name="nama_depan" placeholder="Subjek" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Subjek'">
                                                    </div>
                                                    <div class="col-md-8 form-group" style="padding-top: 14px">
                                                        <div class="form-select" id="default-select">
                                                            <select name="jenis">
                                                                <option>Pilih Topik</option>
                                                                <option value="kritik dan saran">Kritik & Saran</option>
                                                                <option value="konten yang ada">Konten Yang Ada</option>
                                                                <option value="design">Design</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 form-group">
                                                        <textarea class="single-textarea" name="alamat" placeholder="Pesan Anda" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Pesan Anda'"
                                                                  required></textarea>
                                                    </div>
                                                    <div class="col-md-12 form-group" style="padding-top: 10px">
							<button type="submit" value="submit" class="primary-btn">Log In</button>
                                                    </div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================Contact Area =================-->
        
	<!--================Contact Area =================-->
	<section class="contact_area section_gap_bottom">
		<div class="container">
			<div class="row">
                            <div class="col-lg-4"></div>
				<div class="col-lg-6">
                                    <center>
					<div class="contact_info">
						<div class="info_item">
							<i class="lnr lnr-home"></i>
							<h6>Pekanbaru, Riau, Indonesia</h6>
							<p>Jalan Sudirman No 43</p>
						</div>
                                                <div class="info_item">
							<i class="lnr lnr-calendar-full"></i>
							<h6>Pelayanan Consumer</h6>
							<p>Senin Hingga Jum'at <br>Dari Jam 8 Pagi Hingga 10 Malam</p>
						</div>
						<div class="info_item">
							<i class="lnr lnr-phone-handset"></i>
							<h6>Untuk Informasi Lebih Detail Dapat Menghubungi</h6>
							<p>No. 0813726180</p>
						</div>
					</div>
                                    </center>
				</div>
				
			</div>
		</div>
	</section>
	<!--================Contact Area =================-->
        
        
        
        
<%@include file="footer.jsp" %>

	<!--================Contact Success and Error message Area =================-->
	<div id="success" class="modal modal-message fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<i class="fa fa-close"></i>
					</button>
					<h2>Thank you</h2>
					<p>Your message is successfully sent...</p>
				</div>
			</div>
		</div>
	</div>

	<!-- Modals error -->

	<div id="error" class="modal modal-message fade" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<i class="fa fa-close"></i>
					</button>
					<h2>Sorry !</h2>
					<p> Something went wrong </p>
				</div>
			</div>
		</div>
	</div>
	<!--================End Contact Success and Error message Area =================-->


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