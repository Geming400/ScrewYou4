package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.BossEvent.BossBarColor.class)
public class BossBarColor_1240814566Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_105354094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105354094L))
            info.setReturnValue("륌$p@x=6>]콋l㉹*");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/BossEvent$BossBarColor;", cancellable = true)
    private static void values_1668776703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668776703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/BossEvent$BossBarColor;", cancellable = true)
    private static void valueOf__620996100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620996100L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarColor.WHITE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_105354094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(105354094L))
            info.setReturnValue("륌$p@x=6>]콋l㉹*");
    }

    @Inject(at = @At("HEAD"), method = "getFormatting()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getFormatting__457609822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457609822L))
            info.setReturnValue(net.minecraft.ChatFormatting.RED);
    }


}
