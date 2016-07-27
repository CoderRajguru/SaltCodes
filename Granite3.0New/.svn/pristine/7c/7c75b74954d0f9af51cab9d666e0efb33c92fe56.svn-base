$(document).ready(function() {
        $(function() {
                $("#Key").autocomplete({     
                source : function(request, response) {
                $.ajax({
                        url : "C_L1_Map",
                        type : "GET",
                        data : {
                                term : request.term
                        },
                        dataType : "json",
                        success : function(data) {
                                response(data);
                        }
                });
        }
});
});
});