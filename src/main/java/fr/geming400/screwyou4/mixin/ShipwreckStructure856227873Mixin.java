package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.ShipwreckStructure.class)
public class ShipwreckStructure856227873Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__798998113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798998113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint__1064525982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064525982L))
            info.setReturnValue(null);
    }


}
