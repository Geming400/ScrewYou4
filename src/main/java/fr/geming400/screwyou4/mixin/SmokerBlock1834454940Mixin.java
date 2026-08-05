package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SmokerBlock.class)
public class SmokerBlock1834454940Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__724658632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724658632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_248977285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248977285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__119012403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119012403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1711852859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1711852859L))
            info.cancel();
    }


}
