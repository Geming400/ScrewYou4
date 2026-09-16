package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.Timeline.Builder.class)
public class Builder_829977232Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/timeline/Timeline;", cancellable = true)
    private void build__1033804249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033804249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimeMarker(Lnet/minecraft/resources/ResourceKey;I)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addTimeMarker__231107093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-231107093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimeMarker(Lnet/minecraft/resources/ResourceKey;IZ)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addTimeMarker_83275387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83275387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPeriodTicks(I)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void setPeriodTicks__607615286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607615286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addModifierTrack(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/modifier/AttributeModifier;Ljava/util/function/Consumer;)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addModifierTrack_365149609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365149609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTrack(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/util/function/Consumer;)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addTrack__419503216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419503216L))
            info.setReturnValue(null);
    }


}
