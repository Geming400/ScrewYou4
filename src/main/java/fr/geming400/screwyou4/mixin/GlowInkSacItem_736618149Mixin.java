package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.GlowInkSacItem.class)
public class GlowInkSacItem_736618149Mixin {
        @Inject(at = @At("HEAD"), method = "tryApplyToSign(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void tryApplyToSign_52324748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(52324748L))
            info.setReturnValue(false);
    }


}
