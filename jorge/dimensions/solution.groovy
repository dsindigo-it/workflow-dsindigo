// 2*l*w + 2*w*h  + 2*hl * 
Closure formula = { l, w, h -> (2*l*w) + (2*w*h) + (2*h*l)  }
int result = 0;
new File("dimesions.txt").text.eachLine {
    def values = it.split("x")*.toInteger()
    result += formula(*values) + values.min()
}
println "Resultado: ${result}"