package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.ClickEvent.Custom.class)
public class Custom_1097580691Mixin {
        @Inject(at = @At("HEAD"), method = "payload()Ljava/util/Optional;", cancellable = true)
    private void payload_111200718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111200718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_188954422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188954422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1868004215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868004215L))
            info.setReturnValue("|[L@!4\uFECB0ppG':#!Ksr}=CPo CVIT(.cN\uBB13V7SjN\u2BFC7WSEr\u7C32\u58AE\u0146w[}wNnL^@]&1VLp.':*\u24C8(S:NHy6=8x`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1654932781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654932781L))
            info.setReturnValue(-289042023);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1495197196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495197196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/ClickEvent$Action;", cancellable = true)
    private void action_1183709872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183709872L))
            info.setReturnValue(net.minecraft.network.chat.ClickEvent.Action.RUN_COMMAND);
    }


}
