package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ResourceLoadStateTracker.ReloadReason.class)
public class ReloadReason1902096208Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/ResourceLoadStateTracker$ReloadReason;", cancellable = true)
    private static void values_1227641721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1227641721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/ResourceLoadStateTracker$ReloadReason;", cancellable = true)
    private static void valueOf__265973642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265973642L))
            info.setReturnValue(net.minecraft.client.ResourceLoadStateTracker.ReloadReason.MANUAL);
    }


}
