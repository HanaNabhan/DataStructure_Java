package stack_with_linkedlist;

/**
 * Author: Hana Nabhan Description: This class implements a simple linked list
 * with basic operations like inserting, deleting, finding nodes, and more.
 * Date: December 2024
 */

public class SimpleLinkedList {
	public Node first; // This keeps track of the first node in the list.

	// This is the constructor, it sets up an empty linked list.
	public SimpleLinkedList() {
		first = null; // When we start, there's no data, so 'first' is null.
	}

	// Just checks if the list is empty.
	public boolean IsEmpty() {
		return first == null; // If there's no first node, the list is empty.
	}

	// Adds a new node at the very beginning of the list.
	public void InsertFirst(int i) {
		Node n = new Node(i); // Create a new node with the given value.
		if (IsEmpty()) {
			first = n; // If the list is empty, this new node becomes the first one.
		} else {
			n.next = first; // Otherwise, point this new node to the current first node.
			first = n; // Then update 'first' to this new node.
		}
	}

	// Adds a new node to the very end of the list.
	public void InsertEnd(int i) {
		Node n = new Node(i); // Create a new node with the given value.
		if (IsEmpty()) {
			first = n; // If the list is empty, this new node becomes the first one.
		} else {
			Node current = first; // Start from the first node.
			while (current.next != null) { // Keep going until you reach the last node.
				current = current.next;
			}
			current.next = n; // Link the last node to the new node.
		}
	}

	// Counts how many nodes are in the list.
	public int Count() {
		int count = 0; // Start with a count of zero.
		if (IsEmpty()) {
			return count; // If the list is empty, the count is zero.
		} else {
			Node current = first; // Start from the first node.
			while (current != null) { // Go through each node.
				count++; // Increment the count for each node.
				current = current.next; // Move to the next node.
			}
			return count; // Return the total count.
		}
	}

	// Inserts a new node at a specific position in the list.
	public void Insert(int i, int position) {
		Node n = new Node(i); // Create a new node with the given value.
		if (Count() < position) {
			System.out.print("Wrong position, will add it at the end.\n");
			position = Count() + 1; // If the position is invalid, add the node at the end.
		}
		if (IsEmpty()) {
			first = n; // If the list is empty, this new node becomes the first one.
		} else {
			Node current = first; // Start from the first node.
			for (int x = 1; x < position - 1; x++) { // Navigate to the desired position.
				if (current == null)
					break;
				current = current.next;
			}
			if (current == first) { // If inserting at the very start.
				n.next = first; // Point the new node to the current first node.
				first = n; // Update 'first' to the new node.
			} else {
				n.next = current.next; // Link the new node to the next node.
				current.next = n; // Link the previous node to the new node.
			}
		}
	}

	// Deletes the first node and returns it.
	public Node DeleteFirst() {
		Node temp = first; // Save the current first node.
		if (IsEmpty()) {
			return null; // If the list is empty, there's nothing to delete.
		} else {
			first = first.next; // Update 'first' to the next node.
			return temp; // Return the deleted node.
		}
	}

	// Displays all the nodes in the list.
	public void DisplayList() {
		if (IsEmpty()) {
			return; // If the list is empty, there's nothing to display.
		} else {
			Node current = first; // Start from the first node.
			while (current != null) { // Go through each node.
				current.displayNode(); // Print the node's value.
				current = current.next; // Move to the next node.
			}
			System.out.print("\n"); // Add a newline at the end.
		}
	}

	// Finds a node with a specific value.
	public Node find(int i) {
		if (IsEmpty()) {
			return null; // If the list is empty, the value can't be found.
		} else {
			Node current = first; // Start from the first node.
			while (current.data != i) { // Look for the value.
				if (current.next == null)
					return null; // If we reach the end, the value isn't in the list.
				current = current.next; // Move to the next node.
			}
			return current; // Return the node with the value.
		}
	}

