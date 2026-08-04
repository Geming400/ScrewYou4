package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.BundleContents.class)
public class BundleContents687657946Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_725920192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725920192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2073169709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073169709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__447802525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447802525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_725920192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725920192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_725936529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725936529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "items()Ljava/util/List;", cancellable = true)
    private void items__1980972534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1980972534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "weight()Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void weight__1056847927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056847927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getSelectedItem__1853422044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1853422044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItemIndex()I", cancellable = true)
    private void getSelectedItemIndex_725920192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725920192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberOfItemsToShow()I", cancellable = true)
    private void getNumberOfItemsToShow_725920192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725920192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canItemBeInBundle(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void canItemBeInBundle__1872773970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872773970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopyStream()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopyStream_476951631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476951631L))
            info.setReturnValue(null);
    }


}
