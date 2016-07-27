<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/mystyles.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/button.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/NewButton.css" media="screen" />
<title>Google Map</title>
</head>
<body>
<!DOCTYPE html>
<html> 
<head> 
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" /> 
  <title>Google Maps Multiple Markers</title> 
  <script src="http://maps.google.com/maps/api/js?key=AIzaSyBq6flzjcN8vDzV_Ox8GLZmzqpXxtoq-Ss&sensor=false"></script>
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.10.1.min.js"></script>
</head> 
<body>
  <div id="map" style="width:500px; height: 1000px;"></div>

  <script type="text/javascript">
    // Define your locations: HTML content for the info window, latitude, longitude

	
	 

    var locations = [
        ['<h4>Dr.Denver</h4>8989076534', 39.737943, -104.985917],
        ['<h4>Dr.Monty</h4>90907654321', 44.273300, -88.486384],
        ['<h4>Dr.John</h4>98765789',46.862932, -109.859335],
        ['<h4>Dr.Pinaki</h4> 65439876',47.460519, -101.026328],
	['<h4>Sen ben Hospital</h4> 987898980',46.106488, -94.610313],
	['<h4>Dr.Monto</h4> 543215678',44.874283, -89.556602],
	['<h4>luke warm Hospital</h4> 654312678',39.744069, -117.110311],
	['<h4>Dr.Barista</h4> 909876980',39.167249, -111.617147],
	['<h4>Dr.Nirect</h4> 567895421',45.770319, -122.735310],
	['<h4>Dr.Reqsde</h4> 9875431267',37.303464, -78.482384],
	['<h4>Dr.Nice</h4> 98765431',34.128766, -105.816366],
	['<h4>Drone Hospital</h4> 0809765123',38.172266, -93.335899],
	['<h4>RasB Hospital</h4> 65431789',34.419280, -111.573202],
	['<h4>Dr.Nilesh</h4> 90909090',44.499364, -72.857385],
	['<h4>Dr.Hitr</h4> 435653423',36.353755, -115.220662],
	['<h4>Gedrite Hospital</h4> 876590123',44.310995, -100.059531],
	['<h4>Dr.Erie</h4> 453216789',38.379258, -98.038047],
	['<h4>Monsed Hospital</h4> 08765890123',38.996687, -79.361290],
	['<h4>DR.Okiyt</h4> 876543000',43.710491, -120.098592],
	['<h4>Gtres Hospital</h4> 987654321',40.316100, -86.304649],
	['<h4>Dr.Johnny</h4>98765654',35.428134, -97.115195],
	['<h4>Dr.Miranda</h4>66787765',33.140908, -111.441366],
	['<h4>Danny Hospital</h4>23455677',42.329026, -88.633751],
	['<h4>Dr.sistere</h4>0908766',39.574912, -82.789025],
	['<h4>Dr.sansa</h4>4567886599',43.710491, -84.327110],
	['<h4>Dr.Stark</h4>998857575',42.749956, -108.409140],
	['<h4>Dr.Stuart</h4>9544436899',31.432084, -99.312461],
	['<h4>KingsLanding Hospital</h4>91245558900',37.303464, -85.469688],
	['<h4>Dr.Grejoy</h4>099998789890',31.806299, -110.782186],
	['<h4>Winterfell Hospital</h4>4565554356',43.837418, -120.933553],
	['<h4>Dr.Trywin</h4>111234',41.807066, -93.775352],
	['<h4>Dr.Lannister</h4>76533321',30.300479, -91.050743],
	['<h4>Stark Hospital</h4>1111333999',40.833470, -77.383752],	
	['<h4>Lady Hospital</h4>9090888765',30.224566, -97.730430],
	['<h4>Stomborn Hospital</h4>4545436611',44.936534, -68.990198],
	['<h4>Dr.Baratheon</h4>999990003',38.275835, -98.653281],
	['<h4>Dr.Robert</h4>008956433',38.791470, -89.908165],
	['<h4>Mountain Hospital</h4>3233348999',28.809686, -97.049277],
	['<h4>Dr.Hound</h4>99867655677',37.721761, -84.436974],
	['<h4>Dr.Jon</h4>988885643',46.870443, -96.895469],
	['<h4>Black Castle Hospital</h4>91256777',47.467946, -111.320517]

];
	
      
    
    // Setup the different icons and shadows
    var iconURLPrefix = 'http://maps.google.com/mapfiles/ms/micons/';
    
    var icons = [
        iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'green-dot.png',
	iconURLPrefix + 'hospitals.png'
	

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
        icon : icons[iconCounter],
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
  </script> 
  
</body>
</html>
</body>
</html>