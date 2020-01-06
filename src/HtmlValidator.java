import java.util.Queue;
import java.util.Stack;

/*
 * SD2x Homework #2
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

public class HtmlValidator {
	
	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {

		Stack<HtmlTag> stack = new Stack<>();
		System.out.println("Initial Tag Elements " + tags);

		for (HtmlTag tag : tags){

			if (tag.isOpenTag()){
				stack.push(tag);
			}else if (!tag.isSelfClosing()){
				if (!stack.empty()){
					if (tag.matches(stack.peek())){
						stack.pop();
					}
				}else {
					stack.push(tag);
				}
			}
		}

		System.out.println("resulting stack: " + stack);
		return stack;
	}

	private static Stack<HtmlTag> other(Queue<HtmlTag> tags){

		return null;
	}

}

