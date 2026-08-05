package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.JungleTempleStructure.class)
public class JungleTempleStructure_1995587365Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/structure/StructureType;", cancellable = true)
    private void type_340361378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340361378L))
            info.setReturnValue(null);
    }


}
