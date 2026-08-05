package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Beardifier.class)
public class Beardifier_1858096369Mixin {
        @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute__1468839308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468839308L))
            info.setReturnValue(1.3807780019978783E8D);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1896353809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896353809L))
            info.setReturnValue(1.3807780063944033E8D);
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue_1896353809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896353809L))
            info.setReturnValue(1.3807780063944033E8D);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray__1872477722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1872477722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forStructuresInChunk(Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/world/level/levelgen/Beardifier;", cancellable = true)
    private static void forStructuresInChunk_1421323553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1421323553L))
            info.setReturnValue(null);
    }


}
