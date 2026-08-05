package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SmithingTemplateItem.class)
public class SmithingTemplateItem995913336Mixin {
        @Inject(at = @At("HEAD"), method = "getAdditionalSlotEmptyIcons()Ljava/util/List;", cancellable = true)
    private void getAdditionalSlotEmptyIcons__1672717144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672717144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseSlotEmptyIcons()Ljava/util/List;", cancellable = true)
    private void getBaseSlotEmptyIcons__1672717144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672717144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseSlotDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getBaseSlotDescription__1180995829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180995829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdditionSlotDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getAdditionSlotDescription__1180995829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180995829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void appendHoverText_202118311(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202118311L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNetheriteUpgradeTemplate(Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/SmithingTemplateItem;", cancellable = true)
    private static void createNetheriteUpgradeTemplate__1143297389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143297389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createArmorTrimTemplate(Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/SmithingTemplateItem;", cancellable = true)
    private static void createArmorTrimTemplate__1143297389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143297389L))
            info.setReturnValue(null);
    }


}
