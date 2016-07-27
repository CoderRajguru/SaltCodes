<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="http://maps.google.com/maps/api/js?key=AIzaSyBq6flzjcN8vDzV_Ox8GLZmzqpXxtoq-Ss&sensor=false"></script>
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.10.1.min.js"></script>
<script>
    $(document).ready(function() {
    	 $("button").click(function(){ 
    		 
          $.ajax({
        	  	type:"POST",
        	  	cache:"false",
        	  	data:{"Key":'John'},
        	  	url:"${pageContext.request.contextPath}/C_L1_GMapData",
        	  	
        	  	success:function(locations)
        	  	{
        	  		
        	  		
        	  		 var iconURLPrefix = 'http://maps.google.com/mapfiles/ms/micons/';
        	  	    
        	  	     var icons = [
        	  	        		  iconURLPrefix + 'green-dot.png',
        	  					  iconURLPrefix + 'green-dot.png',
        	  					  iconURLPrefix + 'green-dot.png'
        	  					];

        	  	    var icons_length = icons.length;
        	  	    
        	  	    
        	  	    var shadow = {
        	  	      anchor: new google.maps.Point(15,33),
        	  	      url: iconURLPrefix + 'msmarker.shadow.png'
        	  	    };
					
        	  	    
        	  	    
        	  	    var map = new google.maps.Map(document.getElementById('map'), {
        	  	      zoom: 5,
        	  	      center: new google.maps.LatLng(35.428134, -97.115195),
        	  	      mapTypeId: google.maps.MapTypeId.ROADMAP,
        	  	      mapTypeControl: false,
        	  	      streetViewControl: false,
        	  	      panControl: false,
        	  	      zoomControlOptions: {
        	  	         position: google.maps.ControlPosition.LEFT_BOTTOM
        	  	      }
        	  	    });

        	  	    var infowindow = new google.maps.InfoWindow({
        	  	      maxWidth: 160
        	  	    });

        	  	    var marker;
        	  	    var markers = new Array();
        	  	    
        	  	    var iconCounter = 0;
        	  	    
        	  	    // Add the markers and infowindows to the map
        	  	    for (var i = 0; i < locations.length; i++) {  
        	  	      marker = new google.maps.Marker({
        	  	        position: new google.maps.LatLng(locations[i][1], locations[i][2]),
        	  	        map: map,
        	  	        shadow: shadow
        	  	      });

        	  	      markers.push(marker);

        	  	      google.maps.event.addListener(marker, 'click', (function(marker, i) {
        	  	        return function() {
        	  	          infowindow.setContent(locations[i][0]);
        	  	          infowindow.open(map, marker);
        	  		  map.setZoom(5);
        	  		  map.setCenter(marker.getPosition());
        	  	        }
        	  	      })(marker, i));
        	  	      
        	  	      iconCounter++;
        	  	      // We only have a limited number of possible icon colors, so we may have to restart the counter
        	  	      if(iconCounter >= icons_length){
        	  	      	iconCounter = 0;
        	  	      }
        	  	    }

        	  	    function AutoCenter() {
        	  	      //  Create a new viewpoint bound
        	  	      var bounds = new google.maps.LatLngBounds();
        	  	      //  Go through each...
        	  	      $.each(markers, function (index, marker) {
        	  	        bounds.extend(marker.position);
        	  	      });
        	  	      //  Fit these bounds to the map
        	  	      map.fitBounds(bounds);
        	  	    }
        	  	    AutoCenter();
        	  	}
        	  		
                    });
            });
        });
   
 </script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/button.css" media="screen" />
<title>Map</title>
</head>
<body>
<button>Load Map</button>
<form action="SearchLocal.jsp">
<input type="submit" class="myButton" value="LocalSearch">
</form>

 <div id="map" style="width: 1000px; height: 1000px;"></div>


</body>
</html>

 <!--  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script src="autocompleter.js"></script>
<link rel="stylesheet" 
  href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
<!-- User defied css 
<link rel="stylesheet" href="style.css">

</head>
<body>
<br />
<div class="search-container">
        <div class="ui-widget">
                <input type="text" id="Key" name="Key" class="search" />
        </div>
</div>
</body>
</html>
-->