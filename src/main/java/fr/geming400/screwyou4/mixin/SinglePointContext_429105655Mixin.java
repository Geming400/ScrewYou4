package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunction.SinglePointContext.class)
public class SinglePointContext_429105655Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1814617913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814617913L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__706354321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706354321L))
            info.setReturnValue("x[s");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_467368396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467368396L))
            info.setReturnValue(-1881003267);
    }

    @Inject(at = @At("HEAD"), method = "blockY()I", cancellable = true)
    private void blockY_467367900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467367900L))
            info.setReturnValue(1041179954);
    }

    @Inject(at = @At("HEAD"), method = "blockX()I", cancellable = true)
    private void blockX_467367900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467367900L))
            info.setReturnValue(1041179954);
    }

    @Inject(at = @At("HEAD"), method = "blockZ()I", cancellable = true)
    private void blockZ_467367900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467367900L))
            info.setReturnValue(1041179954);
    }


}
