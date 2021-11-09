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
class OrigemProcedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "origem_proc_id")
    Long id

    @Column(name = "origem_proc_descricao", nullable = false, length = 80)
    String descricao
}
