def ssort(arr, n):
  for i in range(n-1):
    min=i
    for j in range(i+1, n):
      if(arr[min]>arr[j]):
        arr[min], arr[j]=arr[j], arr[min]
arr=[]
n=int(input("Enter The Size of Array:->"))
for i in range(n):
  e=int(input())
  arr.append(e)

ssort(arr, n)
for i in range(n):
  print(arr[i])
