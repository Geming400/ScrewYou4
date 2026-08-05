package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket.AttributeSnapshot.class)
public class AttributeSnapshot_1326050943Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()Ljava/util/Collection;", cancellable = true)
    private void modifiers__487597330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487597330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "base()D", cancellable = true)
    private void base_1364308383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364308383L))
            info.setReturnValue(2.4268130042988965E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1583404095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583404095L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_190590967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190590967L))
            info.setReturnValue("1Qz잡躬瓶n\"z3qZL!U Is{\"k`)R ?R82{ar{籷Cﴪ0=HyhbL.盕d`䑥6膓?vK\"몙荙.D./1tDY4%Rد٢'Er1me䧷2}䑶.S8U|7)젓k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364313684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364313684L))
            info.setReturnValue(895567577);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute__1420040582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420040582L))
            info.setReturnValue(null);
    }


}
