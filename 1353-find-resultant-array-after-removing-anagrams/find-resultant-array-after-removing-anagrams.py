class Solution:
    def removeAnagrams(self, words: list[str]) -> list[str]:
        # Start the result list with the first word
        result = [words[0]]
        
        for i in range(1, len(words)):
            # Two words are anagrams if their sorted characters are identical.
            # We compare the current word with the last word added to our result.
            if sorted(words[i]) != sorted(result[-1]):
                result.append(words[i])
                
        return result