import java.util.Queue;
import java.util.Stack;



public class HtmlValidator {
	
	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {

		Stack<HtmlTag> stack = new Stack<>();
		System.out.println("Initial Tag Elements " + tags);

		for (HtmlTag tag : tags){
			if (!tag.isSelfClosing()){
				if (tag.isOpenTag() || stack.empty()){
					stack.push(tag);
				}else {
					if (!stack.empty() && tag.matches(stack.peek())){
						stack.pop();
					}
				}
			}
		}

		System.out.println("resulting stack: " + stack);
		return stack;
	}

}

