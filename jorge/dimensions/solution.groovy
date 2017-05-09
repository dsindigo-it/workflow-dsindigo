// 2*l*w + 2*w*h  + 2*hl * 

Closure formula = { l, w, h -> (2*l*w) + (2*w*h) + (2*h*l) + Math.min(Math.min(l*w, w*h), h*l) }
println new File("dimesions.txt").collect { formula(*it.split("x")*.toInteger()) }.sum()