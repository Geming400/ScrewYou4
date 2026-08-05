package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.Favicon.class)
public class Favicon1813746303Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1095708734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095708734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_678286328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(678286328L))
            info.setReturnValue("P=37#_D>2J*?>Tzr;\uC25Dm@\uCACDi52$N4@jY .\u0323T\uC323uZ@DFz'Hb\u8F4Cft5\uD10F\u8512( oruQqo\u4F223]E:\u80E0\u772Af\u9EE0/X\u55D0\u7B20r8/j<R\u1B7Bo\u95C3yU$0^-U8Yc,QLy%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1852009045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852009045L))
            info.setReturnValue(1299996269);
    }

    @Inject(at = @At("HEAD"), method = "iconBytes()[B", cancellable = true)
    private void iconBytes__1295386363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1295386363L))
            info.setReturnValue(null);
    }


}
