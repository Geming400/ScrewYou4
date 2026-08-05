package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.HolderHolder.class)
public class HolderHolder_316430157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1701942415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701942415L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__819029819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819029819L))
            info.setReturnValue("g-_%>/S% uP1灇lg|f;I:F堣a9_/暆ꬡ7Gf@/YxYꛙ)^E籨>a_TY$塿ODe\"Th$;7X`D&o_0G");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_354692898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354692898L))
            info.setReturnValue(1154109050);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute_1284461776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284461776L))
            info.setReturnValue(5.875339009159939E8D);
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/core/Holder;", cancellable = true)
    private void function_1865305928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865305928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_354687597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354687597L))
            info.setReturnValue(5.87533900294413E8D);
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue_354687597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354687597L))
            info.setReturnValue(5.87533900294413E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private void codec__1225855452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1225855452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapChildren(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void mapChildren__1807335307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807335307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray_880823362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880823362L))
            info.cancel();
    }


}
