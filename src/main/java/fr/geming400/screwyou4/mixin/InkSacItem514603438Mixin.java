package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.InkSacItem.class)
public class InkSacItem514603438Mixin {
        @Inject(at = @At("HEAD"), method = "tryApplyToSign(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZLnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void tryApplyToSign__169689962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169689962L))
            info.setReturnValue(null);
    }


}
