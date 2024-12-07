package circular;

public class circular_list {
	public Node first; // This keeps track of the first node in the list.
	public Node last;
	public int size;

	// This is the constructor, it sets up an empty linked list.
	public circular_list() {
		first = null; // When we start, there's no data, so 'first' is null.
		last = null;
		size = 0;
	}

	// Just checks if the list is empty.
	public boolean IsEmpty() {
		return first == null && last == null; // If there's no first node, the list is empty.
	}

	// Adds a new node at the very end of the list.
	public void InsertEnd(int i) {
		Node n = new Node(i); // Create a new node with the given value.
		if (IsEmpty()) {
			first = n; // If the list is empty, this new node becomes the first one.
			last = n;
			n.next = n;
		} else {
			n.next = first; // Otherwise, point this new node to the current first node.
			last.next = n;
			last = n; // Then update 'first' to this new node.

		}
		size++;
	}

	// Adds a new node to the very first of the list.
	public void InsertFirst(int i) {
		Node n = new Node(i); // Create a new node with the given value.
		if (IsEmpty()) {
			first = n; // If the list is empty, this new node becomes the first one.
			last = n;
			n.next = n;

		} else {
			n.next = first;
			first = n;
			last.next = n;
		}
		size++;

	}

	// Inserts a new node at a specific position in the list.
	public void Insert(int i, int position) {
		Node n = new Node(i); // Create a new node with the given value.
		if (size < position) {
			System.out.print("Wrong position, will add it at the end.\n");
			position = size + 1; // If the position is invalid, add the node at the end.
		}
		if (IsEmpty()) {
			first = n; // If the list is empty, this new node becomes the first one.
			last = n;
			n.next = n;
		} else if (position == 1) {
			n.next = first;
			first = n;
			last.next = n;
		} else {
			Node current = first; // Start from the first node.
			for (int x = 1; x < position - 1; x++) { // Navigate to the desired position.

				current = current.next;
			}

			n.next = current.next; // Link the new node to the next node.
			current.next = n; // Link the previous node to the new node.
			if (last == current) {
				last = n;
			}
		}

		size++;
	}

	// Deletes the first node and returns it.
	public Node DeleteFirst() {
		Node temp = first; // Save the current first node.
		if (IsEmpty()) {
			return null; // If the list is empty, there's nothing to delete.
		} else if (first == last) {
			first = null;
			last = null;
		} else {
			first = first.next; // Update 'first' to the next node.
			last.next = first;
		}
		size--;
		return temp; // Return the deleted node.

	}

	// Displays all the nodes in the list.
	public void DisplayList() {
		if (IsEmpty()) {
			return; // If the list is empty, there's nothing to display.
		} else {
			Node current = first; // Start from the first node.
			while (current != last) { // Go through each node.
				current.displayNode(); // Print the node's value.
				current = current.next; // Move to the next node.
			}
			current.displayNode();
			System.out.print("\n"); // Add a newline at the end.
		}
	}

	// Finds a node with a specific value.
	public Node find(int i) {
		if (IsEmpty()) {
			return null; // If the list is empty, the value can't be found.
		} else {
			Node current = first; // Start from the first node.
//			while (current.data != i) { // Look for the value.
//				if (current == last)
//					return null; // If we reach the end, the value isn't in the list.
//				current = current.next; // Move to the next node.
//			}
			do {
				if (current.data == i) {
					return current;
				}
				current = current.next;

			} while (current != first);
			return null; // Return the node with the value.
		}
	}

	// Deletes a node with a specific value.
	public Node delete(int i) {
		if (IsEmpty()) {
			return null; // If the list is empty, there's nothing to delete.
		}
		Node current = first; // Save the current first node.

		if (first == last && first.data == i) {
			first = null;
			last = null;
			return current;
		} else {

			do {
				if (current.next.data == i) {
					Node temp = current.next;
					if (current == first) {
						first = current.next;
						last.next = first;
					} else if (current.next == last) {
						last = current;
						last.next = first;

					} else {
						current.next = current.next.next;
					}

					size--;
					return temp;
				}
				current = current.next;

			} while (current != first);

			return null; // Return the deleted node.
		}
	}

	// Deletes the last node and returns it.
	public Node DeleteLast() {
		Node temp = last;

		if (IsEmpty()) {
			return null; // If the list is empty, there's nothing to delete.
		}

		if (first == last) {
			first = null;
			last = null;
			size--;
			return temp;
		}

		Node current = first;
		while (current.next != last) {
			current = current.next;
		}
		current.next = first;
		last = current;
		size--;
		return temp;

	}}

