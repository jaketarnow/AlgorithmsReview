#import <Foundation/Foundation.h>
#import <CoreWLAN/CoreWLAN.h>

int main() {
    NSAutoreleasePool *pool = [NSAutoreleasePool new];

    CWInterface *wif = [CWInterface interface];

    NSLog(@"BSD if name: %@", wif.name);
    NSLog(@"SSID: %@", wif.ssid);

    [pool drain];
    return 0;
}