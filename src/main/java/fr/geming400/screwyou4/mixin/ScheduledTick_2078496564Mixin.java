package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.ScheduledTick.class)
public class ScheduledTick_2078496564Mixin {
        @Inject(at = @At("HEAD"), method = "priority()Lnet/minecraft/world/ticks/TickPriority;", cancellable = true)
    private void priority__958794922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958794922L))
            info.setReturnValue(net.minecraft.world.ticks.TickPriority.VERY_LOW);
    }

    @Inject(at = @At("HEAD"), method = "type()Ljava/lang/Object;", cancellable = true)
    private void type__357278514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357278514L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__830958474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830958474L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_943036588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943036588L))
            info.setReturnValue("al\uA491-Yo$Z{o/Xd\u1181el\u2862d$ETAFedw9H&{HOQT&V yzc 3C#sKm\u21BCf,3C+EQ)9AQgPy%0Yo\uA8C4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2116759305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116759305L))
            info.setReturnValue(-1875073600);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos_185109684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185109684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "probe(Ljava/lang/Object;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private static void probe__1660112665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1660112665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSavedTick(J)Lnet/minecraft/world/ticks/SavedTick;", cancellable = true)
    private void toSavedTick__271327081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271327081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerTick()J", cancellable = true)
    private void triggerTick_2116759770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116759770L))
            info.setReturnValue(-4118362975381891400L);
    }

    @Inject(at = @At("HEAD"), method = "subTickOrder()J", cancellable = true)
    private void subTickOrder_2116759770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116759770L))
            info.setReturnValue(-4118362975381891400L);
    }


}
