fun main() {
    val unsortedList = listOf(3, 2, 7, 5)

    // reversed: 뒤집힌 순서로 컬렉션 반환
    println("reversed: " + unsortedList.reversed())

    // sorted: 요소를 정렬한 후 정렬된 컬렉션 반환
    println("sorted: " + unsortedList.sorted())

    // sortedDescending: 내림차순 정렬
    println("sortedDescending: " + unsortedList.sortedDescending())

    // sortedBy: 특정 비교식에 의해 정렬된 컬렉션 반환
    println("sortedBy: " + unsortedList.sortedBy { it % 3 })
    println("sortedByDescending: " + unsortedList.sortedByDescending { it % 3 })
}