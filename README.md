# Répertoire Téléphonique en Java

Ce projet est une application de gestion de répertoire téléphonique développée en Java. Il permet aux utilisateurs d'ajouter, de supprimer, de rechercher et de modifier des contacts dans un répertoire téléphonique.

## Fonctionnalités

- Ajouter un nouveau contact avec un nom et un numéro de téléphone.
- Rechercher le numéro de téléphone d'un contact par son nom.
- Afficher le nombre total d'abonnés dans le répertoire.
- Afficher la liste des abonnés triés par ordre alphabétique.

## Structure du Projet

Le projet est divisé en trois classes principales :

- **Main.java :** Le point d'entrée de l'application. Il initialise le répertoire téléphonique et démontre son utilisation.
- **Abonne.java :** La classe représentant un abonné avec son nom et son numéro de téléphone.
- **Repertoire.java :** La classe représentant le répertoire téléphonique. Elle permet d'ajouter, de rechercher et de trier les abonnés.

## Utilisation

1. Assurez-vous d'avoir Java installé sur votre système.
2. Clonez ce dépôt sur votre machine.
3. Compilez les fichiers source en utilisant `javac` :
    ```
    javac Exercice04/*.java
    ```
4. Exécutez l'application en utilisant `java` :
    ```
    java Exercice04.Main
    ```
5. Suivez les instructions à l'écran pour utiliser l'application.

## Exemple

Voici un exemple d'utilisation de l'application :
Le Numéro de tele du Nom est :0659521353
Le Nombres des abonnes est : 5
Abonne Numéro 1 est : ayoub
Le Répertoire est :
ayoub: 0659521353
adam: 0652457820
abdo: 0759854632
Le Répertoire Trié est :
abdo: 0759854632
adam: 0652457820
ayoub: 0659521353
