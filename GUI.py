import tkinter as tk
import random
import string

# Function to generate a random password
def generate_password(length):
    characters = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(random.choice(characters) for _ in range(length))
    return password

# Function to generate a new password and update the display
def generate_new_password():
    password_length = int(length_entry.get())
    password = generate_password(password_length)
    password_display.config(text="Generated Password: " + password)

# Create the main window
window = tk.Tk()
window.title("Random Password Generator")
window.geometry("500x250")

# Create a label for the length input
length_label = tk.Label(window, text="Password Length:")
length_label.pack()

# Create an entry field for the password length
length_entry = tk.Entry(window)
length_entry.pack()

# Create a button to generate the password
generate_button = tk.Button(window, text="Generate Password", command=generate_new_password)
generate_button.pack()

# Create a label to display the generated password
password_display = tk.Label(window, text="Generated Password: ")
password_display.pack()

# Start the main GUI loop
window.mainloop()
