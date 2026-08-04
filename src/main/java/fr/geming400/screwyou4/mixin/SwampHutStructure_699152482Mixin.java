package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.SwampHutStructure.class)
public class SwampHutStructure_699152482Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__446448987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446448987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_698483459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698483459L))
            info.setReturnValue(null);
    }


}
