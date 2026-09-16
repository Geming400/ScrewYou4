package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.ActionButton.class)
public class ActionButton1664311364Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_755685096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755685096L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1860232407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860232407L))
            info.setReturnValue("p\uAD00r-wj^i1%3LbTbC2>l%B9Ii,Fc`)\u28F7\u16B1?{EYv[j6K\u7808\u52FAVu?O6Z\u0584Zo\u12DDKs0? B\u4201R");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2073303841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073303841L))
            info.setReturnValue(-1565534204);
    }

    @Inject(at = @At("HEAD"), method = "action()Ljava/util/Optional;", cancellable = true)
    private void action__400912856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400912856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button()Lnet/minecraft/server/dialog/CommonButtonData;", cancellable = true)
    private void button__934684658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934684658L))
            info.setReturnValue(null);
    }


}
