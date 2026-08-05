package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.GroupSlotSource.class)
public class GroupSlotSource_1503615990Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1724906053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724906053L))
            info.setReturnValue(null);
    }


}
