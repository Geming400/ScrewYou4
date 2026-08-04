package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.ContentsSlotSource.class)
public class ContentsSlotSource_1294213365Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1264900208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1264900208L))
            info.setReturnValue(null);
    }


}
