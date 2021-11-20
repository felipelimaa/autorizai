package br.com.autorizai.api.domain.service

import br.com.autorizai.api.domain.model.OrigemProcedimento
import br.com.autorizai.api.domain.repository.OrigemProcedimentoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OrigemProcedimentoService {

    @Autowired
    OrigemProcedimentoRepository origemProcedimentoRepository

    List<OrigemProcedimento> findAll() {
        return origemProcedimentoRepository.findAll()
    }


}
