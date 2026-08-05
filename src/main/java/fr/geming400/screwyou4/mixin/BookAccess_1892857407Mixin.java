package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.BookViewScreen.BookAccess.class)
public class BookAccess_1892857407Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1016597631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016597631L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_757397431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757397431L))
            info.setReturnValue("\"YmJ)\u96AD\u8F50\u56D2p,{f8 za4V ]+\u49E0Nr+N'<\u7E4F3d1\u52DD:9(iDH+FLg)?pK5{\uD46Bs\uA743\u3A92X|\u42414GmI0_+\uBC79S3w\u04A6!#\u0E23PHmjiK7a!q?wkY\u203FFSQL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1931120148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931120148L))
            info.setReturnValue(1121701959);
    }

    @Inject(at = @At("HEAD"), method = "getPage(I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPage__1252598280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252598280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages__775773074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775773074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/client/gui/screens/inventory/BookViewScreen$BookAccess;", cancellable = true)
    private static void fromItem_1100825543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100825543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPageCount()I", cancellable = true)
    private void getPageCount_1931119652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931119652L))
            info.setReturnValue(1300225448);
    }


}
