package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.EndCityStructure.class)
public class EndCityStructure1272341905Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__382884081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382884081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint__648411950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648411950L))
            info.setReturnValue(null);
    }


}
