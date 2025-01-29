from collections import Counter
import re
def count_word_frequencies(text):
   words = re.findall(r'\b\w+\b', text.lower())
   word_counts = Counter(words)
   for word, count in word_counts.most_common():
       print(f"{word}: {count}")
text = "Hello world! This is a test. Hello, this test is only a test."
count_word_frequencies(text)