	// Deletes a node with a specific value.
	public Node delete(int i) {
		if (IsEmpty()) {
			return null; // If the list is empty, there's nothing to delete.
		} else {
			Node current = first; // Start from the first node.
			Node previous = first; // Keep track of the previous node.
			while (current.data != i) { // Look for the value.
				if (current.next == null)
					return null; // If we reach the end, the value isn't in the list.
				previous = current; // Update 'previous' to the current node.
				current = current.next; // Move to the next node.
			}
			if (current == first)
				first = first.next; // If the node to delete is the first one, update 'first'.
			else
				previous.next = current.next; // Otherwise, skip the node to delete.
			return current; // Return the deleted node.
		}
	}

	// Finds the node with the lowest value.
	public Node FindLowest() {
		if (IsEmpty()) {
			return null; // If the list is empty, there's no lowest value.
		} else {
			Node current = first; // Start from the first node.
			Node min = first; // Assume the first node has the lowest value.
			while (current != null) { // Go through each node.
				if (current.data < min.data) // If a lower value is found.
					min = current; // Update the minimum node.
				current = current.next; // Move to the next node.
			}
			return min; // Return the node with the lowest value.
		}
	}

	// Finds the node with the highest value.
	public Node FindHighest() {
		if (IsEmpty()) {
			return null; // If the list is empty, there's no highest value.
		} else {
			Node current = first; // Start from the first node.
			Node max = first; // Assume the first node has the highest value.
			while (current != null) { // Go through each node.
				if (current.data > max.data) // If a higher value is found.
					max = current; // Update the maximum node.
				current = current.next; // Move to the next node.
			}
			return max; // Return the node with the highest value.
		}
	}

	// Deletes the last node and returns it.
	public Node DeleteLast() {
		if (IsEmpty()) {
			return null; // If the list is empty, there's nothing to delete.
		} else {
			Node current = first; // Start from the first node.
			Node previous = first; // Keep track of the previous node.
			while (current.next != null) { // Go through each node until the last one.
				previous = current; // Update 'previous' to the current node.
				current = current.next; // Move to the next node.
			}
			previous.next = null; // Remove the last node by setting 'next' to null.
			return current; // Return the deleted node.
		}
	}

	public void LinkedlistBubbleSort() {
        if (IsEmpty() || first.next == null) {
            // If the list is empty or has only one node, no need to sort.
            return;
        }

        boolean swapped; // Flag to check if a swap occurred.
        Node current;
        Node prev = null; // Keeps track of the last sorted element.

        do {
            swapped = false;
            current = first;

            while (current.next != prev) { // Traverse until the last sorted node.
                if (current.data > current.next.data) {
                    // Swap data between current and next node.
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true; // A swap occurred.
                }
                current = current.next; // Move to the next pair.
            }

            // Update the last sorted node.
            prev = current;
        } while (swapped); // Continue until no swaps occur in a pass.
    }

	public SimpleLinkedList Mergesort(SimpleLinkedList i ,SimpleLinkedList j) {
		SimpleLinkedList mergedlist = new SimpleLinkedList();
		if(i.IsEmpty() ) {
			return j ;
		}
		else if(j.IsEmpty()){
			return i;
		}
		Node currentA = i.first;
		Node currentB = j.first;
		  // Initialize the first node of the merged list
	    if (currentA.data <= currentB.data) {
	        mergedlist.first = new Node(currentA.data);
	        currentA = currentA.next;
	    } else {
	        mergedlist.first = new Node(currentB.data);
	        currentB = currentB.next;
	    }

	    Node currentC = mergedlist.first;

	    // Merge the two lists
	    while (currentA != null && currentB != null) {
	        if (currentA.data <= currentB.data) {
	            currentC.next = new Node(currentA.data);
	            currentA = currentA.next;
	        } else {
	            currentC.next = new Node(currentB.data);
	            currentB = currentB.next;
	        }
	        currentC = currentC.next;
	    }
	    while (currentA != null) {
	        currentC.next = new Node(currentA.data);
	        currentA = currentA.next;
	        currentC = currentC.next;
	    }

	    while (currentB != null) {
	        currentC.next = new Node(currentB.data);
	        currentB = currentB.next;
	        currentC = currentC.next;
	    }
		
		
		
		return mergedlist;
	 
 }
	 public Node GetFirst() {
	        return first; // Returns the head node
	    }
   
}
