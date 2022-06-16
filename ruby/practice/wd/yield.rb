def wrap_div
    "<div>#{yield}</div>" 
    "<h1>#{yield 1}</h1>"
  end
  
  puts wrap_div { "hello!" }
  wrap_div {|y| puts "This second yield #{y}"}