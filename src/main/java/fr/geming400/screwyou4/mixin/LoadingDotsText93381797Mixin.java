package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.LoadingDotsText.class)
public class LoadingDotsText93381797Mixin {
        @Inject(at = @At("HEAD"), method = "get(J)Ljava/lang/String;", cancellable = true)
    private static void get_929423468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929423468L))
            info.setReturnValue("e\u4BF5/pOs+\u9CAAJ=\u8895_xv$E)[`86\u34E5:!'C(r$x6N^}.YlnIB]]D?\uC67Dkg9Rot9B\u31FD\"UVkpRC\"Q^*T,\u4036vZ\u22C2/Y)YA\uD5BC][1-_@f\u59EFz\u7404\u479A");
    }


}
