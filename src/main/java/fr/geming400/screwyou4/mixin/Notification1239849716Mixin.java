package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PeriodicNotificationManager.Notification.class)
public class Notification1239849716Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_331223448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(331223448L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2010273241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010273241L))
            info.setReturnValue("T8\u67039qjix2i5S\uB19B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1797201807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797201807L))
            info.setReturnValue(1573103066);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/lang/String;", cancellable = true)
    private void message__197194940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-197194940L))
            info.setReturnValue("yH`3NtpF<^vG`Fa\u7F78k3v\u3CDDq-|)\u32F7e4K>!0i89TG\uCB35`:}yA\u0157yA\uD35Fl\u01A5+i`]\u802EZE3\u9BB0p^`{f\u46F1TY-cF[o2CE[\u1874&c-\u4B30:#");
    }

    @Inject(at = @At("HEAD"), method = "delay()J", cancellable = true)
    private void delay__460049160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460049160L))
            info.setReturnValue(-7423117464407333386L);
    }

    @Inject(at = @At("HEAD"), method = "period()J", cancellable = true)
    private void period_226717562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226717562L))
            info.setReturnValue(-8099566854620324088L);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/lang/String;", cancellable = true)
    private void title_1026829013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026829013L))
            info.setReturnValue("-sX$^i;h D2n\"Kdvcf<\u1D1B}|\"oNJ4v(bR>\u0C9CI_q5/\u69520U:T \u8257O9,=vwT$Z");
    }


}
