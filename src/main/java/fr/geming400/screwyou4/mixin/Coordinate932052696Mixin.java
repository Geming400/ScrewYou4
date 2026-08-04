package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.Spline.Coordinate.class)
public class Coordinate932052696Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1977402341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977402341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__203407279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203407279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_970315438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970315438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/level/levelgen/DensityFunctions$Spline$Point;)F", cancellable = true)
    private void apply_1338021859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1338021859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/lang/Object;)F", cancellable = true)
    private void apply__1977293097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977293097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void function__1883874931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883874931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()F", cancellable = true)
    private void maxValue_970312059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970312059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minValue()F", cancellable = true)
    private void minValue_970312059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970312059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapChildren(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/DensityFunctions$Spline$Coordinate;", cancellable = true)
    private void mapChildren__2038799577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2038799577L))
            info.setReturnValue(null);
    }


}
