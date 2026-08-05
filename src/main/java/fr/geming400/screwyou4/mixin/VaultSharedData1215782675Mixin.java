package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultSharedData.class)
public class VaultSharedData1215782675Mixin {
        @Inject(at = @At("HEAD"), method = "setDisplayItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setDisplayItem__1344653333(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1344653333L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDisplayItem()Z", cancellable = true)
    private void hasDisplayItem_1254061258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254061258L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDisplayItem_1739201335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739201335L))
            info.setReturnValue(null);
    }


}
