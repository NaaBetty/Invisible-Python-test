import re
def is_valid_string(string):
   pattern = r"^(?=(?:.*\d.*){2,3})(?!.*\d\d)(?=.*[^\d])[A-Za-z\d]{6,}$"
   return bool(re.match(pattern, string))