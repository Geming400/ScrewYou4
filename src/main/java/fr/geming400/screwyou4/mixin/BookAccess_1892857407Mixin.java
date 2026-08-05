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
            info.setReturnValue("\"YmJ)隭轐囒p,{f8 za4V ]+䧠Nr+N'<繏3d1勝:9(iDH+FLg)?pK5{푫sꝃ㪒X|䉁4GmI0_+뱹S3wҦ!#รPHmjiK7a!q?wkY‿FSQL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1931120148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931120148L))
            info.setReturnValue(1591478559);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages__775773074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-775773074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPage(I)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getPage__1252598280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252598280L))
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
            info.setReturnValue(1770002048);
    }


}
