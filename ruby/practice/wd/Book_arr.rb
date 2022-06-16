books = ["Siddhartha", "Shogun", "Discworld"]


puts books.length

# What is the first book?
puts books[0]

# Uh, oh, that's the second book. Array indexes start at 0!
puts books[1]

# Now let's get the last book from the array.
# This will work in any array of any length.
puts books[books.length - 1]

# Let's add a new book to the end of the array
books.push("Harry Potter")

# Now what could be the last element in the array?
# We actually don't have to do `books.length - 1`.
# There is a Ruby method that does exactly that!
books.last

puts books.length
puts books.last