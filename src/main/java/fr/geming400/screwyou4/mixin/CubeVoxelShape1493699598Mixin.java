package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.CubeVoxelShape.class)
public class CubeVoxelShape1493699598Mixin {
        @Inject(at = @At("HEAD"), method = "getCoords(Lnet/minecraft/core/Direction$Axis;)Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getCoords_2113283714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113283714L))
            info.setReturnValue(null);
    }


}
