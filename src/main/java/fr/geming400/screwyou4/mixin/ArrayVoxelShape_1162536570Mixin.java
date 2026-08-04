package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.ArrayVoxelShape.class)
public class ArrayVoxelShape_1162536570Mixin {
        @Inject(at = @At("HEAD"), method = "getCoords(Lnet/minecraft/core/Direction$Axis;)Lit/unimi/dsi/fastutil/doubles/DoubleList;", cancellable = true)
    private void getCoords_325393793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325393793L))
            info.setReturnValue(null);
    }


}
