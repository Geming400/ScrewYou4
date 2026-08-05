package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.BlockBlobConfiguration.class)
public class BlockBlobConfiguration490905036Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1876417295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876417295L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__644554939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644554939L))
            info.setReturnValue("Zb섪浴e(孢>h,{]VT塨EcqX3OQ-F_E-gA]/gh");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_529167778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529167778L))
            info.setReturnValue(-2105052992);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__1804853830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804853830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceOn()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void canPlaceOn_523673625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523673625L))
            info.setReturnValue(null);
    }


}
