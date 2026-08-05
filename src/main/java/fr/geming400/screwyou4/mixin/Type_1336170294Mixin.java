package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.class)
public class Type_1336170294Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private static void values__726409724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726409724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private static void valueOf_2074942209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074942209L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_200709822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(200709822L))
            info.setReturnValue("\uBB963\u2821dVWu\uA812nKag1\u8A06C\uB3DD\u3DFDeg}OE\u4D58]n$iQ8K?u\u572Du\u8628>s:\u100DWlz&\u3014w)@L7\u924DV7Y/BCL?\u63D8\uD39AX027B(^s+");
    }


}
