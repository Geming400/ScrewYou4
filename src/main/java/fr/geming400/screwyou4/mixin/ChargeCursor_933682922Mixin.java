package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkSpreader.ChargeCursor.class)
public class ChargeCursor_933682922Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/SculkSpreader;Z)V", cancellable = true)
    private void update_1094634409(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1094634409L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFacingData()Ljava/util/Set;", cancellable = true)
    private void getFacingData__895352565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895352565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__959703958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-959703958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDecayDelay()I", cancellable = true)
    private void getDecayDelay_971945167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971945167L))
            info.setReturnValue(300703274);
    }

    @Inject(at = @At("HEAD"), method = "getCharge()I", cancellable = true)
    private void getCharge_971945167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971945167L))
            info.setReturnValue(300703274);
    }


}
