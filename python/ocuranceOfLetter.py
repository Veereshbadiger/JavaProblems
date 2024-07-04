def occurance(text):
    s= {}
    for letter in text:
        if letter in s:
            s[letter] +=1
        else:
            s[letter] =1
    return s

result=occurance("bhdscjsndl")
print(result)
