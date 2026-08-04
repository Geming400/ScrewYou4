package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.LimitSlotSource.class)
public class LimitSlotSource_1149173946Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1409939627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409939627L))
            info.setReturnValue(null);
    }


}
