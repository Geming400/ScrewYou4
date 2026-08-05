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
            info.setReturnValue(4.546307004298897E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1583404095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583404095L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_190590967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190590967L))
            info.setReturnValue("1Qz\uC7A1\u8EAC\u74F6n\"z3qZL!U Is{\"k`)R ?R82{ar{\u7C77C\uFD2A0=HyhbL.\u76D5d`\u44656\u8193?vK\"\uBA99\u8359.D./1tDY4%R\u062F\u0662'Er1me\u49F72}\u4476.S8U|7)\uC813k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364313684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364313684L))
            info.setReturnValue(1107516977);
    }

    @Inject(at = @At("HEAD"), method = "attribute()Lnet/minecraft/core/Holder;", cancellable = true)
    private void attribute__1420040582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420040582L))
            info.setReturnValue(null);
    }


}
