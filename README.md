## Integrantes del grupo
- Carlos Quesada Cruz
- Eduard Nicolás Cybulkiewicz
- Ilias Mohamed Abselam
- Pedro Sánchez Machuca

# Como descargar el proyecto y trabajr con él

Primero en vuestra máquina virutal teneis que usar en la carpeta que querais tener el repositorio el comando  ` git clone https://github.com/psychys/eBury-Interneteros.git `

**Cada vez** vayais a empezar a trabajar y antes de subir vuestros avances aseguraos de ejecutar  ` git pull `  para evitar conflictos.

Después, solo teneis  `git add . `  para añadir todo el trabajo que hayais realizado desde local, con  ` git commit -m "nombre del commit" `  hareis una __precarga__ del contenido y finalmente con  ` git push `   lo subireis al repositorio remoto.

Cabe resaltar que teneis que configurar vuestro usuario de git en la máquina y que cuando hagais el push os va a pedir un token **que no es vuestra contraseña**, vais a la configuracion de git en un navegador, a la pestaña de developer settings, y ahi estará una sección para generar ese tolen.

# Como montar el contenedor con la base de datos
Primero teneís que tener el ficher de texto **de nombre __Dockerfile__** en vuestra máquina con el siguiente contenido:

      FROM mysql
      ENV MYSQL_ROOT_PASSWORD=rootpassword
      ENV MYSQL_DATABASE=sii
      ENV MYSQL_USER=siiuser
      ENV MYSQL_PASSWORD=siipassword
      EXPOSE 3306

Acto seguido hay que abrir una terminal en la ubicación del fichero __Dockerfile__ y ejecutar `docker build --tag= nombre que quieras`.
De esta manera el contenedor estará compilado y listo para ejecutarse. Para ejecutarlo **por primera vez** ejecutamos el siguiente comando :
`docker run -d --name=nombre del contenedor -p 3306:3306 "nombre que usaste al compilar"`. Si no sabes el nombre que le has puesto a la imagen del contenedor usa el comando `docker image ls`.

**ESTO SE HACE SOLO LA PRIMERA VEZ**, el resto de veces que quieras iniciar el contenedor ejecutas el comando

`docker start "nombre del contenedor"`

---


# Fases del trabajo

## Modelado de entidades JPA
Hemos de modelar para cada requisito que consideremos necesarios una entidad JPA con sus atributos y relaciones entré si.
## 
