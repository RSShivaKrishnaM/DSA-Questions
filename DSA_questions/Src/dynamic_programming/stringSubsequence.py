def recursion(string : str, subSeq : str, ind : int ):
    
    if(len(string)==ind ):
        print(subSeq)
        return
        
    # take
    recursion(string, subSeq+string[ind], ind+1)
    
    # not take
    recursion(string, subSeq, ind+1)
    
if __name__ == "__main__":
    recursion("abc", "", 0)