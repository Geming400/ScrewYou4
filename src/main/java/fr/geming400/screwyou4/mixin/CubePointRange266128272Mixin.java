package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.CubePointRange.class)
public class CubePointRange266128272Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_709859861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(709859861L))
            info.setReturnValue(1351401243);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble_1666161841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666161841L))
            info.setReturnValue(9.600955001576945E8D);
    }


}
