package com.jjcorp.jariyoserver.domain.member

class Password(
    password: String
) {
    init {
        validate(password)
    }

    private fun validate(password: String) {
        require(password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$".toRegex())) {
            "비밀번호는 8자 이상, 영문, 숫자, 특수문자를 포함해야 합니다."
        }
    }
}
