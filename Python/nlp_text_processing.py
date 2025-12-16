# AnshumanSarma_WAP to perform basic NLP tasks using NLTK


import nltk
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords
from nltk import pos_tag, ne_chunk
from nltk.stem import WordNetLemmatizer, PorterStemmer

nltk.download('punkt')  # Tokenizer
nltk.download('averaged_perceptron_tagger')  # POS Tagger
nltk.download('maxent_ne_chunker')  # Named Entity Chunker
nltk.download('words')  # Word lists for chunking
nltk.download('stopwords')  # Stop words for filtering
nltk.download('wordnet')  # Lemmatizer
nltk.download('omw-1.4')  # WordNet Multilingual

lemmatizer = WordNetLemmatizer()
ps = PorterStemmer()

text = "Anshuman hates mathematics but those who are good at it, Trumps everyone. So sarmaji must cope with it."

def language_identification(text):
    return "English (Assumed)" if any(char.isalpha() for char in text) else "Unknown"

def process_text(text):
    tokens = word_tokenize(text)  # Tokenize the text
    pos_tags = pos_tag(tokens)  # Part-of-speech tagging
    chunks = ne_chunk(pos_tags)  # Named entity recognition
    stop_words = set(stopwords.words("english"))  # Get English stop words
    filtered_tokens = [word for word in tokens if word.lower() not in stop_words]  # Filter out stopwords
    return tokens, pos_tags, chunks, filtered_tokens

tokens, pos_tags, chunks, filtered_tokens = process_text(text)

print(f"Language: {language_identification(text)}")  # Display detected language
print(f"Tokens: {tokens}")  # Print tokenized words
print(f"POS Tags: {pos_tags}")  # Print POS tags
print(f"Chunks (NER): {chunks}")  # Print named entities
print(f"Filtered Tokens: {filtered_tokens}")  # Print tokens without stopwords
print(f"Lemmatized: {[lemmatizer.lemmatize(word) for word in tokens]}")  # Print lemmatized tokens
print(f"Stemmed: {[ps.stem(word) for word in tokens]}")  # Print stemmed tokens
#text_done