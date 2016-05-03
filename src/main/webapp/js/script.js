$(document).ready(function() {

	$(".unitelink").click(function() {
		id = "#" + $(this).attr("data-pk");
		$(id).toggle();
//		$("#inputhidden").val("qe");
	});
	$('.unite a#nom').editable({
		type : 'textarea',
		url : './UniteManip',
		title : 'Enter new value',
		params : {
			action : "edit"
		}

	});
	$('.unite a').not("#nom").not(".unitelink").not(".action").editable({
		type : 'text',
		url : './UniteManip',
		title : 'Enter new value',
		params : {
			action : "edit"
		},
		success : function(response, newValue) {

			$("[unitetotal='" + $(this).attr("data-pk") + "']").html(response);
		}

	});
	$('.matieres a#nom').editable({
		type : 'textarea',
		url : './MatiereManip',
		title : 'Enter new value',
		params : {
			action : "edit"
		}
	});
	$('.matieres a').not("#nom").editable({
		type : 'text',
		url : './MatiereManip',
		title : 'Enter new value',
		params : {
			action : "edit"
		},
		success : function(response, newValue) {

			$("[matieretotal='" + $(this).attr("data-pk") + "']").html(response);
		}
	});
	$(".deleteunite").click(function(e){
		id=$(this).attr("data-pk");
		bootbox.confirm("Are you sure?", function(result) {
			if (result==true){
				$.ajax({
			        url: './UniteManip',
			        type: 'POST',
			        data: { action: "delete", 
			        	pk:id
			        } ,
			        success: function (response) {
			            location.reload();
			        },
			        error: function () {
			            //your error code
			        }
			    });} 
		});  });
		

		
		$(".addmatierelink").click(function(e){
			idUnite=$(this).attr("data-pk");
			$("#hiddenid").val(idUnite);
			
		});
	
		
});