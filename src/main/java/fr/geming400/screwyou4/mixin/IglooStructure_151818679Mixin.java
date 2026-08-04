package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.IglooStructure.class)
public class IglooStructure_151818679Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type__993782790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993782790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_151149656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151149656L))
            info.setReturnValue(null);
    }


}
