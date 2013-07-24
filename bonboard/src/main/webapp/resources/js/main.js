var jq = jQuery.noConflict();

jq(document).ready(function(){
	/**
	 * slider
	 */
	jq('.carousel').carousel({  
		  interval: 3000
		});
	
	/**
	 * switch it/en
	 */
	var currentLocation, href;
	jq('#it').click(function(){
		currentLocation = window.location.href;
		if(currentLocation.indexOf("it") > 0) return;
		if(currentLocation.indexOf("en") > 0) {
			href = currentLocation.split('?');
			currentLocation = href[0];
		}
		window.location.assign(currentLocation+"?language=it");
		refreshCurrentPath();
	});
	jq('#en').click(function(){
		currentLocation = window.location.href;
		if(currentLocation.indexOf("en") > 0) return;
		if(currentLocation.indexOf("it") > 0) {
			href = currentLocation.split('?');
			currentLocation = href[0];
		}
		window.location.assign(currentLocation+"?language=en");
		refreshCurrentPath();
	});
	
	/**
	 * navigation bar
	 */
	var navbar = ['#home', '#about', '#servizi', '#offerte', '#press', '#blog'];
	for(var i = 0; i < navbar.length; i++){
		jq(navbar[i]).removeClass('active');
	}
	currentLocation = window.location.href.split('/');
	currentLocation = currentLocation[4].split('?');

	for(i = 0; i < navbar.length; i++){
		nav = navbar[i].split('#');
		if(nav[1] === currentLocation[0]) {
			jq(navbar[i]).addClass('active');
		}
	}
	
	var lastScrollTop = 0;
	jq(window).scroll(function(event){
	   var st = jq(this).scrollTop();
	   if (st > lastScrollTop){
	       jq('.header').slideUp();
	       
	   } else {
	      jq('.header').slideDown();

	   }
	   lastScrollTop = st;
	});
	
	/**
	 * tweet
	 */
	jq('#tweets').tweetable({
		html5: true,
		username: '@BONBOARDsrl',
		limit: 3,
		time: true,
		retweets: true,
//		onComplete:function($ul){
//			jq('time').timeago();
//		}
	});
	
	/**
	 * Mappe
	 */
	var BoB_DataArray = [30, 50, 70, 40, 60, 20, 120];

    var employees = 0;
    console.log(BoB_DataArray.length);
    for(i = 0; i < BoB_DataArray.length; i++) {
      employees += BoB_DataArray[i];
    }
    for(i = 0; i < BoB_DataArray.length; i++) {
      var perc = (BoB_DataArray[i] / employees * 100).toFixed(0);
      BoB_DataArray[i] = perc;
    }

    var BoB_Data = {
		"US": BoB_DataArray[0],
		"CA": BoB_DataArray[1],
		"RU": BoB_DataArray[2],
		"BR": BoB_DataArray[3],
		"FR": BoB_DataArray[4],
		"DE": BoB_DataArray[5],
		"IN": BoB_DataArray[6],
	};

	jq('#world-map').vectorMap({
		map: 'world_mill_en',
		series: {
		regions: [{
			values: BoB_Data,
			scale: ['#C8EEFF', '#0071A4'],
			normalizeFunction: 'polynomial'
		}]
		},
		onRegionLabelShow: function(e, el, code){
			if(BoB_Data[code] !== undefined) el.html(el.html() + ' - BonBoard employees: ' + BoB_Data[code] + "%");
		}
	});		
});
