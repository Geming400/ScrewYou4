package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.timeline.Timeline.Builder.class)
public class Builder_829977232Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/timeline/Timeline;", cancellable = true)
    private void build_2143790421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2143790421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTrack(Lnet/minecraft/world/attribute/EnvironmentAttribute;Ljava/util/function/Consumer;)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addTrack__2004130970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004130970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimeMarker(Lnet/minecraft/resources/ResourceKey;IZ)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addTimeMarker_1844853651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1844853651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTimeMarker(Lnet/minecraft/resources/ResourceKey;I)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addTimeMarker__1559755309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559755309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addModifierTrack(Lnet/minecraft/world/attribute/EnvironmentAttribute;Lnet/minecraft/world/attribute/modifier/AttributeModifier;Ljava/util/function/Consumer;)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void addModifierTrack_1942883158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942883158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPeriodTicks(I)Lnet/minecraft/world/timeline/Timeline$Builder;", cancellable = true)
    private void setPeriodTicks__1463901481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1463901481L))
            info.setReturnValue(null);
    }


}
