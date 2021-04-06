fun main() {
    // 가변형 Map의 선언 및 초기화
    val capitalCityMap: MutableMap<String, String>      // 선언할 때 키와 값의 자료형을 명시할 수 있음.
        = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.values)      // 값만 출력
    println(capitalCityMap.keys)        // 키만 출력

    capitalCityMap.put("UK", "London")      // 요소의 추가
    capitalCityMap.remove("China")      // 요소의 삭제
    println(capitalCityMap)

    val addData = mutableMapOf("USA" to "Washington")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)
}