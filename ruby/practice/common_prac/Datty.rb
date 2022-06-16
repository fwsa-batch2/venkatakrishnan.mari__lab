print "Give me your words! "
user_input = gets.chomp
user_input.downcase!
if user_input.include? "s" "z" "x"
    user_input.gsub!(/s/,/z/,/x/, "th")
else
    puts "There aren't any S's bro. It ain't gonna change."
end
puts "#{user_input}"