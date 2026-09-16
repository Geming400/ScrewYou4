package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.vault.VaultSharedData.class)
public class VaultSharedData1215782675Mixin {
        @Inject(at = @At("HEAD"), method = "setDisplayItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setDisplayItem_1532320792(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1532320792L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDisplayItem()Z", cancellable = true)
    private void hasDisplayItem_938480047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938480047L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getDisplayItem__1207349770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207349770L))
            info.setReturnValue(null);
    }


}
