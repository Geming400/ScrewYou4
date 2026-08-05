package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.CriterionProgress.class)
public class CriterionProgress_1196658208Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_61197736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61197736L))
            info.setReturnValue("i^DN\uB0EC`\u4754SG+F;ZDa\"fNAM_dUO_t\"J_Vp\u8B65\u334EavGa- dRHzRzh,hn2xR)+oj{=a(dk%J_e.AHA0\u30E5\u9E7F\u3682X}xh5Im{\u4B92:\u0F8E&O4\uFD89Q");
    }

    @Inject(at = @At("HEAD"), method = "isDone()Z", cancellable = true)
    private void isDone_1234936790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234936790L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "grant()V", cancellable = true)
    private void grant_1234932946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234932946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_843165086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(843165086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObtained()Ljava/time/Instant;", cancellable = true)
    private void getObtained__2001074889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001074889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/advancements/CriterionProgress;", cancellable = true)
    private static void fromNetwork__366044653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366044653L))
            info.setReturnValue(new net.minecraft.advancements.CriterionProgress());
    }

    @Inject(at = @At("HEAD"), method = "revoke()V", cancellable = true)
    private void revoke_1234932946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234932946L))
            info.cancel();
    }


}
