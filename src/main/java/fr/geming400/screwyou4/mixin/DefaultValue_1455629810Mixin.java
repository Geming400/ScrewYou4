package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.DeltaTracker.DefaultValue.class)
public class DefaultValue_1455629810Mixin {
        @Inject(at = @At("HEAD"), method = "getGameTimeDeltaPartialTick(Z)F", cancellable = true)
    private void getGameTimeDeltaPartialTick__905018951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905018951L))
            info.setReturnValue(3.259434E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRealtimeDeltaTicks()F", cancellable = true)
    private void getRealtimeDeltaTicks_1912014997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912014997L))
            info.setReturnValue(3.259434E8F);
    }

    @Inject(at = @At("HEAD"), method = "getGameTimeDeltaTicks()F", cancellable = true)
    private void getGameTimeDeltaTicks__1271859807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271859807L))
            info.setReturnValue(3.259434E8F);
    }


}
