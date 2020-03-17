STOPDecrypter Readme
**This program requires .NET Framework 4.5.2 or higher in order to run**

BEFORE USING THIS TOOL PLEASE READ THE SUPPORT TOPIC AND FAQ ON BLEEPINGCOMPUTER.

Support Topic: https://www.bleepingcomputer.com/forums/t/671473/stop-ransomware-tro-djvu-rumba-openmetxt-support-topic/
FAQ: https://www.bleepingcomputer.com/forums/t/671473/stop-ransomware-tro-djvu-rumba-openmetxt-support-topic/?p=4682102

STOP is classified as three variants currently:
1. UPPERCASE variants (e.g. .DATAWAIT, .KEYPASS)
2. Puma variants (e.g. .puma)
3. Djvu variants (e.g. .djvu, .roland, .verasto)

## UPPERCASE variants
This variant uses UPPERCASE extensions exclusively, and is a very old variant.

Dr. Web Antivirus is able to help some victims with this variant for a reasonable fee. Open a case: https://support.drweb.com/new/free_unlocker/for_decode/

* UPDATE:
This tool can now decrypt the .INFOWAIT variant. See the "Puma variants" section below.

## Puma variants
This variant uses extensions starting with ".puma".

To decrypt this variant family, you will need an encrypted file and its original, over 150KB. Go to Tools -> Puma Bruteforcer, and supply the files.

## Djvu variants
This variant uses a plethora of extensions, with the earliest ones being variations of "djvu" in them. All versions of this variant append 40 characters of the victim's "Personal ID" and the filemarker "{36A698B9-D67C-4E07-BE82-0EC5B14B4DF5}" to the end of files.

If your files were encrypted by this variant with an OFFLINE key, the decrypter will be able to automatically decrypt your files. If it skips files, then they were encrypted by an ONLINE key, which may not be recoverable in 99% of cases at the current time. Record the IDs and MAC addresses given by the decrypter, and provide them in the support topic as requested. Read the FAQ linked above for more information.

Changelog

## [2.1.0.14]
+ Added offline key for .truke, .dalle, .lotep

## [2.1.0.13]
+ Added offline key for .neras

## [2.1.0.12]
+ Added offline key for .horon

## [2.1.0.11]
+ Added offline key for .vesad

## [2.1.0.10]
+ Added offline key for .boston, .muslat, .gerosan

## [2.1.0.9]
+ Added offline key for .heroset
+ Added automatic extraction of ID and MAC on run

## [2.1.0.8]
+ Added offline key for .stone, .lanset, .davda, .poret, .pidon

## [2.1.0.7]
+ Added offline key for .skymap, .mogera, .rezuc

## [2.1.0.6]
+ Added offline key for .ferosas, .rectot
+ Added support for .INFOWAIT variant

## [2.1.0.5]
+ Internal bug fix

## [2.1.0.4]
+ Internal changes
+ Added offline key for .shadow, .fordan, .codnat, .dotmap

## [2.1.0.3]
+ Added offline keys for .roldat, .dutan, .sarut, .berost, .forasom

## [2.1.0.2]
+ Added offline keys for .kiratos, .todarius
+ Condensed MAC addresses for easier archiving

## [2.1.0.1]
+ Added Tools -> Get MAC Addresses

## [2.1.0.0]
+ Added offline keys for .etols, .guvara, .moresa, .verasto, .hrosas
+ Additional warnings and safe-guards for misuse of decrypter
+ Fixed MAC address detection
+ Major under-the-hood changes for future update

## [2.0.2.3]
+ Added offline keys for .grovat, .raldug, .roland

## [2.0.2.2]
+ Fixed About screen bug

## [2.0.2.1]
+ Added offline keys for .drume, .tronas, .trosak, .grovas

## [2.0.1.13]
+ Added offline keys for .kroput1, .charck, .kropun, .doples, .luces, .luceq, .chech, .pulsar1, .proden

## [2.0.1.12]
+ Added offline keys for .kroput

## [2.0.1.11]
+ Added offline keys for .promorad2

## [2.0.1.10]
+ Added offline keys for .promoz, .promock, .promorad, .promok

## [2.0.1.8]
+ Added offline keys for .promos
+ Added restrictions of offline keys must match extension - safeguard after malware started using same ID with different offline keys

## [2.0.1.6]
+ Fixed bug with cleaning up files if decryption failed

## ...
* Lost minor bugfix history

## [2.0.1.0]
+ Added offline keys for .rumba

## [2.0.0.0]
+ Added support for Djvu variants
+ Added offline keys for .djvu, .djvuq, .djvur, .djvut, .djvuu, .pdff, .tfude, .tfudeq, .tro, .udjvu, .tfudet

## [1.0.0.1]
+ Safety checks to avoid corrupted keystreams

## [1.0.0.0]
+ Added support for Puma variants (.puma, .pumas, .pumax)