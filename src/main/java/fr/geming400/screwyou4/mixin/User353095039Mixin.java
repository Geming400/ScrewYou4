package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.User.class)
public class User353095039Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__782365432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782365432L))
            info.setReturnValue("=M1N;\uA4FB6WhQ(\u79ECR'm *-v1-+*K\u899BFKQ/G\uB88CbL;\uC44B5}3gu}B$^VhH(=Z&");
    }

    @Inject(at = @At("HEAD"), method = "getSessionId()Ljava/lang/String;", cancellable = true)
    private void getSessionId__782365432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782365432L))
            info.setReturnValue("=M1N;\uA4FB6WhQ(\u79ECR'm *-v1-+*K\u899BFKQ/G\uB88CbL;\uC44B5}3gu}B$^VhH(=Z&");
    }

    @Inject(at = @At("HEAD"), method = "getAccessToken()Ljava/lang/String;", cancellable = true)
    private void getAccessToken__782365432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782365432L))
            info.setReturnValue("=M1N;\uA4FB6WhQ(\u79ECR'm *-v1-+*K\u899BFKQ/G\uB88CbL;\uC44B5}3gu}B$^VhH(=Z&");
    }

    @Inject(at = @At("HEAD"), method = "getProfileId()Ljava/util/UUID;", cancellable = true)
    private void getProfileId_764229522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(764229522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClientId()Ljava/util/Optional;", cancellable = true)
    private void getClientId_598556461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598556461L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getXuid()Ljava/util/Optional;", cancellable = true)
    private void getXuid_598556461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598556461L))
            info.setReturnValue(null);
    }


}
