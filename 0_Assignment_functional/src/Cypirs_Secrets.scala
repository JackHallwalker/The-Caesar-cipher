object Cypirs_Secrets extends App {

  def menu(): Unit ={
    print("Enter your choice: ")
    var n = scala.io.StdIn.readInt()
    if (n==1) {
      print("\nEnter the string for encryption: ")
      var str1 = scala.io.StdIn.readLine()
      encryption(str1)
      menu()
    }
    else if (n==2){
      print("\nEnter the string for decryption: ")
      var str2 = scala.io.StdIn.readLine()
      decryption(str2)
      menu()
    }
    else if (n==3) {
      println("\n*******************  Instructions  *********************")
      print("\nPress 1 to encrypt\nPress 2 to decrypt\nPress 3 for instructions\nPress 0 to exit")
      menu()
    }
    else if (n==0) {
      println("\nThank you!")
    }
    else {
      print("\nInvalid Input!")
      menu()
    }

  }

  def encryption(str:String): Unit ={
    val len = str.length()
    val arr = new Array[Char](len)
    var change: Int = 0
    var i: Int=0
    for (c <- str) {
      if ((c.toInt >= 65 && c.toInt <= 87 ) || (c.toInt>=97 && c.toInt <= 119)){
        change = c.toInt + 3
        arr(i) = change.toChar
      }
      else if ((c.toInt >87 && c.toInt <= 90) || (c.toInt>119 && c.toInt <= 122)){
        change = c.toInt - 23
        arr(i) = change.toChar
      }
      else {
        arr(i) = c
      }
      i = i + 1
    }
    val str_new: String = arr.mkString
    println(str_new)
  }

  def decryption(str:String): Unit ={
    val len = str.length()
    val arr = new Array[Char](len)
    var change: Int = 0
    var i: Int=0
    for (c <- str) {
      if ((c.toInt >=68 && c.toInt <= 90 ) || (c.toInt>=100 && c.toInt <= 122)){
        change = c.toInt - 3
        arr(i) = change.toChar
      }
      else if ((c.toInt >= 65 && c.toInt<=67) || (c.toInt >= 97 && c.toInt <= 99)){
        change = c.toInt + 23
        arr(i) = change.toChar
      }
      else {
        arr(i) = c
      }
      i = i + 1
    }
    val str_new: String = arr.mkString
    println(str_new)
  }

  menu()

}
