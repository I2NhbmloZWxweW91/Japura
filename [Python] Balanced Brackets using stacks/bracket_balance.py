#!/usr/bin/python

def isBalanced(s):

    openl = ['{', '[', '(']
    pair = {'}': '{', ']': '[', ')': '('}

    stack = []
    for i in s:
        try:
            if i in openl:
                stack.append(i)
            else:
                temp = stack.pop()
                if pair[i] != temp:
                    return False
        except:
            pass
    return True


s = '({[{[}]})'
print (isBalanced(s))