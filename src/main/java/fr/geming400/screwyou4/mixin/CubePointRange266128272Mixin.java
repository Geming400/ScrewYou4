package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.CubePointRange.class)
public class CubePointRange266128272Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_304390518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304390518L))
            info.setReturnValue(1155001464);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble_1480027946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480027946L))
            info.setReturnValue(8.484179003567624E8D);
    }


}
