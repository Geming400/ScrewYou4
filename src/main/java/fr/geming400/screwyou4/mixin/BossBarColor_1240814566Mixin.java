package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.BossEvent.BossBarColor.class)
public class BossBarColor_1240814566Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__648032337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648032337L))
            info.setReturnValue("W@(3'`<\u174B\u644A|\u43D8X88\uCC07\u4B85OZ, 0JbnMuxAu#cKAp<s\u8314?P=mx/lr\uC043TU)V^uR2\uCB88+X!`y$\u1B33>^`Ks\u75D1)4rkhEQ)\u7EDEy{Z1F`\u1461\u1B7AK3WD(\u1C92\u43BE=");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/BossEvent$BossBarColor;", cancellable = true)
    private static void values_312186397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312186397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/BossEvent$BossBarColor;", cancellable = true)
    private static void valueOf__671550684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671550684L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarColor.PURPLE);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1329023187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329023187L))
            info.setReturnValue("G\u9EF5/Y{KU\u6AD67Bt(wyqYRqW|lTm/\uADD7{00pVM0r\u7502O;m/Z=&sI9b\u66F2qB.7t+dx\u30F4Xc;{\u582C0W(1\"$vq#\uA173\u391C*BT");
    }

    @Inject(at = @At("HEAD"), method = "getFormatting()Lnet/minecraft/ChatFormatting;", cancellable = true)
    private void getFormatting__644479427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644479427L))
            info.setReturnValue(net.minecraft.ChatFormatting.OBFUSCATED);
    }


}
