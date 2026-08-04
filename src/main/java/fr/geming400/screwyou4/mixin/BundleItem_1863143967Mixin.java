package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BundleItem.class)
public class BundleItem_1863143967Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__2021447295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021447295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFullnessDisplay(Lnet/minecraft/world/item/ItemStack;)F", cancellable = true)
    private static void getFullnessDisplay__697307170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697307170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation__1871991796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871991796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void getSelectedItem_551071259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551071259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItemIndex(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getSelectedItemIndex__697304287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697304287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleSelectedItem(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private static void toggleSelectedItem__173560643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-173560643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNumberOfItemsToShow(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getNumberOfItemsToShow__697304287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697304287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarColor(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarColor__697304535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697304535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBarVisible(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isBarVisible__697288198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697288198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarWidth(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarWidth__697304535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697304535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipImage(Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private void getTooltipImage__91050617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-91050617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick_1173958340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1173958340L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideStackedOnOther(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void overrideStackedOnOther_971560667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971560667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideOtherStackedOnMe(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/SlotAccess;)Z", cancellable = true)
    private void overrideOtherStackedOnMe_1721077582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721077582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration_965963311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965963311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed_1424175081(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1424175081L))
            info.cancel();
    }


}
