	package assignments;

	public class Main_program {

		public static void main(String args[])
		{
			Try_catch_example E = new Try_catch_example();
			E.take_input();
			
			Checked_unchecked_exceptions C = new Checked_unchecked_exceptions();
			C.checked_exception();
			C.unchecked_exception();
			
			Throw_example T = new Throw_example();
			try
			{
				T.Throw_Arithmetic();
			}
			catch(ArithmeticException Exception)
			{
				System.out.println("You have entered 1 or Zero..Exception catched from my end");
			}

			
		}
}