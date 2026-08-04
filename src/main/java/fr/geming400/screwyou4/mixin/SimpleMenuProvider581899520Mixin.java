package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.SimpleMenuProvider.class)
public class SimpleMenuProvider581899520Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1595009645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1595009645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu__1403471846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1403471846L))
            info.setReturnValue(null);
    }


}
