package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugEntityBlockIntersection.class)
public class DebugEntityBlockIntersection2046256780Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/debug/DebugEntityBlockIntersection;", cancellable = true)
    private static void values_13012508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(13012508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/debug/DebugEntityBlockIntersection;", cancellable = true)
    private static void valueOf__298281291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298281291L))
            info.setReturnValue(net.minecraft.util.debug.DebugEntityBlockIntersection.IN_FLUID);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color__1012059409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012059409L))
            info.setReturnValue(-317125084);
    }


}
