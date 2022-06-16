library = {}
library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
library["asimov"] = ["Robots of Dawn", "I, Robot"]

authors = library.keys
puts "These are the authors in my catalog: #{authors.join(', ')}"

library.each do |author, books|
  puts "#{author.capitalize} wrote the books #{books.join(', ')}"
end