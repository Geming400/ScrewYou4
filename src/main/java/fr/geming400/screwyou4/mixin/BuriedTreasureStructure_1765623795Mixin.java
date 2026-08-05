package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.BuriedTreasureStructure.class)
public class BuriedTreasureStructure_1765623795Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_110397808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110397808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint__155130061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155130061L))
            info.setReturnValue(null);
    }


}
