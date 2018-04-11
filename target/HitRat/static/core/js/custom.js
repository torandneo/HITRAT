jQuery(document).ready(function($) {
		
		$(".bth-rest").click(function(){
		    alert("The paragraph was clicked.");
		    loadData();
		});		

	});

	function loadData() {
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : "${home}HitRatio/",			
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data);
				//display(data);
			},
			error : function(e) {
				//console.log("ERROR: ", e);
				//display(e);
			},
			done : function(e) {
				//console.log("DONE");
				//enableSearchButton(true);
			}
		});
	}
	
	
	
	

	