package com.shufang.sparkmall.mock.dataProduce

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.Random

/**
  * Created by Jerevon on 2018/12/7.
  */
object RandomNum {
  def apply(fromNum:Int,toNum:Int): Int =  {
    fromNum+ new Random().nextInt(toNum-fromNum+1)
  }
  def multi(fromNum:Int,toNum:Int,amount:Int,delimiter:String,canRepeat:Boolean) ={
    // 实现方法  在fromNum和 toNum之间的 多个数组拼接的字符串 共amount个
    // 用delimiter分割  canRepeat为false则不允许重复
    //RandomNum.multi(1,cargoryNum,RandomNum(1,5),",",false)
    if(canRepeat){
      val valueList = new ListBuffer[Int]()
      val randomNum: Int = apply(fromNum,toNum)
      for(i <- 1 to amount){
        valueList.append(randomNum)
      }
      valueList.mkString(delimiter)
    }else{
      val valueSet = new mutable.HashSet[Int]()
      val randomNum: Int = apply(fromNum,toNum)
      while(valueSet.size <= amount){
        valueSet+=randomNum
      }
      valueSet.mkString(delimiter)
    }
}


}

