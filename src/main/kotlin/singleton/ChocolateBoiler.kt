package org.example.singleton

// NOTE: Java 스타일을 무리하게 코틀린으로 번역한 코드
//class ChocolateBoiler private constructor(
//    private var empty: Boolean = true,
//    private var boiled: Boolean = false,
//) {
//    fun fill() {
//        if (isEmpty()) {
//            empty = false
//            boiled = false
//        }
//    }
//
//    fun drain() {
//        if (!isEmpty() && isBoiled()) {
//            empty = true
//        }
//    }
//
//    fun boil() {
//        if (!isEmpty() && !isBoiled()) {
//            boiled = true
//        }
//    }
//
//    private fun isEmpty() = empty
//
//    private fun isBoiled() = boiled
//
//    companion object {
////    고전적인 방법:
////        private var uniqueInstance: ChocolateBoiler? = null;
////
////        fun getInstance(): ChocolateBoiler {
////            if (uniqueInstance == null) {
////                uniqueInstance = ChocolateBoiler()
////            }
////            return uniqueInstance!!
////        }
//
////  동기화를 사용하는 방법: 다른 스레드에서 한 스레드의 처리를 기다려야 함(그 만큼 성능 상 불이익이 있음)
////        private var uniqueInstance: ChocolateBoiler? = null;
//
////        @Synchronized()
////        fun getInstance(): ChocolateBoiler {
////            if (uniqueInstance == null) {
////                uniqueInstance = ChocolateBoiler()
////            }
////            return uniqueInstance!!
////        }
//
////   JVM 의 정적 초기화를 활용하는 방법(클래스 로딩 중 단 한 번만 실행함)
////        val instance: ChocolateBoiler = ChocolateBoiler()
//    }
//}

// Object 활용(애초에 코틀린에서 권장하는 방식)
object ChocolateBoiler {
    private var empty: Boolean = true
    private var boiled: Boolean = false

    fun fill() {
        if (isEmpty()) {
            empty = false
            boiled = false
        }
    }

    fun drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true
        }
    }

    fun boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true
        }
    }

    private fun isEmpty() = empty
    private fun isBoiled() = boiled
}
