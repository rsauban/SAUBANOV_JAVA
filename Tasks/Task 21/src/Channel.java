public class Channel {

        private final int MAX_PROGRAMS_TV = 100;
        private String name;
        private Program[] programs;
        private int countPrograms;


	public Channel() {
            this.programs = new Program[MAX_PROGRAMS_TV];
            for (int i = 0; i < countPrograms; i++)
            {
                programs[i] = new Program();
            }



        }

        void show() {
            programs[random.nextInt()].printName();
        }

        void addProgram(Program program) {
	    this.programs[]

        }



}
