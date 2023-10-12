# Personal Access Token (Token de Acceso Personal)

### Descripción

* Este proyecto es una aplicación que permite crear, eliminar y listar tokens de acceso personal (`PersonalAccessToken`).
* El PAT es un token que permite a un usuario autenticarse en la aplicación y realizar operaciones en su nombre.
* Se genera de forma aleatoria y tiene una fecha de expiración, se almacena solo los últimos 4 caracteres del token,
  el token original se almacena encriptado.
* Cuando el token es utilizado para acceder a un recurso, se actualiza la fecha en la que fue utilizado, se agrega una
  actividad (`PersonalAccessTokenActivity`) que contiene la ip de origen, el user agent, la fecha en la que se realizó la operación y el recurso al que se accedio.
* Se puede almacenar un máximo de 10 actividades por token, si se supera este límite se eliminan las actividades más antiguas.
* Cuando el usuario accede a los tokens o se intenta usar un token, se debe validar si el token se encuentra expirado, si es así se actualiza el estado.
* Un token puede estar activo o no, si esta expirado se encuentra inactivo.
* El nombre del token puede tener entre 1 y 255 caracteres
* Al momento de crear un token se especifica la cantidad de dias antes de que expire.
* El token esta compuesto por 52 caracteres alfanuméricos.

### API

| URI                                                    | Método | Descripción                         |
|--------------------------------------------------------|--------|-------------------------------------|
| /api/v1/users/{userId}/personal_access_token           | GET    | Devuelve todos los PAT del ususario |
| /api/v1/users/{userId}/personal_access_token/{tokenId} | DELETE | Elimina el token del ususario       |
| /api/v1/users/{userId}/personal_access_token           | POST   | Crea un nuevo token                 |

### Tips
* Para la encriptación puede utilizar el algoritmo determinístico SHA-256
```
Hashing.sha256()
       .hashString(textoAEncriptar, StandardCharsets.UTF_8)
       .toString()
```
* Para la generación aleatoria de un token pueden utilizar
```
RandomStringUtils.randomAlphanumeric(cantidadDeCaracteres)
```
### UI Mockups

#### Lista de tokens
![PAT_List.png](images%2FPAT_List.png)

#### Ventana para crear un token
![PAT_New.png](images%2FPAT_New.png)

#### Resultado de la creación con el token original
![PAT_Created.png](images%2FPAT_Created.png)