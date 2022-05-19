
function regKunde(){
    const kunde ={
        navn: $("#navn").val(),
        adresse: $("#adresse").val(),
        epost: $("#epost").val()
    };
    $.post("/lagre", kunde, function (){
        hentAlle();
    });

    $("#navn").val("");
    $("#adresse").val("");
    $("#epost").val("");
}

function hentAlle(){
    $.get("/hent", function (data){
        formaterData(data);
    });
}

function formaterData(kunder){
    let ut ="<table><tr><th>Navn</th><th>Adresse</th><th>E-post</th></tr>";
    for(let kunde of kunder){
        ut += "<tr><td>" + kunde.navn +
            "</td><td>"+kunde.adresse +
            "</td><td>"+kunde.epost +
            "</td></tr>";
    }
    ut+= "</table>";
    $("#kundene").html(ut);
}

function slettAlleKunder(){
    $.get("/slett", function (){
        hentAlle();
        $("#kundene").html(null);
    });
}