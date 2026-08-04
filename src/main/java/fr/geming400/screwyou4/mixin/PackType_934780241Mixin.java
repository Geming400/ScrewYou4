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
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDirectory()Ljava/lang/String;", cancellable = true)
    private void getDirectory__200680231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-200680231L))
            info.setReturnValue(null);
    }


}
