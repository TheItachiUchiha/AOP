/*
 * SimpleModal Basic Modal Dialog
 * http://simplemodal.com
 *
 * Copyright (c) 2013 Eric Martin - http://ericmmartin.com
 *
 * Licensed under the MIT license:
 *   http://www.opensource.org/licenses/mit-license.php
 */

jQuery(function ($) {
	// Load dialog on page load
	//$('#basic-modal-content').modal();

	// Load dialog on click
	$('#basic-modal .log').click(function (e) {
		$('#basic-modal-contentlog').modal();

		return false;
	});
	$('#basic-modal .contactUs').click(function (e) {
		$('#basic-modal-contentContactUs').modal();

		return false;
	});
	$('#basic-modal .feedback').click(function (e) {
		$('#basic-modal-contentFeedback').modal();

		return false;
	});
	//alert("test");
});