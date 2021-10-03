package ar.edu.unsam.algo3.controller

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EjemploController {

    @GetMapping("/ejemplo/")
    @ApiOperation("Devuelve simplemente hola y muestra cómo documentar Swagger")
    fun defaultGet(): String = "hola"

}