class Solution:
    def longestCommonPrefix(self, strs) -> str:  # List[str]
        prefix = strs[0]

        for str in strs:
            while str.find(prefix) != 0:
                prefix = prefix[:-1]

        return prefix
