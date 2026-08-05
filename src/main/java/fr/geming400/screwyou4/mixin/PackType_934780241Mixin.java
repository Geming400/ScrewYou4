package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.PackType.class)
public class PackType_934780241Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/PackType;", cancellable = true)
    private static void values__1380194349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380194349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/PackType;", cancellable = true)
    private static void valueOf_1506427766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506427766L))
            info.setReturnValue(net.minecraft.server.packs.PackType.CLIENT_RESOURCES);
    }

    @Inject(at = @At("HEAD"), method = "getDirectory()Ljava/lang/String;", cancellable = true)
    private void getDirectory__200680231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200680231L))
            info.setReturnValue("_\u890Dcmr\u2B50Al\u367Fy[TO|&h ;n^\u78D8 uw\u4D0FXzw4kfg+B^Wir-\u9E96R0N'kzfTH6Q73.3qAW\u57B2Dn/i7[pRb\u3F96\u4104\u0F75UL>uw<VS\uFF3B3_]owX");
    }


}
