$( document ).ready(function() {
	$(".unitelink").click(function(){
		id="#"+$(this).attr("value");
		$(id).toggle("slow");
	});	
});