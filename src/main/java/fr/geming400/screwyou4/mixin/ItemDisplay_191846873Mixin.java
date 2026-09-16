package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.ItemDisplay.class)
public class ItemDisplay_191846873Mixin {
        @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__1313388020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313388020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_898581220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(898581220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItemTransform(Lnet/minecraft/world/item/ItemDisplayContext;)V", cancellable = true)
    private void setItemTransform__395203746(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-395203746L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItemStack_416295275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416295275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setItemStack(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItemStack__383343347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-383343347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemTransform()Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void getItemTransform__808727490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808727490L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.HEAD);
    }

    @Inject(at = @At("HEAD"), method = "itemRenderState()Lnet/minecraft/world/entity/Display$ItemDisplay$ItemRenderState;", cancellable = true)
    private void itemRenderState_342592888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(342592888L))
            info.setReturnValue(null);
    }


}
