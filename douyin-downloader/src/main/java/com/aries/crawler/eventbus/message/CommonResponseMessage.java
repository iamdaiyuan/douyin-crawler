package com.aries.crawler.eventbus.message;

import com.aries.crawler.eventbus.Messagable;

/**
 * immutable
 *
 * @author arowana
 */
public class CommonResponseMessage<T> implements Messagable {
    private final Integer code;
    private final T message;

    public CommonResponseMessage(Integer code, T message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public T getMessage() {
        return message;
    }


    public static final class CommonResponseMessageBuilder<T> {
        private Integer code;
        private T message;

        private CommonResponseMessageBuilder() {
        }

        public static <T> CommonResponseMessageBuilder<T> aCommonResponseMessage() {
            return new CommonResponseMessageBuilder<T>();
        }

        public CommonResponseMessageBuilder<T> code(Integer code) {
            this.code = code;
            return this;
        }

        public CommonResponseMessageBuilder<T> message(T message) {
            this.message = message;
            return this;
        }

        public CommonResponseMessage<T> build() {
            return new CommonResponseMessage<>(code, message);
        }
    }

    @Override
    public String toString() {
        return "CommonResponseMessage{" +
                "code=" + code +
                ", message=" + message +
                '}';
    }
}
