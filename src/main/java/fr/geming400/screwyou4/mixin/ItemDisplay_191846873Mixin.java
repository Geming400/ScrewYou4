package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.ItemDisplay.class)
public class ItemDisplay_191846873Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__1702046312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702046312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1837596316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1837596316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "itemRenderState()Lnet/minecraft/world/entity/Display$ItemDisplay$ItemRenderState;", cancellable = true)
    private void itemRenderState_204479984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204479984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItemStack_715266028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(715266028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemTransform()Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void getItemTransform_51507137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(51507137L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.GUI);
    }

    @Inject(at = @At("HEAD"), method = "setItemStack(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItemStack_1926378656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926378656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItemTransform(Lnet/minecraft/world/item/ItemDisplayContext;)V", cancellable = true)
    private void setItemTransform_599103175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(599103175L))
            info.cancel();
    }


}
