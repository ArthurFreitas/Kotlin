fun isValidIdentifier(s: String): Boolean {
    if(s.isEmpty() || s[0].isDigit())
        return false

    fun isValidChar(c: Char) = c == '_' || c.isLetterOrDigit()
    for(c in s)
        if(!isValidChar(c))
            return false
    return true
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
