package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.LecternBlockEntity.class)
public class LecternBlockEntity_1041485233Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__2073069894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073069894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBook()Z", cancellable = true)
    private void hasBook_1927146660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927146660L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBook(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void setBook__745186696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-745186696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBook(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setBook__545607555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-545607555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBook()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBook__2104155597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104155597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPage()I", cancellable = true)
    private void getPage_1862726577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862726577L))
            info.setReturnValue(-1613600666);
    }

    @Inject(at = @At("HEAD"), method = "getRedstoneSignal()I", cancellable = true)
    private void getRedstoneSignal_1156276132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156276132L))
            info.setReturnValue(1835958984);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu_1623849391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623849391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_441339530(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(441339530L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_276333175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(276333175L))
            info.cancel();
    }


}
