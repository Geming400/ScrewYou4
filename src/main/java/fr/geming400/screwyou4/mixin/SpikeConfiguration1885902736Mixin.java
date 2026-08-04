package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SpikeConfiguration.class)
public class SpikeConfiguration1885902736Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1023552301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023552301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_750442761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750442761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1924165478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924165478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__409856130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-409856130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReplace()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canReplace_1918671325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918671325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOn()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceOn_1918671325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1918671325L))
            info.setReturnValue(null);
    }


}
