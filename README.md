# DSL-IMTA

Projet de langage dédié à l'IMT-Atlantique.
Construction d'un langage dédié d'automatisation de navigateur web.

## Get Started
Il est nécéssaire d'avoir Eclipse Modeling Tools et Xtext pour écrire avec le langage dédié et générer les tests.

Afin de d'éxécuter les tests, JUnit 4.x est requis et il est nécéssaire de déclarer une variable d'environnement chromedriver jusqu'à l'éxécutable chromedriver.exe

## Example

```
test {
	openbrowser default 
   	navigate "http://www.imt-atlantique.fr/fr/rechercher"
	fill [input id="edit-search-api-fulltext"] "Donald Trump" 	
	click [elm id="edit-submit-recherche2"] 
	assert [body] contain [div inner="Aucun résultat ne correspond à votre recherche"]
}
```
Chaque test est déclarer à l'aide de 
```
test {
  // code here
}
```
Le langage part avec le principe de container (élément html) et de champ (attribut du container) désigné par [container champ1 champ2...] 
```
//elm est utilisé dans le cas ou on ne souhaite pas spécifié le type du container
Container :
    "elm" | "body" | "input" | "div" | "select" | "a" | "img" | "label"
Champ :
    "id" | "class" | "inner" | "value" | "href" | "title" | "type" | "pathname" | "alt"

```
Ainsi, si vous souhaitez cliquer sur un lien avec un id=x et dont le text="lien à cliquer", il vous suffit d'écrire :
```
click [elm id="x" inner="lien à cliquer"]
```
Il est possible de séléctionner plusieurs container avec [[container]], par exemple un ensemble de checkbox :
```
[[input type="checkbox"]] 

// Si vous souhaitez check ou uncheck tout tout les checkbox : 
check [[input type="checkbox"]] 
uncheck [[input type="checkbox"]] 
```

Il est possible de naviguer vers le parent ou l'enfant d'un container ([container].nodeParent.nodeParent.nodeChild), de récupérer les champs de container([container].champ, [container].nodeParent.champ mais il n'est pas possible pour [[containers]]) la taille ([container].length [[containers]].length) et des les stockers dans des variables
```
  var var1
  var var2
  var1 = [[div class="views-row"]].length
  var2 = [elm class="actu_home_ctner_inner_cell1_titre"].nodeParent.pathname
  var2 = var1
  var1 = "toto"
```
Et finalement, afin de vérifier des égalités, il est possible de comparer des variables ou de vérifier si un container en contient un autre 
```
  var2 = [elm class="actu_home_ctner_inner_cell1_titre"].nodeParent.pathname
  assert [body] contain [a href=var2]
  assert [body] contain [a title="Toutes les actualités" inner="Toutes les actualités"]
  assert var1 equal var2
```

Les différentes actions disponibles sont les suivantes : 
```
Action :
    openbrowser | fill | click | navigate | choose | check | uncheck
    
    //le navigateur par défaut est chrome, donc peu importe le choix pour l'instant
    openbrowser  default | chrome
    
    //envoie la chaine de caractères au container 
    fill [container id="input"] "toto" | var | [container].champ | [container].length
    
    //click sur le container
    click [container class="toto" inner="toto"]

    //Redirige vers la chaine de caractère données
    navigate "http://www.toto.fr" | var | [container].href

    //Permet de selectionner une option d'un element select
    choose [select id="selecteur"] "text de l'option" | var | [container].inner

    //Coche un checkbox si non checked
    check [label inner="toto"] | [[input type="checkbox"]]

    //decoche un checkbox si checked
    uncheck [intput id="checkbox"] | [[input type="checkbox"]]

```
