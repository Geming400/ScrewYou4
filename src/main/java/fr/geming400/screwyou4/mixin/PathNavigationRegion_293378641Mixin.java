package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.PathNavigationRegion.class)
public class PathNavigationRegion_293378641Mixin {
        @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_331640886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331640886L))
            info.setReturnValue(2110644641);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_331640886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331640886L))
            info.setReturnValue(2110644641);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_291039432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291039432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_1739555413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739555413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder_103878695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103878695L))
            info.setReturnValue(new net.minecraft.world.level.border.WorldBorder());
    }

    @Inject(at = @At("HEAD"), method = "getChunkForCollisions(II)Lnet/minecraft/world/level/BlockGetter;", cancellable = true)
    private void getChunkForCollisions__1096472552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096472552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityCollisions(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Ljava/util/List;", cancellable = true)
    private void getEntityCollisions__110006354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-110006354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_692004586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692004586L))
            info.setReturnValue(null);
    }


}
