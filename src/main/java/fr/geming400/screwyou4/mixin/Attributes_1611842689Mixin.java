package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.OutgoingRpcMethod.Attributes.class)
public class Attributes_1611842689Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1297612349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297612349L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_476382713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476382713L))
            info.setReturnValue("4]鐭r7XCJ2Z篪U*\"x&RX0덡A3P쯟n?Aﰷ5&G학auj0㍨p8躾c8IoI)ҩDT苲#H:D@Ok䒽Z6X>銧隄|8Zl<B鉕u콘RZ5V:欘>t=uq뾁F7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1650105430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650105430L))
            info.setReturnValue(-171243273);
    }

    @Inject(at = @At("HEAD"), method = "allowPreServerInit()Z", cancellable = true)
    private void allowPreServerInit_1650121271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650121271L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "discoverable()Z", cancellable = true)
    private void discoverable_1650121271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650121271L))
            info.setReturnValue(false);
    }


}
