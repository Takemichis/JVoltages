package token;

public enum TokenType {
    //SINGLE-CHARACTER TOKENS.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,

    //ONE OR TWO CHARACTER TOKENS.
    BANG, BANG_EQUAL,
    EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,
    PLUS_PLUS, MINUS_MINUS,

    //BITWISE OPERATIONS
    SHIFT_RIGHT, SHIFT_LEFT, LOGICAL_SHIFT_RIGHT,

    //CONDITIONALS
    QUESTION_MARK, COLON, ELVIS,

    //LITERALS
    IDENTIFIER, STRING, NUMBER, CHAR, NATIVE, PREFIX, INFIX,

    //KEYWORDS
    CLASS, ELSE, FALSE, FUN, FOR, REPEAT, IF, NONE, OR, AND, XOR, PRINT, RETURN,
    SUPER, THIS, TRUE, VAR, DO, WHILE, BREAK, CONTINUE, NULL, TEST, EXTENDS,

    EOF, ARRAY, ARRAY_OPEN, ARRAY_CLOSE
}