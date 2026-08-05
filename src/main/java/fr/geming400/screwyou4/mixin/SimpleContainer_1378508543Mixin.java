package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.SimpleContainer.class)
public class SimpleContainer_1378508543Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_243048071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243048071L))
            info.setReturnValue("_)s7%7<Z\u9642>\u9F89%u}HW\u178AQW8\u6234$3{V<V[.)h\u6558YL,m5n\uA2EFS%OVX\uCE533D5]L\u4A54)Q>hq\uAD4ASik7_PPc?h$MC[J5jvsBw5c(\uB3E5;a@");
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1416787125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416787125L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getItem(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1522540535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522540535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeAllItems()Ljava/util/List;", cancellable = true)
    private void removeAllItems__1290121938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290121938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItem(II)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItem__306857982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306857982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void addItem_1331965661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331965661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeItemType(Lnet/minecraft/world/item/Item;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemType_444681442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444681442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItems()Lnet/minecraft/core/NonNullList;", cancellable = true)
    private void getItems_208346422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(208346422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1975853264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975853264L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canAddItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canAddItem__1181923622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1181923622L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setItem(ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_33755087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(33755087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeItemNoUpdate(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void removeItemNoUpdate__1522540535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522540535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize_1416770788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416770788L))
            info.setReturnValue(-1123282086);
    }

    @Inject(at = @At("HEAD"), method = "fillStackedContents(Lnet/minecraft/world/entity/player/StackedItemContents;)V", cancellable = true)
    private void fillStackedContents__1607326937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607326937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1416783281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1416783281L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeAsItemList(Lnet/minecraft/world/level/storage/ValueOutput$TypedOutputList;)V", cancellable = true)
    private void storeAsItemList_279672257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(279672257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromItemList(Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;)V", cancellable = true)
    private void fromItemList_167813839(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(167813839L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setChanged()V", cancellable = true)
    private void setChanged_1416783281(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1416783281L))
            info.cancel();
    }


}
