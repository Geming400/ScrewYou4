package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugEntityBlockIntersection.class)
public class DebugEntityBlockIntersection2046256780Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/debug/DebugEntityBlockIntersection;", cancellable = true)
    private static void values__1202511878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1202511878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/debug/DebugEntityBlockIntersection;", cancellable = true)
    private static void valueOf_1092417757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1092417757L))
            info.setReturnValue(net.minecraft.util.debug.DebugEntityBlockIntersection.IN_BLOCK);
    }

    @Inject(at = @At("HEAD"), method = "color()I", cancellable = true)
    private void color_2084519026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2084519026L))
            info.setReturnValue(988422051);
    }


}
