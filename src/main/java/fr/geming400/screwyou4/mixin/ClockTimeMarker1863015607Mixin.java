package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ClockTimeMarker.class)
public class ClockTimeMarker1863015607Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_954389339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954389339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1661528164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661528164L))
            info.setReturnValue("mAQ93z0_l\u1F54w'aGEcH,ye+A]nT:cXg\uD5B2\u5273h!W4)N7A\u493AT.Hf48");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1874599598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874599598L))
            info.setReturnValue(1500424916);
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock_983529189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983529189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "occursAt(J)Z", cancellable = true)
    private void occursAt__1519092862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519092862L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "resolveTimeToMoveTo(J)J", cancellable = true)
    private void resolveTimeToMoveTo_2099627224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099627224L))
            info.setReturnValue(3070160466945146528L);
    }

    @Inject(at = @At("HEAD"), method = "getRepetitionCount(J)J", cancellable = true)
    private void getRepetitionCount__1298995904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298995904L))
            info.setReturnValue(6189735881522048660L);
    }

    @Inject(at = @At("HEAD"), method = "periodTicks()Ljava/util/Optional;", cancellable = true)
    private void periodTicks_2048634010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048634010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showInCommands()Z", cancellable = true)
    private void showInCommands__1689843964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689843964L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks__13080089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13080089L))
            info.setReturnValue(223410535);
    }


}
