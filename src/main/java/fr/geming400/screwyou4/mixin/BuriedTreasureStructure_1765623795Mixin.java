package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.BuriedTreasureStructure.class)
public class BuriedTreasureStructure_1765623795Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_620022326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620022326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1764954772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764954772L))
            info.setReturnValue(null);
    }


}
