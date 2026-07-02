class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if num1 == "0" or num2 == "0":
            return "0"

        m, n = len(num1), len(num2)
        res = [0] * (m + n)

        for i in range(m - 1, -1, -1):
            a = ord(num1[i]) - 48
            for j in range(n - 1, -1, -1):
                b = ord(num2[j]) - 48
                s = a * b + res[i + j + 1]
                res[i + j + 1] = s % 10
                res[i + j] += s // 10

        i = 0
        while i < len(res) and res[i] == 0:
            i += 1

        return ''.join(map(str, res[i:]))