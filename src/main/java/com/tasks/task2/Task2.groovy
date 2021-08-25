package com.tasks.task2

class Task2 {

    static void main(String[] args) {
        Integer.metaClass {

            getCm = {
                delegate * 10 //this -> thisObject use delegate
            }
            getM = {
                delegate.cm * 100
            }
            getMm = {
                delegate
            }
        }

        def result = 3.cm + 1.m - 25.mm
        assert result == 1005

    }

    private static Object firstOption() {
        use(IntegersMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }
}
