package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.Event.Packed.class)
public class Packed1951792516Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1043166248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1043166248L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1572751255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572751255L))
            info.setReturnValue("nih?2V5%3<VqtmJ\"\u53BC0P\u6FFE;\u9505_;VU\uA582TH&D+#,H'= `3\u463Ak&<\uB6E1IQ\u1261J;|/^+mhMyLk=+\u7EDDF=!Mxl\u1D37QO\u913Ep\u9C59Kt<9>84-\u213A\u74ACiNUuR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1785822689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1785822689L))
            info.setReturnValue(-1234404273);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__2002013208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002013208L))
            info.setReturnValue("06\u18DBd\u6EE5+*Yt[E3<&p\u4CE3\u190E\uB6C7ou+[\uC5FF5L=Db\u8DCA8_eWw3ux Z");
    }

    @Inject(at = @At("HEAD"), method = "callback()Lnet/minecraft/world/level/timers/TimerCallback;", cancellable = true)
    private void callback_871891698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(871891698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerTime()J", cancellable = true)
    private void triggerTime_1588852134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588852134L))
            info.setReturnValue(2410654397690192422L);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1991525967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991525967L))
            info.setReturnValue(null);
    }


}
