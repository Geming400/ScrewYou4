package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ClockTimeMarker.class)
public class ClockTimeMarker1863015607Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1046439430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046439430L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_727555632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727555632L))
            info.setReturnValue("d2VD-qI%J]H?1|NB污b\"cdF3omx5bK'浮jL)>t%q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1901278349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901278349L))
            info.setReturnValue(-1321621238);
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock__883075917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883075917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "occursAt(J)Z", cancellable = true)
    private void occursAt__1217107352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217107352L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "ticks()I", cancellable = true)
    private void ticks_1901277853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901277853L))
            info.setReturnValue(-1118473819);
    }

    @Inject(at = @At("HEAD"), method = "periodTicks()Ljava/util/Optional;", cancellable = true)
    private void periodTicks_2108477029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108477029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showInCommands()Z", cancellable = true)
    private void showInCommands_1901294190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901294190L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRepetitionCount(J)J", cancellable = true)
    private void getRepetitionCount__1217122728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217122728L))
            info.setReturnValue(-5188779232035534350L);
    }

    @Inject(at = @At("HEAD"), method = "resolveTimeToMoveTo(J)J", cancellable = true)
    private void resolveTimeToMoveTo__1217122728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1217122728L))
            info.setReturnValue(-5188779232035534350L);
    }


}
