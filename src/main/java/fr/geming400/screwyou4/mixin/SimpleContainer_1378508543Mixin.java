package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.SimpleContainer.class)
public class SimpleContainer_1378508543Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2146035725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146035725L))
            info.setReturnValue("D^\u2EC72pP'oOM=SW^*MgPw0XyW\"=/Cf!&QHs\"X)<EH]G\"\u747C\u2939\u2328y|k\u165AV&d[Y2\uC3B6Tv=F)\u9706{\uC364nIQJpx+\u5465vQ");
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1857342382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857342382L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removeAllItems()Ljava/util/List;", cancellable = true)
    private void removeAllItems_1838874865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838874865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem_614181113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614181113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1292094112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292094112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__677256200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677256200L))
            info.setReturnValue(841533523);
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate_1185418344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185418344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__655402628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-655402628L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void addItem_1885626417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885626417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "storeAsItemList(Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;)V", cancellable = true)
    private void storeAsItemList_1559326757(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1559326757L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromItemList(Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;)V", cancellable = true)
    private void fromItemList__1736064982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1736064982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItemType(Lnet/minecraft/world/item/Item;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemType__48727693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-48727693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_613356485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(613356485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents__1349504123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1349504123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_1294970916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1294970916L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canAddItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canAddItem_1031719414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031719414L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged__57138945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57138945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_1801842240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801842240L))
            info.setReturnValue(null);
    }


}
