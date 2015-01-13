This is a migrated copy of the cuelib google code project. As of some time between 2009 and 2010, it appears that cuelib
has become unmaintained. Seeing as I need it in a project, I supposed that I would rehost it here, with the potential
for applying fixes and updates.

I have moved the project from ant to gradle, on one hand, this makes it easy to use in my projects, and on the other hand
this makes it easy to use with modern projects.

------------------------------------------------------------------------------------------------------------------------

Cuelib is a java library for manipulating cue sheets.

You can use cuelib to...

* Create an internal representation of a cue sheet, either from scratch or by parsing an existing one. The parser is designed to be very tolerant for maximum compatibility, but it will raise a warning for any deviation of the spec that it detects, helping you to fix problems.
* Manipulate the internal representation to read specific data, or to make changes.
* Turn the representation back into a cue sheet.
* Convert the representation into XML so you can use your XML tools to process it. You can easily convert it back to a cue sheet with the XSLT we provide.
* Cut up files into track-sized bits and (optionally) post-process these. You can use this functionality to easily create mp3 files (with ID3 tags based on the cue sheet) from wav files. Support for tracks hidden in pregaps is included.
* More features are planned.

Besides the fields originally specified for cue sheets, cuelib also supports the extra fields used by Exact Audio Copy.

Cuelib requires java SE 1.5 or higher, and is released under version 2.1 of the GNU Lesser Public License. You may change the code and you may redistribute it with or without your changes, as long as you comply with the license. You don't need to ask for permission.