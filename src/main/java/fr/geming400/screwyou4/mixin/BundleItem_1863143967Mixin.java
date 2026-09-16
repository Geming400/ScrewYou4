package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.BundleItem.class)
public class BundleItem_1863143967Mixin {
        @Inject(at = @At("HEAD"), method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void use__946956390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946956390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onUseTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void onUseTick__1958756567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1958756567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItem(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void getSelectedItem_463745759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463745759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUseDuration(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void getUseDuration__639945228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639945228L))
            info.setReturnValue(-507542584);
    }

    @Inject(at = @At("HEAD"), method = "getFullnessDisplay(Lnet/minecraft/world/item/ItemStack;)F", cancellable = true)
    private static void getFullnessDisplay__867942312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867942312L))
            info.setReturnValue(2.492687E8F);
    }

    @Inject(at = @At("HEAD"), method = "onDestroyed(Lnet/minecraft/world/entity/item/ItemEntity;)V", cancellable = true)
    private void onDestroyed_987748399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(987748399L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toggleSelectedItem(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private static void toggleSelectedItem_626862079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(626862079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "overrideStackedOnOther(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void overrideStackedOnOther_1591415185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591415185L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "overrideOtherStackedOnMe(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ClickAction;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/entity/SlotAccess;)Z", cancellable = true)
    private void overrideOtherStackedOnMe__1866043084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866043084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBarVisible(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isBarVisible__1189736847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1189736847L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipImage(Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private void getTooltipImage_278084117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278084117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBarColor(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarColor_187282531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(187282531L))
            info.setReturnValue(416012784);
    }

    @Inject(at = @At("HEAD"), method = "getUseAnimation(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemUseAnimation;", cancellable = true)
    private void getUseAnimation_1125329145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1125329145L))
            info.setReturnValue(net.minecraft.world.item.ItemUseAnimation.EAT);
    }

    @Inject(at = @At("HEAD"), method = "getBarWidth(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void getBarWidth_28049760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28049760L))
            info.setReturnValue(-210605952);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedItemIndex(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getSelectedItemIndex__1684723085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684723085L))
            info.setReturnValue(-1899629006);
    }

    @Inject(at = @At("HEAD"), method = "getNumberOfItemsToShow(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private static void getNumberOfItemsToShow__894558273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894558273L))
            info.setReturnValue(1578498779);
    }


}
