
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Linkedlist:
    def __init__(self):
        self.head = None
    
    def push(self,new_data):
        new_node=Node(new_data)
        new_node.next=self.head
        self.head=new_node

    def append(self,new_data):
        if self.head is None:
            self.head=new_data
            return
        new_node=Node(new_data)
        last=self.head
        while(last.next!=None):
            last=last.next
        last.next=new_node
        new_node.next=None
    def insertAfter(self,prev_node,new_data):
        if prev_node is None:
            print("Given prev node can not be none")
            return
        new_node=Node(new_data)
        new_node.next=prev_node.next
        prev_node.next=new_node
    def change(self):
        temp=self.head
        self.head=self.head.next
        del temp
    
    def delete(self,key):
        temp=self.head
        if temp is not None:
            if temp.data==key:
                self.head=temp.next
                temp=None
                return

        while(temp!=None):
            if temp.data==key:
                break
            prev=temp
            temp=temp.next
        if temp is None:
            return
        prev.next=temp.next
        # temp=None



    def printlist(self):
        temp = self.head
        while (temp != None):
            print(temp.data)
            temp = temp.next


list = Linkedlist()
# list.head = Node(1)
# second = Node(2)
# third = Node(3)
# fourth = Node(4)
# print(list.head.data)
# print(second.data)

# list.head.next = second
# second.next = third
# third.next = fourth
list.push(11)
list.push(12)
list.push(13)
list.append(10)
list.append(15)
# list.printlist()
# list.change()
list.insertAfter(list.head.next,100)
list.printlist()
print()
list.delete(10)
list.printlist()
