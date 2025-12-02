package com.jjcorp.jariyoserver.domain.member

class Email(
    email: String
) {
    companion object {
        private val EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$".toRegex()
    }

    init {
        validate(email)
    }

    private fun validate(email: String) {
        require(email.matches(EMAIL_REGEX)) {
            "유효하지 않은 이메일 형식입니다."
        }
    }
}
