package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.body.PlainMessage.class)
public class PlainMessage_1449202691Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_540576422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(540576422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2075341081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075341081L))
            info.setReturnValue("\"h\u994F1S+[OQM@I)\uD2B5]%*pS\uC41C\u76FBtS@v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2006554781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006554781L))
            info.setReturnValue(-827799090);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__190945310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190945310L))
            info.setReturnValue(-733588873);
    }

    @Inject(at = @At("HEAD"), method = "contents()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void contents_320007983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(320007983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void mapCodec_705207620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705207620L))
            info.setReturnValue(null);
    }


}
