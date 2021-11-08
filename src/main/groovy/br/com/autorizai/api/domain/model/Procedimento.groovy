package br.com.autorizai.api.domain.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@ToString(includePackage = false, includeNames = true)
@EqualsAndHashCode
class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "procedimento_id")
    Long id

    @Column(name = "procedimento_codigo", unique = true, nullable = false)
    Long codigoProcedimento

    @Column(name = "procedimento_descricao", nullable = false, length = 300)
    String descricaoProcedimento


}
