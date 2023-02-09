# Introduction to stanthebear/mynewapp

TODO: write [great documentation](http://jacobian.org/writing/what-to-write/)

- Type some Markdown on the left
- See HTML in the right

## _The Last Markdown Editor, Ever_

Try to **format**\
help^test^

👍

## Heading 1

## Heading 2 text

test the

Hello world!
Growsub~subtext~ \

>quote\
The last few block of a \
Quote block of text :abacus

==This is highlighted== [Google](https://www.google.com) \
Link to  \

We will output Markdown to:

- HTML
- docx
- PDF

>This is a blockquote\
of several lines\
test end
>
>## This is an H2 in the blockquote

New paragraph

Some of *these words* are emphasised. We can use many asterisks for extra string
**emphasis**. Or, if your prefer, use __two underscores__ instead.

## Lists

Unordered bulleted lists use asterisks, pluses, or hyphens as markers. These are
interchangeable;
this:

* Sweets.
* Chewing gum.
* Drinks.

this:

+ Sweets.
+ Chewing gum.
+ Drinks.

this as well:

- Sweets.
- Gum.
- Drinks.

Ordered (numbered) lists use regular numbers, followed by periods, as list markers:

1. Red
2. Green
3. Blue

If you put blank lines between items, you’ll get <p> tags for the list item text. You can create multi-paragraph list items by indenting the paragraphs by 4 spaces or 1 tab:

- A list item.

  With many paragraphs??

- A second item.

  With multiple paragraphs.

- Another item in the list.

  extra para here.

- item new...

Ckear of list.

>block quote starts\
this level.

New paragraph for now.

Optionally, you may include a title attribute in the parentheses:

This is an [example link](http://example.com/ "With a Title").

Reference-style links allow you to refer to your links by names, which you define elsewhere in your document:

I get 10 times more traffic from [Google][1] than from
[Yahoo][2] or [MSN][3].

[1]: http://google.com/        "Google"
[2]: http://search.yahoo.com/  "Yahoo Search"
[3]: http://search.msn.com/    "MSN Search"

CODE

In a regular paragraph, you can create code span by wrapping text in backtick quotes. Any ampersands (&) and angle brackets (< or >) will automatically be translated into HTML entities. This makes it easy to use Markdown to write about HTML example code:

I strongly recommend against using any `<blink>` tags.

I wish SmartyPants used named entities like `&mdash;`
instead of decimal-encoded entites like `&#8212;`.

To specify an entire block of pre-formatted code, indent every line of the block by 4 spaces or 1 tab. Just like with code spans, &, <, and > characters will be escaped automatically.

Markdown:

If you want your page to validate under XHTML 1.0 Strict,
you've got to put paragraph tags in your blockquotes:

    <blockquote>
        <p>For example.</p>
    </blockquote>

This is a regular paragraph.

<table>
    <tr>
        <td>Foo</td>
    </tr>
</table>

This is another regular paragraph.
This is a normal paragraph:

    This is a code block.

> ## This is a header
>
> 1. This is the first list item.
> 2. This is the second list item.
>  Here's some example code:
>
>
      return shell_exec("echo $input | $markdown_script");
>blockquote continues
