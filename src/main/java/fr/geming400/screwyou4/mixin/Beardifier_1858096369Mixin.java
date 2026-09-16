package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Beardifier.class)
public class Beardifier_1858096369Mixin {
        @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute__1505081315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505081315L))
            info.setReturnValue(5.852348001998452E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue__1618947644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618947644L))
            info.setReturnValue(5.852348000729057E8D);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray__1866231408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1866231408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue_203358514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203358514L))
            info.setReturnValue(5.852348007435704E8D);
    }

    @Inject(at = @At("HEAD"), method = "forStructuresInChunk(Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/world/level/levelgen/Beardifier;", cancellable = true)
    private static void forStructuresInChunk__954078270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954078270L))
            info.setReturnValue(null);
    }


}
