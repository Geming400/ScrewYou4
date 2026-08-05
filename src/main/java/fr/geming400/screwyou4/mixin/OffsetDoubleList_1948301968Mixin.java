package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.OffsetDoubleList.class)
public class OffsetDoubleList_1948301968Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_1986564213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986564213L))
            info.setReturnValue(-827845357);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble__1132765655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132765655L))
            info.setReturnValue(8.028581000045948E8D);
    }


}
