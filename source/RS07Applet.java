
/**
 * Copyright (c) 2016 Kyle Fricilone
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

/**
 * @author Kyle Fricilone
 * @date Jun 19, 2016
 */
public class RS07Applet implements AppletStub {

	/**
	 * The host address
	 */
	private final String host = "127.0.0.1";

	/**
	 * The parameters of the client.
	 */
	private final Map<String, String> map = new HashMap<>();

	/**
	 * The main entry point of the current application.
	 *
	 * @param args
	 *            The command line arguments.
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public static void main(final String[] args) throws Exception {
		final RS07Applet applet = new RS07Applet();
		applet.initialize();

		final Class<?> client = Class.forName("client");
		final Applet instance = (Applet) client.getConstructor().newInstance();

		final JFrame frame = new JFrame("FrizDeob | #1");
		frame.add(instance);
		frame.setVisible(true);
		frame.setSize(781, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		client.getSuperclass().getMethod("setStub", AppletStub.class).invoke(instance, applet);
		client.getMethod("init").invoke(instance);
		client.getMethod("start").invoke(instance);
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 *
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	private void initialize() throws MalformedURLException, IOException {
		map.put("1", "true");
		map.put("7", "0");
		map.put("5", "0");
		map.put("3", "true");
		map.put("2", "301");
		map.put("9", "http://www.runescape.com/slr.ws?order=LPWM");
		map.put("4", "0");
		map.put("8", "5");
		map.put("6", "true");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.applet.AppletStub#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(final String paramName) {
		return map.get(paramName);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.applet.AppletStub#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://" + host);
		} catch (final MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.applet.AppletStub#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + host);
		} catch (final MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.applet.AppletStub#isActive()
	 */
	@Override
	public boolean isActive() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.applet.AppletStub#getAppletContext()
	 */
	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(final int width, final int height) {
	}

}
