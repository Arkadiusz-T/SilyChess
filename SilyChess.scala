object SilyChess {
  def main(args : Array[String]) : Unit = {
    println("Welcome to simple chess game")
    val whitePlayer = new Player("White")
    val blackPlayer  = new Player("Black")
    val board = new Board
    board.setStartingFormation()

    while(true){
      whitePlayer.makeMove(board)
      blackPlayer.makeMove(board)
    }
  }
}
