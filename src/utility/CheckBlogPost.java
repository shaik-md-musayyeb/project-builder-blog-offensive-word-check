package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String offenceWords[]={"b17ch","b1tch","babeland","anus","apeshit","ar5e","areola", "a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","	alaskan pipeline","anal","anal impaler","anal leakage","analprobe",
		      "anilingus"," aryan","ass", "ass fuck", " ass fuck"," ass hole","areole","arian", "arrse", "arse"," arsehole"};
	public boolean checkBlog(Blog blog){
		if(checkBlogTitle(blog) && checkBlogDescription(blog))
			return true;
		else
			return false;
		
	}
		
		public boolean checkBlogTitle(Blog blog) {
			String blogTitle= blog.getBlogTitle();
			blogTitle=blogTitle.toLowerCase();
			String words[] = blogTitle.split(" ") ;
			for(int i=0;i<offenceWords.length;i++) {
				for(int j=0;j<words.length;j++) {
					if(words[j] == offenceWords[i])
						return false;
				}
			}
			
			return false;
		}
	
		public boolean checkBlogDescription(Blog blog) {
			String description= blog.getBlogDescription();
			description=description.toLowerCase();
			String words[] = description.split(" ") ;
			for(int i=0;i<offenceWords.length;i++) {
				for (String word : words) {
					if(word == offenceWords[i])
						return false;
				}
			}
			return false;
			
		}
	
}