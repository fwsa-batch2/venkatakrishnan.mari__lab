def ip_address?(str)
    
    !!(str =~ /^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$/)
  end
  ip_address?("192.168.1.1")
  ip_address?("0000.0000")