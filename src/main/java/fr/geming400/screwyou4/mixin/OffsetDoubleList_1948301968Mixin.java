package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.OffsetDoubleList.class)
public class OffsetDoubleList_1948301968Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size__1902933740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1902933740L))
            info.setReturnValue(-793126535);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble__946631760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946631760L))
            info.setReturnValue(1.5626330084553942E8D);
    }


}
