/* Persian (Farsi) Translation for the jQuery UI date picker plugin. */
/* Javad Mowlanezhad -- jmowla@gmail.com */
/* Jalali calendar should supported soon! (Its implemented but I have to test it) */
jQuery(function($) {
	$.datepicker.regional['fa'] = {
		closeText: 'بستن',
		prevText: '&#x3C;قبلی',
		nextText: 'بعدی&#x3E;',
		currentText: 'امروز',
		monthNames: [
			'فروردين',
			'ارديبهشت',
			'خرداد',
			'تير',
			'مرداد',
			'شهريور',
			'مهر',
			'آبان',
			'آذر',
			'دی',
			'بهمن',
			'اسفند'
		],
<<<<<<< HEAD
		monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
=======
		monthNamesShort: ['۱','۲','۳','۴','۵','۶','۷','۸','۹','۱۰','۱۱','۱۲'],
>>>>>>> df11098... ofbiz-commit
		dayNames: [
			'يکشنبه',
			'دوشنبه',
			'سه‌شنبه',
			'چهارشنبه',
			'پنجشنبه',
			'جمعه',
			'شنبه'
		],
		dayNamesShort: [
			'ی',
			'د',
			'س',
			'چ',
			'پ',
			'ج',
			'ش'
		],
		dayNamesMin: [
			'ی',
			'د',
			'س',
			'چ',
			'پ',
			'ج',
			'ش'
		],
		weekHeader: 'هف',
<<<<<<< HEAD
		dateFormat: 'yy/mm/dd',
=======
		dateFormat: 'yyyy/mm/dd',
>>>>>>> df11098... ofbiz-commit
		firstDay: 6,
		isRTL: true,
		showMonthAfterYear: false,
		yearSuffix: ''};
	$.datepicker.setDefaults($.datepicker.regional['fa']);
});
