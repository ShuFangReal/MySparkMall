import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * Created by Jerevon on 2018/12/8.
  */
object TestSparkkSql {

  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("test")
    val ss: SparkSession = SparkSession.builder().enableHiveSupport().config(conf).getOrCreate()
    ss.sql("show tables").show()
        ss.sql("select * from student").show()
//    ss.sql("insert into student values(18,'helloworld!')")
  }

}
