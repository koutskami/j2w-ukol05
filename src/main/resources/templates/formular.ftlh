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
        <h1>Registrace na letní dětský tábor</h1>
        <form action="/" method="post">
            <label for="jmeno">Jméno:</label>
            [@spring.formInput path="form.jmeno" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="prijmeni">Příjmení:</label>
            [@spring.formInput path="form.prijmeni" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="datumNarozeni">Datum narození:</label>
            [@spring.formInput path="form.datumNarozeni" fieldType="date" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <div>Pohlaví:</div>
            <div>
                <div>
                    <input id="divka" type="radio" name="pohlavi" value="divka" [#if form.objem! == "divka"]checked[/#if]/>
                    <label for="divka">dívka</label>
                </div>
                <div>
                    <input id="chlapec" type="radio" name="pohlavi" value="chlapec" [#if form.objem! == "chlapec"]checked[/#if]/>
                    <label for="chlapec">chlapec</label>
                </div>
            </div>
            [@spring.bind "form.pohlavi"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <div>Turnus:</div>
            <div>
                <div>
                    <input id="turnus1" type="radio" name="turnus" value="turnus_1" [#if form.objem! == "turnus_1"]checked[/#if]/>
                    <label for="turnus1">5.–11. července</label>
                </div>
                <div>
                    <input id="turnus2" type="radio" name="turnus" value="turnus_2" [#if form.objem! == "turnus_2"]checked[/#if]/>
                    <label for="turnus2">12.–18. července</label>
                </div>
                <div>
                    <input id="turnus3" type="radio" name="turnus" value="turnus_3" [#if form.objem! == "turnus_3"]checked[/#if]/>
                    <label for="turnus3">19.–25. července</label>
                </div>
            </div>
            [@spring.bind "form.turnus"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="emailRodicu">E-mail rodiče (nepovinné):</label>
            [@spring.formInput path="form.emailRodicu" fieldType="email" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <label for="telefonRodicu">Telefon rodiče (nepovinné):</label>
            [@spring.formInput path="form.telefonRodicu" fieldType="number" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>

            <div>
                <button type="submit">Objednat</button>
            </div>
        </form>
    </main>
</body>
</html>
