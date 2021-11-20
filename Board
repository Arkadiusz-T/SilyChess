class Board {
  var piecesPosition = scala.collection.mutable.Map[String, Array[Int]]()
  var board = Array.ofDim[String](8,8)
  val boardSize : Int = 8

  def setStartingFormation() : Unit = {
    piecesPosition("br1") = Array(7,0)
    piecesPosition("bk1") = Array(7,1)
    piecesPosition("bb1") = Array(7,2)
    piecesPosition("bQ1") = Array(7,3)
    piecesPosition("bK ") = Array(7,4)
    piecesPosition("bb2") = Array(7,5)
    piecesPosition("bk2") = Array(7,6)
    piecesPosition("br2") = Array(7,7)
    piecesPosition("bp1") = Array(6,0)
    piecesPosition("bp2") = Array(6,1)
    piecesPosition("bp3") = Array(6,2)
    piecesPosition("bp4") = Array(6,3)
    piecesPosition("bp5") = Array(6,4)
    piecesPosition("bp6") = Array(6,5)
    piecesPosition("bp7") = Array(6,6)
    piecesPosition("bp8") = Array(6,7)
    // white
    piecesPosition("wr1") = Array(0,0)
    piecesPosition("wk1") = Array(0,1)
    piecesPosition("wb1") = Array(0,2)
    piecesPosition("wQ1") = Array(0,3)
    piecesPosition("wk ") = Array(0,4)
    piecesPosition("wb2") = Array(0,5)
    piecesPosition("wk2") = Array(0,6)
    piecesPosition("wr2") = Array(0,7)
    piecesPosition("wp1") = Array(1,0)
    piecesPosition("wp2") = Array(1,1)
    piecesPosition("wp3") = Array(1,2)
    piecesPosition("wp4") = Array(1,3)
    piecesPosition("wp5") = Array(1,4)
    piecesPosition("wp6") = Array(1,5)
    piecesPosition("wp7") = Array(1,6)
    piecesPosition("wp8") = Array(1,7)
  }

  def printBoard(): Unit = {
    clearBoard()
    putPiecesOnTheBoard()
    displayBoardOnConsole()
  }

  private def clearBoard() : Unit = {
    var i = 0
    var j = 0
    for (i <- 0 to 7; j<- 0 to 7) {
      board(i)(j) = "   "
    }
  }

  private def putPiecesOnTheBoard() : Unit = {
    for ((k,v) <- piecesPosition) {
      board(v(0))(v(1)) = k
    }
  }

  private def displayBoardOnConsole() : Unit = {
    var i = 0
    var j = 0
    for(i<-0 to 32) printf("-")
    printf("\n")
    for (i <- 0 to 7) {
      printf("|")
      for(j<- 0 to 7) {
        printf("%s|".format(board(i)(j)))
      }
      printf("\n")
      for(i<-0 to 32) printf("-")
      printf("\n")
    }
  }
}
