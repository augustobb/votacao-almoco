package com.votacaoalmoco.exception;

import com.votacaoalmoco.message.MessageKey;
import lombok.Getter;

@Getter
public abstract class BaseRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -8962469694754031642L;

    private final MessageKey messageKey;
    private final Object[] args;

    public BaseRuntimeException(MessageKey messageKey, Object ...args) {
        this.messageKey = messageKey;
        this.args = args;
    }

}
