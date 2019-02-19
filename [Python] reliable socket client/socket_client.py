import socket
import _thread
import time

class SocketClient:

  """ 
  Connect to a socket and send messages,
  Background forever thread for a reliable connection
  """
	
	def __init__(self, host_addr, host_port):
		self.host_addr = host_addr
		self.host_port = host_port
		self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		_thread.start_new_thread(self.connect, ())
		
	def connect(self):
		while True:
			try:
				self.sock.sendall(b"SYN")
			except:
				self.sock.close()
				self.sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
				self.sock.connect_ex((self.host_addr, self.host_port))
				print ("-- trying to connect {}:{} --".format(self.host_addr,self.host_port))
			time.sleep(1)

	def send_msg(self, msg):
		try:
			self.sock.sendall(msg)
			return 0
		except:
			return -1
      
      
           
# usage :
#
# obj = SocketClient("192.168.8.100", 25001)
# input()
# d.send_msg(b"ABC")
# input()