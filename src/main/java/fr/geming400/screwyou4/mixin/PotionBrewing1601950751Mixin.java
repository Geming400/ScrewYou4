package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.alchemy.PotionBrewing.class)
public class PotionBrewing1601950751Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/item/alchemy/PotionBrewing;", cancellable = true)
    private static void bootstrap__1118327316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118327316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void mix__746146247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746146247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPotionIngredient(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isPotionIngredient__958481413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958481413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasContainerMix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void hasContainerMix__1447420000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447420000L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addVanillaMixes(Lnet/minecraft/world/item/alchemy/PotionBrewing$Builder;)V", cancellable = true)
    private static void addVanillaMixes_1049025134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1049025134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPotionMix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void hasPotionMix__1447420000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447420000L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBrewablePotion(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void isBrewablePotion__1146537563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146537563L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isContainerIngredient(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isContainerIngredient__958481413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958481413L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasMix(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void hasMix__1447420000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1447420000L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isIngredient(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isIngredient__958481413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958481413L))
            info.setReturnValue(false);
    }


}
