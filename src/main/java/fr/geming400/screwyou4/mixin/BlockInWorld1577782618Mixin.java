package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockInWorld.class)
public class BlockInWorld1577782618Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_583951843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583951843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/LevelReader;", cancellable = true)
    private void getLevel_1101705637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101705637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getEntity_1187344895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187344895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_2067348349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067348349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasState(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void hasState_895085064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895085064L))
            info.setReturnValue(null);
    }


}
