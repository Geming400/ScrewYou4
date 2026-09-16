package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.SmithingTemplateItem.class)
public class SmithingTemplateItem995913336Mixin {
        @Inject(at = @At("HEAD"), method = "createNetheriteUpgradeTemplate(Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/SmithingTemplateItem;", cancellable = true)
    private static void createNetheriteUpgradeTemplate_1834696291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834696291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void appendHoverText__516314504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-516314504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createArmorTrimTemplate(Lnet/minecraft/world/item/Item$Properties;)Lnet/minecraft/world/item/SmithingTemplateItem;", cancellable = true)
    private static void createArmorTrimTemplate_1533742836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533742836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdditionSlotDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getAdditionSlotDescription__2095213481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2095213481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseSlotEmptyIcons()Ljava/util/List;", cancellable = true)
    private void getBaseSlotEmptyIcons_704993594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704993594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseSlotDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getBaseSlotDescription__2060772574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060772574L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdditionalSlotEmptyIcons()Ljava/util/List;", cancellable = true)
    private void getAdditionalSlotEmptyIcons__372644720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372644720L))
            info.setReturnValue(null);
    }


}
