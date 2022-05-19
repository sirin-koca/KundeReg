$(function(){
    hentAlleKunder();
});

function hentAlleKunder(){
    $.get("/hentkunder", function(kunder){
        formaterKunder(kunder);
    });
}
function formaterKunder(){
    let ut = "<table><tr><th>Fornavn</th><th>Etternavn</th><th>eierBil</th></tr>"
}