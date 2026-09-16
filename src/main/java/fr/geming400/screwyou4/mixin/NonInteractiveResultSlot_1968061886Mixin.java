package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.NonInteractiveResultSlot.class)
public class NonInteractiveResultSlot_1968061886Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void remove_922692292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922692292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHighlightable()Z", cancellable = true)
    private void isHighlightable__778299664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-778299664L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "allowModification(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void allowModification_1398756298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398756298L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert_584925063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(584925063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "safeInsert(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeInsert__91953854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91953854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryRemove(IILnet/minecraft/world/entity/player/Player;)Ljava/util/Optional;", cancellable = true)
    private void tryRemove_1637669007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637669007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mayPlace(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void mayPlace__1228330697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228330697L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mayPickup(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void mayPickup_1424038798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424038798L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onTake(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onTake__114342198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-114342198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "safeTake(IILnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void safeTake_415121946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415121946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onQuickCraft(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void onQuickCraft__1752114168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1752114168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFake()Z", cancellable = true)
    private void isFake__167900363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167900363L))
            info.setReturnValue(true);
    }


}
