package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.BossEvent.BossBarOverlay.class)
public class BossBarOverlay1431012871Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_295552400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295552400L))
            info.setReturnValue("\u47A4F:UJbsXEP\u0216pk9QIFn26\uFD00i\u584CuC\u08F2s\uC3AA85IW/?Ya|R3B\uBFFA\u77A4(/!}7/E\uC2A7O");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/BossEvent$BossBarOverlay;", cancellable = true)
    private static void values_1446179348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446179348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/BossEvent$BossBarOverlay;", cancellable = true)
    private static void valueOf__2228783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2228783L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarOverlay.PROGRESS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_295552400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295552400L))
            info.setReturnValue("\u47A4F:UJbsXEP\u0216pk9QIFn26\uFD00i\u584CuC\u08F2s\uC3AA85IW/?Ya|R3B\uBFFA\u77A4(/!}7/E\uC2A7O");
    }


}
