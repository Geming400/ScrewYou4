package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.NoiseChunk.NoiseInterpolator.class)
public class NoiseInterpolator916177238Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/DensityFunctions$Marker$Type;", cancellable = true)
    private void type_541477254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541477254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute_1847966851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847966851L))
            info.setReturnValue(6.466988004858611E8D);
    }

    @Inject(at = @At("HEAD"), method = "wrapped()Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void wrapped__1452651120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452651120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray_1486816758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1486816758L))
            info.cancel();
    }


}
