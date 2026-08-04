package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.SliceShape.class)
public class SliceShape_1974918947Mixin {
        @Inject(at = @At("HEAD"), method = "getCoords(Lnet/minecraft/core/Direction$Axis;)Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getCoords_1137776170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1137776170L))
            info.setReturnValue(null);
    }


}
