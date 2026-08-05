package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.LecternBlockEntity.class)
public class LecternBlockEntity_1041485233Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1135423933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135423933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMenu(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/inventory/AbstractContainerMenu;", cancellable = true)
    private void createMenu__943886134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943886134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBook()Z", cancellable = true)
    private void hasBook_1079763815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079763815L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPage()I", cancellable = true)
    private void getPage_1079747478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079747478L))
            info.setReturnValue(-1190985436);
    }

    @Inject(at = @At("HEAD"), method = "getBook()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBook_1564903892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564903892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBook(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setBook__1518950776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1518950776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBook(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void setBook__1441951037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1441951037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__1477224346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1477224346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearContent()V", cancellable = true)
    private void clearContent_1079759971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1079759971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRedstoneSignal()I", cancellable = true)
    private void getRedstoneSignal_1079747478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1079747478L))
            info.setReturnValue(-1190985436);
    }


}
