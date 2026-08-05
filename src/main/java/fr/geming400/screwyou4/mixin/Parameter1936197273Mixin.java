package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatTypeDecoration.Parameter.class)
public class Parameter1936197273Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/ChatTypeDecoration$Parameter;", cancellable = true)
    private static void values_734900021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734900021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration$Parameter;", cancellable = true)
    private static void valueOf__2065697394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065697394L))
            info.setReturnValue(net.minecraft.network.chat.ChatTypeDecoration.Parameter.CONTENT);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void select__107116325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107116325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2024405895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024405895L))
            info.setReturnValue("Y',f\uB718\uA142.i1+s1`xj2t0\uD1E9\u293Ci2pHOa_uQj\"O=3'C\u6CB0T\u7C8Dpb-0\uD6D4Uv\u6A7C|C*_?Dhf?\u5AFBL@\uC95F\u24149#NHP\u4792[c'Ru{gT+-z{=o6IH");
    }


}
