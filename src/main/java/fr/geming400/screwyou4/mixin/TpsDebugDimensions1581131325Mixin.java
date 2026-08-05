package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debugchart.TpsDebugDimensions.class)
public class TpsDebugDimensions1581131325Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/debugchart/TpsDebugDimensions;", cancellable = true)
    private static void values_141220646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141220646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/debugchart/TpsDebugDimensions;", cancellable = true)
    private static void valueOf__1445325075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1445325075L))
            info.setReturnValue(net.minecraft.util.debugchart.TpsDebugDimensions.TICK_SERVER_METHOD);
    }


}
