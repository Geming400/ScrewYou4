package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.RuinedPortalStructure.class)
public class RuinedPortalStructure1490401298Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_344799830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(344799830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findGenerationPoint(Lnet/minecraft/world/level/levelgen/structure/Structure$GenerationContext;)Ljava/util/Optional;", cancellable = true)
    private void findGenerationPoint_1489732276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1489732276L))
            info.setReturnValue(null);
    }


}
