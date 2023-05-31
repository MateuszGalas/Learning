fun getCommonElements(list1: List<Any>, list2: List<Any>) : List<Any>{
    val result = mutableListOf<Any>()

    for (i in list1) {
        if (i in list2) result.add(i)
    }

    return result
}