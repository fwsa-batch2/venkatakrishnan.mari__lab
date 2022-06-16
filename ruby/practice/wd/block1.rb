def run_once
    yield 4
    puts "This is second run!"
 end
 
 run_once {|x| puts "This block was run! #{x}" }