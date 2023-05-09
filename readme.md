
# GDE alkalmazásfejlesztés próbafeladat

Az vizsga egy nagyon hasonló feladat lesz.
A megoldást próbáljátok meg 3 óra alatt megcsinál.


## Általános elvárások
- ezt a projektet töltsétek le IntelliJ IDEA-ba és onnan osszátok meg a saját github repositorytokba PUBLIC-ra
- a "tesztkerdesek.txt"-ben töltsétek ki a neveteket, szakotokat és neptun kódotokat
- mindig csináljatok commit-ot, amikor annak a helyét és idejét látjátok (0-5 pont)
- 3 órátok van a feladat megoldására, és github-ra való push-olására
- hogy biztos legyen, a végén egy browser incognito ablakában nézzétek meg az elküldendő github repositoryt (látható, fent van az utolsó commit is)
- a feladat elvégzése végén küldjétek el nekem email-ben a boga.aron@gde.hu címre a github repositorytok url-jét
- a feladatot a clean code elvek szerint végezzétek el


## 1. A tesztkérdések (25%) -> minden pont 2,5%

A válasz helyre írjátok be a helyes választ. Jó válasz 1 pont, rossz válasz -1 pont, nincs válasz 0 pont. 0-3 pontig bukás, fölötte 40%-ban számít bele az érdemjegybe.

## 2. Programozási feladat (75%) -> minden pont 1,5%

A példaprogramban Futók és köridők szerepelnek. Ezeket lehet megtekinteni, illetve új köridőt rögzíteni egy Thymeleaf frontenden.
A futókat adatait a DataLoader inicializálja
Fordítás után:
http://localhost:8080

Illetve el lehet érni az adatokat REST api-kon keresztül, felvenni új köridőt egy futóhoz.
Ezekhez a Postman collectiont a /src/test/postman/ könyvtárban találjátok.

### Feladatok

- Vegyetek fel egy kor (age) adatot minden futóhoz. (2p)
- Ezt töltsétek ki inicializáciokor a két futóra. (1p)
- Vegyetek fel egy harmadik futót tetszőleges adatokkal (1p)
- Csináljatok egy REST végpontot, ahol le lehet kérdezni a futók átlagéletkorát. (5p)
- Bővítsétek a postman collectiont erre a fenti végpontra való kéréssel (3p)
- Írjátok ki a futók átlagéletkorát a http://localhost:8080/runners címen a futók listája alá (5p)
- Vezessetek be egy új cipőtípus entitást Shoe néven (azonosító, név) egy futó egyfajta cipőt használ (oneToMany) (5p)
- Adjatok hozzá minden futóhoz inicializációkor egy cipőtípust (3p)
- A futó részletek http://localhost:8080/runner/{id} képernyőjén mutassuk meg a használt cipőtípust (3p)
- Írjatok egy REST végpontot, ahol id alapján lehet változtatni a futó cipőtípusát (6p)
- Bövítsétek a postman collectiont ezzel a kéréssel (1p)
#### Részfeladatok összesen 35 pont
+ commitok minősége max 5 pont
+ clean code elvárásoknak való megfelelés max 10 pont
#### Összesen 50 pont

Jó munkát! Légyszi önálló munkában, internettel...
