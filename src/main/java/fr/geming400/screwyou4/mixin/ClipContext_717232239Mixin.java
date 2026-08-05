package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipContext.class)
public class ClipContext_717232239Mixin {
        @Inject(at = @At("HEAD"), method = "getFrom()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFrom_1814961767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814961767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTo()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTo_1814961767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1814961767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidShape(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getFluidShape_1639062067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1639062067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getBlockShape__998314776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998314776L))
            info.setReturnValue(null);
    }


}
