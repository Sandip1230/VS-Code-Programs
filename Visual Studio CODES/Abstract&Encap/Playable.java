public interface Playable
{
        public abstract void name();
        public abstract void play();
        public abstract void stop();
}

class AudioPLayer implements Playable
{
   @Override
   public void name()
   {
        System.out.println("This is the << NOISE Audio Player  [  Version - 17.1.0.2   ] >>\n");
   }

   @Override    
   public void play()
   {
        System.out.println("    Play the audio ::: \n\n");
   }

   @Override 
   public void stop()
   {
        System.out.println("    Stop the audio ::: \n\n");
   }
}

class VideoPLayer implements Playable
{
   @Override
   public void name()
   {
        System.out.println("This is the << BoAt Video Player  [  Version - 31.6.10.21.2   ] >>\n");
   }

   @Override
   public void play()
   {
        System.out.println("    Play the video ::: \n\n");
   }

   @Override
   public void stop()
   {
        System.out.println("    Stop the video ::: \n\n");
   }
}


class Call_Out
{
    public static void main(String[] args) 
    {
        AudioPLayer objA = new AudioPLayer();
        objA.name();
        objA.play();
        objA.stop();
        
        VideoPLayer objB = new VideoPLayer();
        objB.name();
        objB.play();
        objB.stop();

    }
}