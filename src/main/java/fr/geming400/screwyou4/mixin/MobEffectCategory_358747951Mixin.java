package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.effect.MobEffectCategory.class)
public class MobEffectCategory_358747951Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/effect/MobEffectCategory;", cancellable = true)
    private static void values__296853461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-296853461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/effect/MobEffectCategory;", cancellable = true)
    private static void valueOf__1745261592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745261592L))
            info.setReturnValue(net.minecraft.world.effect.MobEffectCategory.BENEFICIAL);
    }

    @Inject(at = @At("HEAD"), method = "getTooltipFormatting()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getTooltipFormatting__1339676437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1339676437L))
            info.setReturnValue(net.minecraft.ChatFormatting.AQUA);
    }


}
