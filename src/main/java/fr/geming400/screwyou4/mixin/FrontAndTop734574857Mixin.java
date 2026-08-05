package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.FrontAndTop.class)
public class FrontAndTop734574857Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/FrontAndTop;", cancellable = true)
    private static void values_1283137947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283137947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/FrontAndTop;", cancellable = true)
    private static void valueOf_1332646178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332646178L))
            info.setReturnValue(net.minecraft.core.FrontAndTop.DOWN_EAST);
    }

    @Inject(at = @At("HEAD"), method = "top()Lnet/minecraft/core/Direction;", cancellable = true)
    private void top_1285137833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285137833L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "front()Lnet/minecraft/core/Direction;", cancellable = true)
    private void front_2124582269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124582269L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_822783479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822783479L))
            info.setReturnValue("ga\uA18Cfe;Hi5^Ho]4@?/DKf\uC7A3vE\"QW:iR}nt9j1_[*X%g\u984B");
    }

    @Inject(at = @At("HEAD"), method = "fromFrontAndTop(Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Lnet/minecraft/core/FrontAndTop;", cancellable = true)
    private static void fromFrontAndTop_711846057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711846057L))
            info.setReturnValue(net.minecraft.core.FrontAndTop.SOUTH_UP);
    }


}
