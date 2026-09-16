package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.EmptyBlockGetter.class)
public class EmptyBlockGetter_808322499Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/EmptyBlockGetter;", cancellable = true)
    private static void values_1855458040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855458040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/EmptyBlockGetter;", cancellable = true)
    private static void valueOf_871720959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871720959L))
            info.setReturnValue(net.minecraft.world.level.EmptyBlockGetter.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getMinY()I", cancellable = true)
    private void getMinY_1093582091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093582091L))
            info.setReturnValue(-1109414106);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1946762206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946762206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__360248156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360248156L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity__1950872864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950872864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__917294677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-917294677L))
            info.setReturnValue(976120914);
    }


}
