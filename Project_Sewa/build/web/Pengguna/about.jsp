<%-- 
    Document   : About
    Created on : Nov 30, 2019, 6:42:24 PM
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
                    <div class="section-top-border">
                        <div class="row">
                            <div class="col-md-6">
                                <img src="img/elements/g5.jpg" alt="" class="img-fluid" width="600px">
                            </div>
                            <div class="col-lg-6">
                                <h3 class="mb-30">Block Quotes</h3>
                                <blockquote class="generic-blockquote">
                                    “Recently, the US Federal government banned online casinos from operating in America by making it illegal to
				transfer money to them through any US bank or payment system. As a result of this law, most of the popular
				online casino networks such as Party Gaming and PlayTech left the United States. Overnight, online casino
				players found themselves being chased by the Federal government. But, after a fortnight, the online casino
				industry came up with a solution and new online casinos started taking root. These began to operate under a
				different business umbrella, and by doing that, rendered the transfer of money to and from them legal. A major
				part of this was enlisting electronic banking systems that would accept this new clarification and start doing
				business with me. Listed in this article are the electronic banking”
                                </blockquote>
                            </div>
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