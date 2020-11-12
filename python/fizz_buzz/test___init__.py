from unittest import TestCase

from fizz_buzz import Solution


class TestSolution(TestCase):
    def test_fizz_buzz(self):
        solution = Solution()

        actual = solution.fizzBuzz(6)

        self.assertListEqual(
            actual,
            ["1", "2", "Fizz", "4", "Buzz", "Fizz"])
