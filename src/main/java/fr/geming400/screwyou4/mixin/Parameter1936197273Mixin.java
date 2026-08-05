package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ChatTypeDecoration.Parameter.class)
public class Parameter1936197273Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/network/chat/ChatTypeDecoration$Parameter;", cancellable = true)
    private static void values_847069587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847069587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/network/chat/ChatTypeDecoration$Parameter;", cancellable = true)
    private static void valueOf__1338741322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338741322L))
            info.setReturnValue(net.minecraft.network.chat.ChatTypeDecoration.Parameter.SENDER);
    }

    @Inject(at = @At("HEAD"), method = "select(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/ChatType$Bound;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void select__375444649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375444649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_800736802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800736802L))
            info.setReturnValue("NQ1'G:aD\uADF9zBvZT+?J6Sl'/H\u225D.C\u6C04R+z9o_,sY^_$_ Ook57MLvSZY`\u4405v\u604CCR/6\u1353\u8C06Rl'\u363E\u1C33\uFDB6'\uA67DyGr-g\"Oi*QL@SOX6\u7F2AGY2!TUL1v");
    }


}
