package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.Timeline.class)
public class Timeline_1693331375Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private static void builder_2116381124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116381124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock__1052760150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052760150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attributes()Ljava/util/Set;", cancellable = true)
    private void attributes__135704112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135704112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalTicks(Lnet/minecraft/world/clock/ClockManager;)J", cancellable = true)
    private void getTotalTicks__611369677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611369677L))
            info.setReturnValue(8605184002871680284L);
    }

    @Inject(at = @At("HEAD"), method = "periodTicks()Ljava/util/Optional;", cancellable = true)
    private void periodTicks_1938792796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938792796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTrackSampler(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/clock/ClockManager;)Lnet/minecraft/world/timeline/AttributeTrackSampler;", cancellable = true)
    private void createTrackSampler__161506144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161506144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateRegistry(Lnet/minecraft/core/Registry;Ljava/util/Map;)V", cancellable = true)
    private static void validateRegistry_576713462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(576713462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerTimeMarkers(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void registerTimeMarkers__44819516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-44819516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentTicks(Lnet/minecraft/world/clock/ClockManager;)J", cancellable = true)
    private void getCurrentTicks__611369677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611369677L))
            info.setReturnValue(8605184002871680284L);
    }

    @Inject(at = @At("HEAD"), method = "getPeriodCount(Lnet/minecraft/world/clock/ClockManager;)I", cancellable = true)
    private void getPeriodCount__611370638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611370638L))
            info.setReturnValue(-1609766473);
    }


}
