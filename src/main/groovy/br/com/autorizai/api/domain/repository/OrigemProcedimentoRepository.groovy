package br.com.autorizai.api.domain.repository

import br.com.autorizai.api.domain.model.OrigemProcedimento
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrigemProcedimentoRepository extends JpaRepository<OrigemProcedimento, Long> {

}