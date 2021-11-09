package br.com.autorizai.api.domain.service

import br.com.autorizai.api.domain.exception.EntityNotFoundException
import br.com.autorizai.api.domain.model.Procedimento
import br.com.autorizai.api.domain.repository.ProcedimentoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class ProcedimentoService {

    @Autowired
    ProcedimentoRepository procedimentoRepository

    List<Procedimento> findAll(){
        return procedimentoRepository.findAll()
    }

    Procedimento find(Long id){
        return procedimentoRepository
                .findById(id)
                .orElseThrow { new EntityNotFoundException(
                        HttpStatus.NOT_FOUND,
                        String.format("Procedimento %d não encontrado.", id)
                )}
    }

    Procedimento findByCodigoAndOrigem(Long codigo, Long origem){
        Procedimento procedimento = procedimentoRepository.findByCodigoAndOrigemId(codigo, origem)

        if(procedimento == null) {
            throw new EntityNotFoundException(HttpStatus.NOT_FOUND, String.format("Procedimento %d de origem %d não encontrado", codigo, origem))
        }

        return procedimento
    }

}
