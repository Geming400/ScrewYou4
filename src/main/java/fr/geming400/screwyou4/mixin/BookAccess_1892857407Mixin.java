package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookViewScreen.BookAccess.class)
public class BookAccess_1892857407Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_984231138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984231138L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1631686365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631686365L))
            info.setReturnValue("oywC</@\u5830B\uA1ACa}_Zn6ZRtk)}kA*w5-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1844757799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844757799L))
            info.setReturnValue(691996822);
    }

    @Inject(at = @At("HEAD"), method = "getPage(I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPage_203440595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203440595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages__1192687054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192687054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/client/gui/screens/inventory/BookViewScreen$BookAccess;", cancellable = true)
    private static void fromItem_763511524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763511524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPageCount()I", cancellable = true)
    private void getPageCount__1665011366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1665011366L))
            info.setReturnValue(1756705894);
    }


}
