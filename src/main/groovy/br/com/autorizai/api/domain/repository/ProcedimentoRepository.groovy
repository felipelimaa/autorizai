package br.com.autorizai.api.domain.repository

import br.com.autorizai.api.domain.model.Procedimento
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ProcedimentoRepository extends JpaRepository<Procedimento, Long>{
    Procedimento findByCodigoAndOrigemId(Long codigo, Long origem)
}