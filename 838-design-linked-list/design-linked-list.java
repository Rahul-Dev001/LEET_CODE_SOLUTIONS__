class MyLinkedList {
    int val;
    MyLinkedList next;

    public MyLinkedList() {
        
    }
    
    // public int get(int index) {
        
    //     MyLinkedList current = this.next;
    //     int i;
    //     for(i = 2 ; i <= index && current != null && current.next != null ; i++ ){
    //         current = current.next ;
    //     }
    //     if(i < index){
    //         return -1;
    //     }
    //     return current.val;
    // }
    public int get(int index) {
    MyLinkedList current = this.next;

    for (int i = 0; i < index && current != null; i++) {
        current = current.next;
    }

    if (current == null) {
        return -1;
    }

    return current.val;
}
    
    public void addAtHead(int val) {
        MyLinkedList temp = new MyLinkedList();
        temp.val = val;
        temp.next = this.next;
        this.next = temp;
        }
    
    public void addAtTail(int val) {
        if(this.next == null){
            addAtHead(val);
            return;
        }
        MyLinkedList current = this.next;
        while(current.next != null){
            current = current.next ;
        }
        MyLinkedList temp = new MyLinkedList();
        temp.val = val;
        current.next = temp;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        MyLinkedList current = this.next;
        
        for(int i = 1 ; i <= index-1 && current != null && current.next != null ; i++ ){
            current = current.next ;
        }
        if(current.next == null){
            addAtTail(val);
            return;
        }
        else{
            MyLinkedList temp = new MyLinkedList();
            temp.val = val;
            temp.next = current.next;
            current.next = temp;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index == 0){
            if(this.next != null)
            this.next = this.next.next;
            return;
        }
        MyLinkedList current = this.next;
        
        for(int i = 1 ; i <= index-1 && current != null && current.next != null ; i++ ){
            current = current.next ;
        }
        if(current.next == null){
            return;
        }
        else{
            if(current.next != null)
            current.next = current.next.next;
        }
    }
}


// MyLinkedList current = this;  i forogt how to refer curret obj

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */