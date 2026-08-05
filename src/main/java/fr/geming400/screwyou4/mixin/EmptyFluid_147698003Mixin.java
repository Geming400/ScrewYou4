package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.EmptyFluid.class)
public class EmptyFluid_147698003Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape_1069527831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1069527831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getHeight__150233870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150233870L))
            info.setReturnValue(3.387116E8F);
    }

    @Inject(at = @At("HEAD"), method = "getFlow(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/FluidState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlow_1687665782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687665782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmount(Lnet/minecraft/world/level/material/FluidState;)I", cancellable = true)
    private void getAmount_507806844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507806844L))
            info.setReturnValue(-866858583);
    }

    @Inject(at = @At("HEAD"), method = "getTickDelay(Lnet/minecraft/world/level/LevelReader;)I", cancellable = true)
    private void getTickDelay_1184835876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184835876L))
            info.setReturnValue(578531078);
    }

    @Inject(at = @At("HEAD"), method = "isSource(Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void isSource_507823181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507823181L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBucket()Lnet/minecraft/world/item/Item;", cancellable = true)
    private void getBucket__371237416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371237416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwnHeight(Lnet/minecraft/world/level/material/FluidState;)F", cancellable = true)
    private void getOwnHeight_507803961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507803961L))
            info.setReturnValue(3.387116E8F);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplacedWith(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canBeReplacedWith_1195405859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195405859L))
            info.setReturnValue(false);
    }


}
