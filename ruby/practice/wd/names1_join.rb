books = ["Design as Art", "Anathem", "Shogun"]
 authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

 for i in 0...books.length
    book = {
        authors[i] => books[i]
    }
 end
  puts book
