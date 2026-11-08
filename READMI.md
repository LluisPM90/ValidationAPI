# ValidationAPI

## Descripció

`ValidationAPI` és una biblioteca pròpia desenvolupada en Java que proporciona mètodes de validació de dades per poder reutilitzar-los en diferents aplicacions.

Aquesta biblioteca s'ha desenvolupat com a part del projecte **VideojocsLloguer**, una aplicació de gestió de lloguers de videojocs desenvolupada amb Java Swing.

## Funcionalitats

Actualment, la biblioteca incorpora el següent mètode de validació:

### Validació de noms

- **Mètode:** `nomComencaAmbMajuscula(String nom)`
- **Tipus:** `static boolean`
- **Descripció:** comprova que el nom introduït no sigui nul ni buit i que el primer caràcter sigui una lletra majúscula.
- **Resultat:** retorna `true` si compleix les condicions i `false` en cas contrari.

## Estructura del projecte

```text
ValidationAPI/
├── src/
│   └── validationapi/
│       └── Validador.java
├── nbproject/
├── build.xml
└── README.md
```

## Exemple d'utilització

Per utilitzar la biblioteca en una aplicació Java, primer cal importar la classe `Validador`:

```java
import validationapi.Validador;
```

A continuació, es pot utilitzar el mètode de validació:

```java
String nom = "Laura";

if (Validador.nomComencaAmbMajuscula(nom)) {
    System.out.println("Nom vàlid");
} else {
    System.out.println("El nom ha de començar amb una lletra majúscula.");
}
```

## Tecnologies utilitzades

- Java
- NetBeans IDE
- Java Class Library

## Integració amb altres projectes

La biblioteca es pot incorporar a altres projectes Java mitjançant la referència al projecte o afegint el fitxer JAR generat durant la compilació.

## Projecte relacionat

[VideojocsLloguer](https://github.com/LluisPM90/VideojocsLloguer)

Aplicació Java Swing que utilitza aquesta biblioteca per validar els noms dels usuaris durant el procés de registre.

