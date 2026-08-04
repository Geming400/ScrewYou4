package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.PlayerHeadItem.class)
public class PlayerHeadItem_1412800512Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_1258664333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258664333L))
            info.setReturnValue(null);
    }


}
