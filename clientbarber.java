

public class Principal
{
	public static void main(String[] args)
	{
		int fim = 0;

		do
		{
			ArrayList<Cliente> dados = new ArrayList<Cliente>();

			String main;
			int forget;
			Scanner scan = new Scanner(System.in);

			menu = JOptionPane.showInputDialog("MENU\n\n" +
            "1 - Add customer \ n" +
            "2 - Remove customer \ n" +
            "3 - Search customer \ n" +
            "4 - Print number of customers \ n" +
            "5 - List all customers \ n" +
            "0 - Exit \ n");

			escolha = Integer.parseInt(menu);


			if(escolha == 1)
			{
				
			}
			else if(escolha == 2)
			{
				.
			}
			else if(escolha ==3)
			{
				
			}
			else if(escolha == 4)
			{
				
			}
			else if(escolha == 5)
			{
				
			}
			else if(escolha == 0)
			{
				fim = 1;
			}
			else
			{
				System.out.println("Invalid option!");
			}


		}

		while(fim != 1);

	}

}



public class Client
{
	private String name;
	private String email;
	private String address;

	public Cliente(String name, String email, String address)
	{
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	//------------------------------------
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
	//------------------------------------
	public String getaddress()
	{
		return address;
	}

	public void setaddress(String address)
	{
		this.address = address;
	}