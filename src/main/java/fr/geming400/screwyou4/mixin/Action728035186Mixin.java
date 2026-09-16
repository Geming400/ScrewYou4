package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatRestriction.Action.class)
public class Action728035186Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__180591082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180591082L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1498458711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498458711L))
            info.setReturnValue("z>va:2Hy\uB3D1'(DxOm.>xxa5A+ZTnk^N(J\u295D)`+w#\u1D1FM8\u6713&<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1285387277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285387277L))
            info.setReturnValue(-1760162387);
    }

    @Inject(at = @At("HEAD"), method = "runnable()Ljava/util/function/BiConsumer;", cancellable = true)
    private void runnable_1128416837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128416837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__1234459555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234459555L))
            info.setReturnValue(null);
    }


}
