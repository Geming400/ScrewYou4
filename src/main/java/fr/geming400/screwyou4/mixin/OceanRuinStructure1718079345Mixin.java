package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.OceanRuinStructure.class)
public class OceanRuinStructure1718079345Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_572477877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572477877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1717410323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717410323L))
            info.setReturnValue(null);
    }


}
