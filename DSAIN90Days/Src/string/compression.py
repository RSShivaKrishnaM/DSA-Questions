def compress(chars: list[str]):
    dictt = {}
    for charr in chars:
        if charr in dictt.keys():
            dictt.update({charr: dictt[charr]+1})
        else:
            dictt.update({charr:1})
            
    strr = ''
    for key in dictt:
       strr = strr + key + str(dictt[key])
        
    print(strr)
   

if __name__ == "__main__":
    compress(["a","a","b","b","c","c","c"])