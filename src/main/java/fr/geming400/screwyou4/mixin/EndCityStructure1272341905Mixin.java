package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.EndCityStructure.class)
public class EndCityStructure1272341905Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_126740437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(126740437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1271672883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271672883L))
            info.setReturnValue(null);
    }


}
