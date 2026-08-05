package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PackType.class)
public class PackType_934780241Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/PackType;", cancellable = true)
    private static void values__1577190795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1577190795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/PackType;", cancellable = true)
    private static void valueOf__818534578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818534578L))
            info.setReturnValue(net.minecraft.server.packs.PackType.SERVER_DATA);
    }

    @Inject(at = @At("HEAD"), method = "getDirectory()Ljava/lang/String;", cancellable = true)
    private void getDirectory__1067009712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067009712L))
            info.setReturnValue("\u4650\u646C9\u2DAB.\uA429]\u9A7F\uC614iq\u1970k*!UDmdA '[_GBvb[7eIiw=v G\u8E3F%%hBZr)4nnAiegq\u8CBBY1}`|7F.et51,_'D2Y?-R@B5\uB4FFknW;G?m>+P/");
    }


}
