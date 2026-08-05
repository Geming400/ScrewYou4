package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.NetherFortressStructure.class)
public class NetherFortressStructure_309107857Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__1346118130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346118130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint__1611645999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611645999L))
            info.setReturnValue(null);
    }


}
