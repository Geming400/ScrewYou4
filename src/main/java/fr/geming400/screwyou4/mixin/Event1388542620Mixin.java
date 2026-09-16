package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.Event.class)
public class Event1388542620Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_479916352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(479916352L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2136001151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136001151L))
            info.setReturnValue("+ifWv\u09ABz@Y2XDK?eI\u1E70Ma(_l8dp\uCB20\uFACB..^UaX-9sPq1vw04;p>}}c5%Is>[\u9658\u3E92=G=ZK\u81E7DSXg\u5AF2<CvVE.I.-)$ys\u0745s(=$bXOxd4sECm\u0441");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1945894711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1945894711L))
            info.setReturnValue(1360014052);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_1729704192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729704192L))
            info.setReturnValue("rK\u4DAC*B\uC083f%,I%h\u1B9DyB=&y}+\u6246T\u1248\"&3vhcm_0g\u596Fqli$]u@$`YMDSka\u5AD3\u0403to?M\uCDF9;%GT{\"^p?fgM;\u32DB^");
    }

    @Inject(at = @At("HEAD"), method = "callback()Lnet/minecraft/world/level/timers/TimerCallback;", cancellable = true)
    private void callback_308641802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308641802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerTime()J", cancellable = true)
    private void triggerTime_1025602238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025602238L))
            info.setReturnValue(9070213095322190528L);
    }

    @Inject(at = @At("HEAD"), method = "sequentialId()Lcom/google/common/primitives/UnsignedLong;", cancellable = true)
    private void sequentialId__1355333010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355333010L))
            info.setReturnValue(null);
    }


}
