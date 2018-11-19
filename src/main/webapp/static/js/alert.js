function alertNotOpenShow() {
    $('#alert-not-open').show();
    alertNotOpenFade();
}

function alertNotOpenFade() {
    $('#alert-not-open').fadeTo(2500, 0.1, function() {
        $('#alert-not-open').hide();
        $('#alert-not-open').css('opacity', 1);
    });
}