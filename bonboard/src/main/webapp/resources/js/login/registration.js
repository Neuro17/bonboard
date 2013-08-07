$(document).ready(function(){
	var $emailSignUp = $('#email'),
		$hintSignUp = $('#hintsignup'),
		$username = $('#username'),
		$signBtn = $('#signBtn'),
		$existUsr = $('#hintExistUsername'),
		$existEmail = $('#hintExistEmail'),
		$passSignUp = $('#password'),
		$fName = $('#fname'),
		$lName = $('#lname'),
		gen;
	
	$("#signup").validate({
		rules:{
			fname:"required",
			lname:"required",
			username:"required",
			email:{
				required:true,
				email: true
			},
			password:{
				required:true,
				minlength: 8
			},
			cpassword:{
				required:true,
				equalTo: "#password"
			},
		},
		errorClass: "help-inline",
		
		invalidHandler: function(event, validator) {
		    // 'this' refers to the form
		    var errors = validator.numberOfInvalids();
		    if(errors == 0){
		    $signBtn.on('click', function(){
				if($('#male').hasClass('active'))
					gen = "M";
				else if($('#female').hasClass('active'))
					gen = "F";
				else 
					gen = "";
				console.log(errors);
				$(function() {
					$.post("request/newUser",
								{ 	username: $username.val(),
									email: $emailSignUp.val(),
									password: $passSignUp.val(),
									fname: $fName.val(),
									lname: $lName.val(),
									gender: gen,
									},
									function(data){
//										$('#toLogin')[0].click();								
//										var n = noty({
//											text: 'The user '+$username.val()+' created',
//											type:'success',
//											layout: 'bottomRight',
//									  		theme: 'defaultTheme'
//											});
										console.log("Utente inserito");
								}
							  	, 'json');
				});
			});

		    }
		    else console.error(errors);
		  }
		
	});
	
//	$signBtn.attr('disabled','disabled');
	
	$username.on('blur', function(){
		$(function() {
			// Call a URL and pass two arguments
			// Also pass a call back function
			// See http://api.jquery.com/jQuery.post/
			// See http://api.jquery.com/jQuery.ajax/
			// You might find a warning in Firefox: Warning: Unexpected token in attribute selector: '!' 
			// See http://bugs.jquery.com/ticket/7535
			$.get("existUsername",
						{ 	username: $username.val()},
							function(data){
								// data contains the result
								// Assign result to the sum id
					  			// It's works ;)
					  			if(data){
					  				console.log('username già esistente');
					  				var error = "username already used";
					  				$existUsr.html(error);
					  				
					  				}
				  				else {
					  				$signBtn.removeAttr('disabled');
				  				}
						}
					  	, 'json');
		});
	});
	
//	$emailLogin.on('blur', function(){
//		$hintLogin.css('display', 'none');
//		$(this).mailcheck({
//			suggested: function(element, suggestion){
//				if(!$hintLogin.html()) {
//		        // First error - fill in/show entire hint element
//		        var suggestion = "Did you mean <span class='suggestion'>" +
//		                          "<span class='address'>" + suggestion.address + "</span>"
//		                          + "@<a href='#' class='domain'>" + suggestion.domain + 
//		                          "</a></span>?";
//		                          
//		        $hintLogin.html(suggestion).fadeIn(150);
//		      	} 
//		      	else {
//			        // Subsequent errors
//			        $(".address").html(suggestion.address);
//			        $(".domain").html(suggestion.domain);
//			        
//		      	}
//			}
//		});
//		$hintLogin.on('click', '.domain', function() {
//		  // On click, fill in the field with the suggestion and remove the hint
//		  $emailLogin.val($(".suggestion").text());
//		  $hintLogin.fadeOut(200, function() {
//		    $(this).empty();
//		  });
//		  return false;
//		});
//	});
	
	
	$emailSignUp.on('blur', function(){
		$(function() {
			// Call a URL and pass two arguments
			// Also pass a call back function
			// See http://api.jquery.com/jQuery.post/
			// See http://api.jquery.com/jQuery.ajax/
			// You might find a warning in Firefox: Warning: Unexpected token in attribute selector: '!' 
			// See http://bugs.jquery.com/ticket/7535
			$.get("existMail",
						{ 	mail: $emailSignUp.val()},
							function(data){
								// data contains the result
								// Assign result to the sum id
					  			// It's works ;)
					  			if(data){
					  				console.log('email già esistente');
					  				var error = "email already used";
					  				$existEmail.html(error);
					  				
					  				}
				  				else {
					  				$signBtn.removeAttr('disabled');
				  				}
						}
					  	, 'json');
		});
		
		$hintSignUp.css('display', 'none');
//		$(this).mailcheck({
//			suggested: function(element, suggestion){
//				if(!$hintSignUp.html()) {
//		        // First error - fill in/show entire hint element
//		        var suggestion = "Did you mean <span class='suggestion'>" +
//		                          "<span class='address'>" + suggestion.address + "</span>"
//		                          + "@<a href='#' class='domain'>" + suggestion.domain + 
//		                          "</a></span>?";
//		                          
//		        $hintSignUp.html(suggestion).fadeIn(150);
//		      	} 
//		      	else {
//			        // Subsequent errors
//			        $(".address").html(suggestion.address);
//			        $(".domain").html(suggestion.domain);
//			        
//		      	}
//			}
//		});
//		$hintSignUp.on('click', '.domain', function() {
//		  // On click, fill in the field with the suggestion and remove the hint
//		  $emailSignUp.val($(".suggestion").text());
//		  $hintSignUp.fadeOut(200, function() {
//		    $(this).empty();
//		  });
//		  return false;
//		});
	});
	
//	$signBtn.on('click', function(){
//		if($('#male').hasClass('active'))
//			gen = "M";
//		else if($('#female').hasClass('active'))
//			gen = "F";
//		else 
//			gen = "fsd";
//		console.log(errors);
//		$(function() {
//			$.post("request/newUser",
//						{ 	username: $username.val(),
//							email: $emailSignUp.val(),
//							password: $passSignUp.val(),
//							fname: $fName.val(),
//							lname: $lName.val(),
//							gender: gen,
//							},
//							function(data){
////								$('#toLogin')[0].click();								
////								var n = noty({
////									text: 'The user '+$username.val()+' created',
////									type:'success',
////									layout: 'bottomRight',
////							  		theme: 'defaultTheme'
////									});
//								console.log("Utente inserito");
//						}
//					  	, 'json');
//		});
//	});
});

