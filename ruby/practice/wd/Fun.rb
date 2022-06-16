recipients = [
    ["Srinath"],
    ["Jadeja", "Kambli"],
    ["Sachin", "Sidhu", "Kumble"]
  ]

  # emails = recipients[1]
  # if emails.length == 1
  #   puts "Hello #{emails[0]}!"
  # elsif emails.length == 2
  #   puts "Hello #{emails[0]} and #{emails[1]}!"
  # elsif emails.length > 2
  #   puts "Hello #{emails[0..-2].join(', ')}, and #{emails.last}!"
  # end

  # emails = recipients[1]
  # if emails.length == 1
  #   puts "Hello #{emails[0]}!"
  # elsif emails.length == 2
  #   puts "Hello #{emails[0]} and #{emails[1]}!"
  # elsif emails.length > 2
  #   puts "Hello #{emails[0..-2].join(', ')}, and #{emails.last}!"
  # end

  emails = recipients[2]
  if emails.length == 1
    puts "Hello #{emails[0]}!"
  elsif emails.length == 2
    puts "Hello #{emails[0]} and #{emails[1]}!"
  elsif emails.length > 2
    puts "Hello #{emails[0..-3].join(', ')}, and #{emails.last}!"
  end