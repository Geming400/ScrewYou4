package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.PathNavigationRegion.class)
public class PathNavigationRegion_293378641Mixin {
        @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_1829150574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829150574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__875192014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875192014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunkForCollisions(II)Lnet/minecraft/world/level/BlockGetter;", cancellable = true)
    private void getChunkForCollisions__2085886651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085886651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldBorder()Lnet/minecraft/world/level/border/WorldBorder;", cancellable = true)
    private void getWorldBorder__524893361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524893361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityCollisions(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/AABB;)Ljava/util/List;", cancellable = true)
    private void getEntityCollisions__430137496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430137496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__1432238535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432238535L))
            info.setReturnValue(-1065494138);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_578638233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578638233L))
            info.setReturnValue(850200180);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_1833261232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833261232L))
            info.setReturnValue(null);
    }


}
