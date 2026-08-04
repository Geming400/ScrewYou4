package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.StrongholdStructure.class)
public class StrongholdStructure_1772034385Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_626432916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(626432916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1771365362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771365362L))
            info.setReturnValue(null);
    }


}
