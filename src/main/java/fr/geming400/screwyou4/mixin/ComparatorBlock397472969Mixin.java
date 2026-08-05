package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ComparatorBlock.class)
public class ComparatorBlock397472969Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2133326693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133326693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__1188004686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188004686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/ScheduledTickAccess;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void updateShape_1938536386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938536386L))
            info.setReturnValue(null);
    }


}
