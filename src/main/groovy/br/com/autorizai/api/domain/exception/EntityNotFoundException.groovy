package br.com.autorizai.api.domain.exception

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class EntityNotFoundException extends ResponseStatusException {
    EntityNotFoundException(Enum<HttpStatus> status, String mensagem) {
        super(status as HttpStatus, mensagem)
    }
}
