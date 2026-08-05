package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.SimpleMenuProvider.class)
public class SimpleMenuProvider581899520Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1762311690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762311690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu_1164263679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1164263679L))
            info.setReturnValue(null);
    }


}
