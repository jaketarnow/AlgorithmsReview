#include <stdio.h>
#include <string.h>

int main(void)
{
  int blanks, tabs, newlines;
  int c;


  blanks = 0;
  tabs = 0;
  newlines = 0;

  do {
      c = getchar();
      if(c == ' ') {
          ++blanks;
      }
      else if(c == '\t') {
         ++tabs;
      }
      else if(c == '\n') {
         ++newlines;
      }
  }
  while(c != EOF);

  printf("Blanks: %d\nTabs: %d\nLines: %d\n", blanks, tabs, newlines);
  return 0;
}