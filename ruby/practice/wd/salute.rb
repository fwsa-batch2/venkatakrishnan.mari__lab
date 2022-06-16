def salute(fname,sname)
    a = sname.capitalize!
    b = fname.split.last
    puts "#{a} Mr.#{b}"
   
end

salute("Nelson Rolihlahla Mandela", "hello")
salute("Sir Alan Turing", "welcome")
