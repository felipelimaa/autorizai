package br.com.autorizai.api.controller

import br.com.autorizai.api.domain.model.Procedimento
import br.com.autorizai.api.domain.service.ProcedimentoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
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

    @GetMapping("/{id}")
    ResponseEntity<Procedimento> findById(@PathVariable Long id){
        Procedimento procedimento = procedimentoService.find(id)
        return ResponseEntity.ok(procedimento)
    }

    @GetMapping("/codigo-e-origem")
    ResponseEntity<Procedimento> findByCodigoAndOrigem(@RequestParam Long codigo, @RequestParam Long origem){
        Procedimento procedimento = procedimentoService.findByCodigoAndOrigem(codigo, origem)
        return ResponseEntity.ok(procedimento)
    }
}
