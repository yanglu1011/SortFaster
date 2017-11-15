package sortAlgorithms;

import java.util.Observable;

import GUI.SortGUI;

/**
 * @authors Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment Insertionsort
 */
public class Insertionsort extends SortingAlgorithm {

	/*
	 * Yang: use observer as a way of updating might be possible to put in
	 * SortingAlgorithm instead
	 */
	private Observe o = new Observe();

	private class Observe extends Observable {
		// tell the change
		public void changed() {
			this.setChanged();
		}
	}

	@Override
	public void sort(int[] arr) {
		o.addObserver(SortGUI.gv);
		int i = 1;
		long runtime = 0;
		while (i < arr.length) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				/* Yang: if this part is the same for all algorithms, put it as a method in SortingAlgorithm */
				// --------------------------------------------------------------------
				// set comparing indexes
				SortGUI.gv.setSelJ(j);
				SortGUI.gv.setSelJPlus(j - 1);
				// wait
				while (!SortGUI.gv.isClicked()) {
					/* Yang: this must be here to act as an delay, don't know why */
					System.out.print("");
				}
				SortGUI.gv.setClicked(false);
				// --------------------------------------------------------------------
				long before = System.nanoTime();
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
				long after = System.nanoTime();
				runtime += after - before;
				o.changed();
				o.notifyObservers();
			}
			i++;
		}
		System.out.println("Insertionsort run time: " + runtime + " nanoseconds");
	}

}
