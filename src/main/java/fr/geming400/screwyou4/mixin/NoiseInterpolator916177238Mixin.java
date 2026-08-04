package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseChunk.NoiseInterpolator.class)
public class NoiseInterpolator916177238Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/DensityFunctions$Marker$Type;", cancellable = true)
    private void type__2048027520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048027520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute_1884208858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884208858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wrapped()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void wrapped__1899750389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899750389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray_1480570444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1480570444L))
            info.cancel();
    }


}
