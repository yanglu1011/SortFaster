package sortAlgorithms;

import java.util.Observable;

import GUI.SortGUI;

/**
 * @author Yang Yang Lu, John Bui, Jordan Siaha
 *
 * @comment bubblesort
 */
public class Bubblesort extends SortingAlgorithm {

	/* Yang: use observer as a way of updating might be possible to put in SortingAlgorithm instead */
	private Observe o = new Observe();

	private class Observe extends Observable {
		// tell the change
		public void changed() {
			this.setChanged();
		}
	}

	/* Yang: can be optimized */
	@Override
	public void sort(int[] arr) {
		o.addObserver(SortGUI.gv);
		/* Yang: let's make sure we add run time for comparison purpose */
		/* Yang: *changed* how elapse time is calculated by ignoring the time of observer */
		long runtime = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				/* Yang: if this part is the same for all algorithms, put it as a method in SortingAlgorithm */
				// --------------------------------------------------------------------
				// set comparing indexes
				SortGUI.gv.setSelJ(j);
				SortGUI.gv.setSelJPlus(j + 1);
				// wait
				while (!SortGUI.gv.isClicked()) {
					/* Yang: this must be here to act as an delay, don't know why */
					System.out.print("");
				}
				SortGUI.gv.setClicked(false);
				// --------------------------------------------------------------------
				
				long before = System.nanoTime();
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				} 
				long after = System.nanoTime();
				runtime += after - before;
				o.changed();
				o.notifyObservers();
			}
		}
		System.out.println("Bubblesort run time: " + runtime + " nanoseconds");
//		TestFileWriter tfw = new TestFileWriter();
//		tfw.test(runtime);
	}

}
