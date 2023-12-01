fun main() {
    print("두 실수 A와 B를 입력하세요: ")

    val inputA = readLine()?.toDoubleOrNull()
    val inputB = readLine()?.toDoubleOrNull()

    if (inputA != null && inputB != null) {
        if (inputB != 0.0) {
            val result = inputA / inputB
            println("결과: $result")
        } else {
            println("B는 0이 될 수 없습니다.")
        }
    } else {
        println("올바른 입력이 아닙니다.")
    }
}
