from typing import List


class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        answer = []

        for i in range(1, n + 1):

            value = ""
            if i % 3 == 0:
                value += "Fizz"
            if i % 5 == 0:
                value += "Buzz"

            if value.__eq__(""):
                value = str(i)

            answer.append(value)

        return answer
