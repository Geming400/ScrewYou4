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
            info.setReturnValue("4]\u942Dr7XCJ2Z\u7BEAU*\"x&RX0\uB361A3P\uCBDFn?A\uFC375&G\uD559auj0\u3368p8\u8EBEc8IoI)\u04A9DT\u82F2#H:D@Ok\u44BDZ6X>\u92A7\u9684|8Zl<B\u9255u\uCF58RZ5V:\u6B18>t=uq\uBF81F7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1650105430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650105430L))
            info.setReturnValue(-491290173);
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
