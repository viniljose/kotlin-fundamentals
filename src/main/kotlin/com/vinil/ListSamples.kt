package com.vinil

    fun main(){
        println("Welcome to Collection Examples")
        val nums = listOf(1,2,6,8,10)
        println(nums[3])
        val nums1 = mutableListOf(3,5,7,9)
        nums1[3]=11
        println(nums1)

        val strings = arrayOf("this","is","an","array","of","strings")
        println(strings[3])
        strings[1]="is not"
        println(strings.toList())
        println(strings.toSortedSet())
    }
