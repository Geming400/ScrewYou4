package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.NonInteractiveResultSlot.class)
public class NonInteractiveResultSlot_1968061886Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove__932987192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932987192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__592370279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592370279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFake()Z", cancellable = true)
    private void isFake_2006340468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006340468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPickup(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void mayPickup__1386299921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386299921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert__1421925779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421925779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert_1921519004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921519004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeTake(IILnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeTake_1485236838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485236838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRemove(IILnet/minecraft/world/entity/player/Player;)Ljava/util/Optional;", cancellable = true)
    private void tryRemove__1037481488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037481488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__1112596592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1112596592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHighlightable()Z", cancellable = true)
    private void isHighlightable_2006340468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006340468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onQuickCraft(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onQuickCraft__1081312710(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1081312710L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "allowModification(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void allowModification__1386299921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386299921L))
            info.setReturnValue(null);
    }


}
