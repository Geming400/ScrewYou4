package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.ClipContext.class)
public class ClipContext_717232239Mixin {
        @Inject(at = @At("HEAD"), method = "getFrom()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFrom__1402623417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402623417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTo()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getTo__1165663146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165663146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidShape(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getFluidShape_1896206118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896206118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getBlockShape_857004146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857004146L))
            info.setReturnValue(null);
    }


}
