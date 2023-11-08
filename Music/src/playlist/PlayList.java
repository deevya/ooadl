package playlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class PlayList {
	

	 public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        
	       
	        System.out.println("                         Welcome To The Music World >_<                 \n\n------------------- CREATE YOUR OWN PLAYLIST---------------");
	        System.out.println();
	        System.out.println("                       NAME OF YOUR PLAYLIST");
	        String playlistname=input.nextLine();
	        LinkedList<Song> songs=new LinkedList();
	        //Song is a class which has three fields song name,artist name and duration of the song
	        boolean first=true;
	        while(first){
	            System.out.println("\n 1) To Add Songs To Playlist:\t\t "+playlistname+"\n"+
	                                 " 2) To remove Songs From Playlist:\t "+playlistname+"\n"+
	                                 " 3) To show the songs in Playlist:\t "+playlistname+"\n"+
	                                 " 4) To Play The Playlist:\t\t "+playlistname+"\n"+
	                                 " 5) To Exit");
	            System.out.println("\nEnter your choice");
	            int choice1=input.nextInt();
	            switch(choice1){
	                case 1:
	                	   System.out.println("__________________________________");
	                       System.out.println("\nSONG NAME");
	                       
	                       input.nextLine();
	                       //Just to eliminate the enter otherwise it will be stored as a input
	                       String songname=input.nextLine();
	                       
	                       System.out.println("\nArtist");
	                       
	                       String artist=input.nextLine();
	                       System.out.println("\nDuration");
	                      
	                       String duration=input.nextLine();
	                       System.out.println("__________________________________");
	                       Song s=new Song(songname,artist,duration);
	                       songs.add(s);
	                       System.out.println();
	                       System.out.println(songname+" song is added to playlist "+playlistname+"!!!\n");
	                       break;
	                case 2:
	                     if(songs.size()==0){
	                     System.out.println("No songs present in the Playlist: "+playlistname);
	                     break;
	                     }
	                     else{
	                         System.out.println("\t\t\t\t\tPRESENTING YOUR SONGS >.<");
	                         System.out.println();
	                         System.out.println();
	                         for(Song i:songs){ 
	                        	 //enhanced for loop.
	                             i.showSong();
	                         }
	                         System.out.println("Enter The index of the song to remove,first song is at index 1");
	                         int index=input.nextInt();
	                      
	                         if(index<=0|| index>songs.size())
	                         {
	                             System.out.println("No Song in that index");
	                           
	                         }
	                         else{
	                         songs.remove(index-1);
	                         //As we don't want to confuse the user by the fact that actual index starts from zero.
	                         System.out.println("Song Removed!!");
	                         
	                         }
	                         break;
	                     }
	                       
	                case 3:
	                      if(songs.size()==0){
	                       System.out.println("No songs in the playlist");
	                       break;
	                          }
	                     else{
	                        System.out.println("\t\t\t\tPRESENTING YOUR MUSIC  :)     ");
	                        System.out.println();
	                        System.out.println("________________________");
	                         for(Song i:songs){
	                        	 //enhanced for loop
	                             i.showSong();
	                             System.out.println("_________________________");
	                         }
	                        break;
	                          }
	                case 4: 
	                       if(songs.size()==0){
	                       System.out.println("No songs in the playlist");
	                       break;
	                          }
	                      else{
	                    	  System.out.println("__________________________________");   
	                        System.out.println("\n				YOUR SONGS:");
	                        System.out.println();
	                         for(Song i:songs){ 
	                        	 //enhanced for loop 
	                             i.showSong();
	                         }
	                         System.out.println("__________________________________");
	                         System.out.println("\n\nPLAYING-------->");
	                         songs.getFirst().showSong();
	                         ListIterator<Song> j=songs.listIterator();
	                         //This is iterator and helps us to iterate to a linked list.
	                        j.next();
	                        //as our first song is currently playing.
	                        boolean forward=true;
	                        //helps to keep a track as user is going forward the linked list or backwards
	                        boolean finished=false; 
	                        //To check wheather the user reached end of the linked list or not.
	                      
	                    
	                        boolean second=true;
	                        while(second){
	                            System.out.println("\n\t\t\t\t1)NEXT SONG\n"
	                                                +"\t\t\t\t2)PREVIOUS SONG\n"
	                                                +"\t\t\t\t3)REPEAT SONG\n"
	                                                +"\t\t\t\t4)STOP");
	                            System.out.println("ENTER YOUR CHOICE");
	                             int choice2=input.nextInt();
	                             System.out.println("_______________________________");
	                       switch(choice2){
	                           case 1:
	                              
	                               if(!forward)
	                                {
	                                  if(j.hasNext())
	                                  {
	                                      j.next();
	                                  }
	                                  forward=true;
	                           
	                                }
	                               if(finished==true){
	                                   j.previous();
	                                   finished=false;
	                               }
	                       
	                       
	                                  
	                                  
	                                   
	                                    if(j.hasNext())
	                                    {
	                                    System.out.println("\n=====================================PLAYING NEXT SONG========================================");
	                                    System.out.println("\nSong Playing----->");
	                                    j.next().showSong();
	                      
	                                    }
	                                    else{
	                                    System.out.println("Playlist finished.....");
	                                    finished=true;
	                            
	                                    }
	                                   System.out.println("_____________________________");
	                                   
	                                
	                                    break;
	                           case 2:
	                                  
	                               
	                          if(forward)
	                         {
	                             if(j.hasPrevious())
	                             {
	                                 j.previous();
	                             }
	                      
	                             forward=false;
	                             
	                            
	                         }
	                          if(finished==true){
	                              j.next();
	                              finished=false;
	                          }
	                
	                  
	                        
	                        
	                        if(j.hasPrevious())
	                        {
	                        	 System.out.println("\n=====================================PLAYING PREVIOUS SONG========================================");	
	                        System.out.println("\nSong Playing------ ");
	                        j.previous().showSong();
	                      
	                        }
	                        else{
	                            System.out.println("Playlist finished.....");
	                            finished=true;
	                            
	                        }
	                    System.out.println("___________________________");
	                        break;
	                           case 3:
	                               if(forward)
	                                  {
	                            	   System.out.println("\n=====================================PLAYING SONG REPEAT========================================");
	                            	   System.out.println("Current Song again\n\n");
	                                    j.previous().showSong();
	                                    forward=false;
	                                   }
	                               if(!forward)
	                                {   System.out.println("Current Song again\n\n");
	                                    j.next().showSong();
	                                    forward=true;
	                                }
	                               System.out.println("__________________________________");
	                            break;
	                           case 4:second=false;
	                          
	                                   break;
	                           default:second=false;
	                                 
	                                   break;
	                               
	                          
	                        }
	                      
	                      
	                              
	                       }
	                          }
	                       break;
	                case 5:first=false;
	                System.out.println("*******THANK YOU !**********\n*****HOPE YOU ENJOYED :)***********");
	                       break;
	                default:first=false;
	                        break;
	                        
	                        
	            }
	          
	        }
	        
	        
	        }
	
	        }