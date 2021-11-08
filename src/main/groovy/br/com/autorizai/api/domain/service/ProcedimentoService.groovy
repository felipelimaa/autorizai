package br.com.autorizai.api.domain.service

import br.com.autorizai.api.domain.model.Procedimento
import br.com.autorizai.api.domain.repository.ProcedimentoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProcedimentoService {

    @Autowired
    ProcedimentoRepository procedimentoRepository

    List<Procedimento> findAll(){
        return procedimentoRepository.findAll()
    }

}
