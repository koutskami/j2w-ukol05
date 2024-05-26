[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<main>
    <h1>Registrace na letní dětský tábor – shrnutí</h1>
        <div>Jméno: <strong>${jmeno}</strong></div>
        <div>Příjmení: <strong>${prijmeni}</strong></div>
        <div>Datum narození: <strong>${datumNarozeni}</strong></div>
        <div>Pohlaví: <strong>${pohlavi}</strong></div>
        <div>Turnus: <strong>${turnus}</strong></div>
        <div>E-mail rodiče: [#if email??]<strong>${email}</strong>[#else]<em>neuvedeno</em>[/#if]</div>
        <div>Telefon rodiče: [#if telefon??]<strong>${telefon}</strong>[#else]<em>neuvedeno</em>[/#if]</div>
        <br>
    <div>Registrace byla vytvořena.
        [#if email??]
            Na e-mail ${email} byly zaslány další informace.
        [/#if]
    </div>
</main>
</body>
</html>
