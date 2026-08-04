package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.MineshaftStructure.class)
public class MineshaftStructure1928092560Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_782491092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782491092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1927423538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927423538L))
            info.setReturnValue(null);
    }


}
