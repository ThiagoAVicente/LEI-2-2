// Generated from Hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode; // necessário para iterar pelos id's

/**
 * This class provides an empty implementation of {@link HelloVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class HelloBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements HelloVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAction(HelloParser.ActionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGreetings(HelloParser.GreetingsContext ctx) {

		// apanhar texto de cada ID
		for (TerminalNode idToken : ctx.ID()) {
			String s = idToken.getText();
			System.out.println("Hi " + s);
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBye(HelloParser.ByeContext ctx) {
		for (TerminalNode idToken : ctx.ID()) {
			String s = idToken.getText();
			System.out.println("Bye " + s);
		}
		return null;

	}
}