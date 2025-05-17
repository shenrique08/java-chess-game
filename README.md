# ♟️ Chess Game in Java

This is a **console-based chess game** developed as part of the [Java COMPLETO](https://www.udemy.com/course/java-curso-completo/) course by **Nelio Alves** on Udemy.

The project focuses on applying **object-oriented programming (OOP)** concepts in Java by simulating a complete chess match, including special rules.

---

## 📌 Features

- ✅ 8x8 chessboard with Unicode-based rendering
- ✅ Turn-based gameplay (white and black)
- ✅ Move validation for each piece
- ✅ Special moves:
  - Castling (king-side and queen-side)
  - En Passant
  - Pawn promotion
- ✅ Check and checkmate detection
- ✅ Clear exception handling for invalid moves
- ✅ Modular object-oriented design

---

## 🛠️ Technologies Used

- Java SE 17+ (or compatible version)
- No frameworks or external libraries
- Console-based interaction (terminal)

---

## 🧱 Project Structure

<pre>
src/
├── application/
│   └── Program.java           # Main class
├── boardgame/
│   ├── Board.java
│   ├── Piece.java
│   ├── Position.java
│   └── exceptions/
│       └── BoardException.java
└── chess/
    ├── ChessMatch.java
    ├── ChessPiece.java
    ├── Color.java
    └── pieces/
        ├── King.java
        ├── Rook.java
        └── ...
</pre>

---

## 🧑‍💻 How to Run

1. Clone this repository:

```bash
git clone https://github.com/your-username/chess-system-java.git
cd chess-system-java
javac src/**/*.java
java src/application/Program
```
## 🎯 Learning Objectives

- Practice OOP with real-world logic  
- Understand game loop structure and exception handling  
- Implement algorithms and rules in a structured way  
- Gain confidence in Java programming  

---

## 📚 Credits

This project was developed following the lessons of the  
**Java COMPLETO - Programação Orientada a Objetos + Projetos** course  
by [Nelio Alves](https://github.com/nelioalves)

---

## 📝 License

This project is **educational** and **open-source**.  
Feel free to use, modify, and share it under the terms of the **MIT License**.

