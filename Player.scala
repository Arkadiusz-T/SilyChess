import scala.io.StdIn.readLine

class Player (color : String) {

  var move : String = " "
  def makeMove(board : Board): Unit ={
    // expect player to write name of the figure and coordinates 3 values separated with space
    println("%s player move:".format(color))
    move = readLine()
    var parsedMove = move.split(" ")
    var pieceName = parsedMove(0)
    var row = parsedMove(1).toInt
    var col = parsedMove(2).toInt
    board.piecesPosition(pieceName) = Array(row, col)
    board.printBoard()
  }
}
