package br.com.autorizai.api.controller

import br.com.autorizai.api.domain.model.Procedimento
import br.com.autorizai.api.domain.service.ProcedimentoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/procedimento")
class ProcedimentoController {

    @Autowired
    ProcedimentoService procedimentoService

    @GetMapping
    ResponseEntity<Procedimento> findAll(){
        List<Procedimento> procedimentos = procedimentoService.findAll()
        return ResponseEntity<Procedimento>.ok(procedimentos)
    }
}
