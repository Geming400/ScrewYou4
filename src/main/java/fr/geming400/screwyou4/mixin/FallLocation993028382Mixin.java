package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.FallLocation.class)
public class FallLocation993028382Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_84402114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(84402114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1763451907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763451907L))
            info.setReturnValue("|Q\u51F9@3vsBrCY\u3D3EhZ[@.;5GS9WsC(d2QH}i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1550380473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550380473L))
            info.setReturnValue(955476133);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_1334189954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1334189954L))
            info.setReturnValue("/L4\u4DAE\u54CA3&DR]S\uA2DEVFM}\u659A+k8f}\uD0CF32D\uBBF7d#");
    }

    @Inject(at = @At("HEAD"), method = "languageKey()Ljava/lang/String;", cancellable = true)
    private void languageKey_227894606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227894606L))
            info.setReturnValue("\u7847)\uCD4C+9=|<+68* 8+\uC7418|Szk;\u96040-s\uCAF0Y\u75B7j0h6 qEhhZg\" %*$'GvoFmt3L\u6AF6<");
    }

    @Inject(at = @At("HEAD"), method = "getCurrentFallLocation(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/damagesource/FallLocation;", cancellable = true)
    private static void getCurrentFallLocation_1070551257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070551257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockToFallLocation(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/damagesource/FallLocation;", cancellable = true)
    private static void blockToFallLocation_934497037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934497037L))
            info.setReturnValue(null);
    }


}
