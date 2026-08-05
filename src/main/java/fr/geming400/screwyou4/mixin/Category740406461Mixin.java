package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.KeyMapping.Category.class)
public class Category740406461Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2125918720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125918720L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__395053514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395053514L))
            info.setReturnValue("P1 xzR^y7佼qra3o儿s=6U4g{[]};j%XiKp*bF*;7LBHo.!qr-3'h7iSGYFH㹅=t 2P4W:n8;0=?:⬗6潿㹤,gKGc/紿");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_778669203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778669203L))
            info.setReturnValue(-543169906);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/KeyMapping$Category;", cancellable = true)
    private static void register_280181208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280181208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1702660092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702660092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__1436502704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436502704L))
            info.setReturnValue(null);
    }


}
