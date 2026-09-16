package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.EmptyFluid.class)
public class EmptyFluid_147698003Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__1069478580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069478580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getHeight_517795343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517795343L))
            info.setReturnValue(6.506116E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTickDelay(Lnet/minecraft/world/level/LevelReader;)I", cancellable = true)
    private void getTickDelay__984382380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-984382380L))
            info.setReturnValue(1340885208);
    }

    @Inject(at = @At("HEAD"), method = "getFlow(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/FluidState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlow__1989520614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989520614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount_2117373130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117373130L))
            info.setReturnValue(1089575803);
    }

    @Inject(at = @At("HEAD"), method = "getBucket()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void getBucket_208127224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208127224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource__642226766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642226766L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplacedWith(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canBeReplacedWith_1527430924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527430924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOwnHeight(Lnet/minecraft/world/level/material/FluidState;)F", cancellable = true)
    private void getOwnHeight__277541552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277541552L))
            info.setReturnValue(6.516113E8F);
    }


}
