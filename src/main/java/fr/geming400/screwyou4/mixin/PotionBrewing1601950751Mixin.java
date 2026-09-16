package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.PotionBrewing.class)
public class PotionBrewing1601950751Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private static void bootstrap_947047998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947047998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void mix__424225643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424225643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isIngredient(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isIngredient__310626368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310626368L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasMix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void hasMix__1503780482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1503780482L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBrewablePotion(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void isBrewablePotion_1778739070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778739070L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addVanillaMixes(Lnet/minecraft/world/item/alchemy/PotionBrewing$Builder;)V", cancellable = true)
    private static void addVanillaMixes__861008930(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-861008930L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isContainerIngredient(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isContainerIngredient_586057043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(586057043L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPotionIngredient(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isPotionIngredient_889326253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889326253L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasContainerMix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void hasContainerMix_847401963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847401963L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasPotionMix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void hasPotionMix_824614321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824614321L))
            info.setReturnValue(false);
    }


}
