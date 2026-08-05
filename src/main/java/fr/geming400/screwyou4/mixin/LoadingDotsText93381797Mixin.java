package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LoadingDotsText.class)
public class LoadingDotsText93381797Mixin {
        @Inject(at = @At("HEAD"), method = "get(J)Ljava/lang/String;", cancellable = true)
    private static void get_1301901398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301901398L))
            info.setReturnValue(",v=C'dj\u9D1BE9&\"A*S /[.F$v\u2B5B/}Z!KM(\u6006>FEqj\u7051n*:RA:.?\uA242>LX\u1EB5,;Z\uC46Fjn]\u4417)75\u524D$bD1O`-\"G+huy}\u3BEB=xz\u7273$\uC2FD_{|R]E)N#A,");
    }


}
