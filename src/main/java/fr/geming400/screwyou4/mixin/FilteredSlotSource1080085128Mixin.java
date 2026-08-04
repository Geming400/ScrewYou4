package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.FilteredSlotSource.class)
public class FilteredSlotSource1080085128Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1479028444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479028444L))
            info.setReturnValue(null);
    }


}
