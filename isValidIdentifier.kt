fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty())
    	return false
    
    fun validStart(s: String): Boolean {
    	if(s.startsWith("_"))
        	return true
        when (s){
            in "a".."z", in "A".."Z" -> return true
            else -> return false
        }
    }
    
    fun validDigits(s: String): Boolean {
        for(char in s)
        	if(char != '_' && char !in 'a'..'z' && char !in 'A'..'Z' && char !in '0'..'9')
            	return false
        return true
    }
    
    return validStart(s) && validDigits(s)
}

fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
