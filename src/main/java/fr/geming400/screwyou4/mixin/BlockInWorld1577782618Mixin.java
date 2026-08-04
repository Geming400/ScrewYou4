package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockInWorld.class)
public class BlockInWorld1577782618Mixin {
        @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState__717976248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-717976248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/LevelReader;", cancellable = true)
    private void getLevel__1228158925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228158925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getEntity_2136918566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136918566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__315604261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315604261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasState(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;", cancellable = true)
    private static void hasState_2029670385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029670385L))
            info.setReturnValue(null);
    }


}
