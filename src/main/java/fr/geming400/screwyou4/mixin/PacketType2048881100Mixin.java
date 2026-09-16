package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.PacketType.class)
public class PacketType2048881100Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1140254832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140254832L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1475663167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475663167L))
            info.setReturnValue("jlBq[\"DCx`IB\u211F\u93CFq\u65F8@pO\uD09F>]>\u9696[Wm3!KN:G+HpA3DUNFFH\u716Bb5Xacx;\uD7942");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1688734105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688734105L))
            info.setReturnValue(-691941594);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__543896786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543896786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flow()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void flow__1575330646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1575330646L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }


}
