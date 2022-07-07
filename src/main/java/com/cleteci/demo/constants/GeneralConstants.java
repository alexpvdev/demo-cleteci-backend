package com.cleteci.demo.constants;

public interface GeneralConstants {

    String APPLICATION_JSON = "application/json";

    String LEER_TODOS_LOS_LIBROS_DESCRIPCION = "<div class='alert alert-info'><h3><u><span class='label label-default'> Leer todos los libros " +
            "</span></u></h3>"
            + "Método que permite leer todos los libros. No recibe parámetros:"
            + "Deberá recibir un mapa en formato json de esta forma:"
            + "<ul class='list-group'><li class='list-group-item list-group-item-success'><b><u>clave:</u></b>Valor. </li></ul> <br />"
            + "<br /><span class='badge'>Nota:</span> <br />En el json string, cada clave deberá estar entre comillas dobles <kbd>\"</kbd>; el uso de comillas"
            + " dobles para el valor será opcional a excepción de valores tipo string.</div>";

    String LEER_UN_LIBRO_DESCRIPCION = "<div class='alert alert-info'><h3><u><span class='label label-default'> Leer un libro " +
            "</span></u></h3>"
            + "Método que permite leer un libro por id. No recibe parámetros:"
            + "Deberá recibir un mapa en formato json de esta forma:"
            + "<ul class='list-group'><li class='list-group-item list-group-item-success'><b><u>clave:</u></b>Valor. </li></ul> <br />"
            + "<br /><span class='badge'>Nota:</span> <br />En el json string, cada clave deberá estar entre comillas dobles <kbd>\"</kbd>; el uso de comillas"
            + " dobles para el valor será opcional a excepción de valores tipo string.</div>";

    String CREAR_UN_LIBRO_DESCRIPCION = "<div class='alert alert-info'><h3><u><span class='label label-default'> Crear un libro " +
            "</span></u></h3>"
            + "Método que permite crear libros. Recibe los siguientes parámetros:"
            + "<ul class='list-group'>"
            + "<li class='list-group-item list-group-item-warning'><b><u>isbn:</u></b> isbn del libro a crear </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>titulo:</u></b> Título del libro a crear </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>autor:</u></b>  autor del libro a crear  </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>paginas:</u></b>  paginas del libro a crear </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>editorial:</u></b> editorial del libro a crear </li></ul>"
            + "<u>Ejemplo:</u>"
            + "<pre>{<br />"
            + "\t\"<b>isbn</b>\": \"<em>12347788</em>\",<br />"
            + "\t\"<b>titulo</b>\":  \"<em>Libro creado desde el jsondoc</em>\",<br />"
            + "\t\"<b>autor</b>\": \"<em>jsondoc</em>\",<br />"
            + "\t\"<b>paginas</b>\":  <em>55</em>,<br />"
            + "\t\"<b>editorial</b>\":  \"<em>Jsondoc</em>\"<br />"
            + "}</pre>"
            + "En caso de enviar los parámetros correctamente, deberá recibir un mapa en formato json de esta forma:"
            + "<ul class='list-group'><li class='list-group-item list-group-item-success'><b><u>clave:</u></b>Valor. </li></ul> <br />"
            + "<br /><span class='badge'>Nota:</span> <br />En el json string, cada clave deberá estar entre comillas dobles <kbd>\"</kbd>; el uso de comillas"
            + " dobles para el valor será opcional a excepción de valores tipo string.</div>";

    String EDITAR_UN_LIBRO_DESCRIPCION = "<div class='alert alert-info'><h3><u><span class='label label-default'> Editar un libro " +
            "</span></u></h3>"
            + "Método que permite editar un libro. Recibe los siguientes parámetros:"
            + "<ul class='list-group'>"
            + "<li class='list-group-item list-group-item-warning'><b><u>isbn:</u></b> isbn del libro a editar </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>titulo:</u></b> Título del libro a editar </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>autor:</u></b>  autor del libro a editar  </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>paginas:</u></b>  paginas del libro a editar </li></ul>"
            + "<li class='list-group-item list-group-item-warning'><b><u>editorial:</u></b> editorial del libro a editar </li></ul>"
            + "<u>Ejemplo:</u>"
            + "<pre>{<br />"
            + "\t\"<b>isbn</b>\": \"<em>12347788</em>\",<br />"
            + "\t\"<b>titulo</b>\":  \"<em>Libro editar desde el jsondoc</em>\",<br />"
            + "\t\"<b>autor</b>\": \"<em>jsondoc editar</em>\",<br />"
            + "\t\"<b>paginas</b>\":  <em>55</em>,<br />"
            + "\t\"<b>editorial</b>\":  \"<em>Jsondoc editar</em>\"<br />"
            + "}</pre>"
            + "En caso de enviar los parámetros correctamente, deberá recibir un mapa en formato json de esta forma:"
            + "<ul class='list-group'><li class='list-group-item list-group-item-success'><b><u>clave:</u></b>Valor. </li></ul> <br />"
            + "<br /><span class='badge'>Nota:</span> <br />En el json string, cada clave deberá estar entre comillas dobles <kbd>\"</kbd>; el uso de comillas"
            + " dobles para el valor será opcional a excepción de valores tipo string.</div>";

    String ELIMINAR_UN_LIBRO_DESCRIPCION = "<div class='alert alert-info'><h3><u><span class='label label-default'> Eliminar un libro " +
            "</span></u></h3>"
            + "Método que permite eliminar un libro por id. No recibe parámetros:"
            + "Deberá recibir un mapa en formato json de esta forma:"
            + "<ul class='list-group'><li class='list-group-item list-group-item-success'><b><u>clave:</u></b>Valor. </li></ul> <br />"
            + "<br /><span class='badge'>Nota:</span> <br />En el json string, cada clave deberá estar entre comillas dobles <kbd>\"</kbd>; el uso de comillas"
            + " dobles para el valor será opcional a excepción de valores tipo string.</div>";

}
