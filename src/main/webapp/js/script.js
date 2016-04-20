$(document).ready(function() {

	$(".unitelink").click(function() {
		id = "#" + $(this).attr("data-pk");
		$(id).toggle();
	});

	$('.unite a').not( ".unitelink" ).editable({
		type : 'text',
		url : './UniteManip',
		title : 'Enter new value'
	});
	$('.matieres a').editable({
		type : 'text',
		url : './MatiereManip',
		title : 'Enter new value'
	});
});