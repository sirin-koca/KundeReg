function lagreKunde() {
    const bilKunde = {
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        eierBil: $("input[name=valgtBil]:checked").val(),
        forerkort: $("input[name=forerkort]:checked").val()
    };
    const url = "/lagreKunde";

    $.post(url, bilKunde, function () {
        hentAlleKunder();
    });

    $("#fornavn").val(""),
    $("#etternavn").val(""),
    $("input[name=valgtBil]:checked").val(""),
    $("input[name=forerkort]:checked").val("")
}

function hentAlleKunder() {
    $.get("/hentBiler", function (kunder) {
        formaterKunder(kunder);
    });
}

function formaterKunder(kunder) {
    let ut = "<table><tr><th>Fornavn</th><th>Etternavn</th><th>eierBil</th><th>Førerkort</th></tr>";
    for (let kunde of kunder) {
        ut += "<tr><td>" + kunde.fornavn +
            "</td><td>" + kunde.etternavn +
            "</td><td>" + kunde.eierBil +
            "</td><td>" + kunde.forerkort +
            "</td></tr>";
    }
    ut += "<table>";
    $("#bilKundene").html(ut);
}

function slettBilKunder() {
    $.get("/slettAlleKunder", function () {
        hentAlleKunder();
        $("#bilKundene").html(null);
    });
}

