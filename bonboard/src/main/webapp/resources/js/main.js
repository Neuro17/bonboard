var jq = jQuery.noConflict();
jq(document).ready(function(){
	var currentLocation, href;
	jq('#it').click(function(){
		currentLocation = window.location.href;
		if(currentLocation.indexOf("it") > 0) return;
		if(currentLocation.indexOf("en") > 0) {
			href = currentLocation.split('?');
			currentLocation = href[0];
		}
		window.location.assign(currentLocation+"?language=it");
	});
	jq('#en').click(function(){
		currentLocation = window.location.href;
		if(currentLocation.indexOf("en") > 0) return;
		if(currentLocation.indexOf("it") > 0) {
			href = currentLocation.split('?');
			currentLocation = href[0];
		}
		window.location.assign(currentLocation+"?language=en");
	});
});
