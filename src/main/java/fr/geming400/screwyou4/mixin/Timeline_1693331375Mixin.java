package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.Timeline.class)
public class Timeline_1693331375Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private static void builder__1549527521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549527521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock_813844956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813844956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Ljava/util/Set;", cancellable = true)
    private void attributes_488694553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(488694553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTrackSampler(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/clock/ClockManager;)Lnet/minecraft/world/timeline/AttributeTrackSampler;", cancellable = true)
    private void createTrackSampler_1113009529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113009529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerTimeMarkers(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void registerTimeMarkers_1465309325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1465309325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentTicks(Lnet/minecraft/world/clock/ClockManager;)J", cancellable = true)
    private void getCurrentTicks_186294560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186294560L))
            info.setReturnValue(8509233629556492386L);
    }

    @Inject(at = @At("HEAD"), method = "validateRegistry(Lnet/minecraft/core/Registry;Ljava/util/Map;)V", cancellable = true)
    private static void validateRegistry_294534115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(294534115L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "periodTicks()Ljava/util/Optional;", cancellable = true)
    private void periodTicks_1878949777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878949777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalTicks(Lnet/minecraft/world/clock/ClockManager;)J", cancellable = true)
    private void getTotalTicks__1943674709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943674709L))
            info.setReturnValue(-6123261392109299795L);
    }

    @Inject(at = @At("HEAD"), method = "getPeriodCount(Lnet/minecraft/world/clock/ClockManager;)I", cancellable = true)
    private void getPeriodCount__1350898214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350898214L))
            info.setReturnValue(992320677);
    }


}
