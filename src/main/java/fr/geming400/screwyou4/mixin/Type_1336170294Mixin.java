package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.class)
public class Type_1336170294Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private static void values__885394142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-885394142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private static void valueOf_551707689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551707689L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1424378915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424378915L))
            info.setReturnValue("(eCp\uA6E34s\u61EB.Ltv\uFE0CVA4p<%\uC462F`>9l>M^fJR,pBVBy\uBC24\u1963]O\u53EC\uB71EF\uA088");
    }


}
