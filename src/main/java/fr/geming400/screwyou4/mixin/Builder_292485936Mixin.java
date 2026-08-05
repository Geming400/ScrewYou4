package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagRegistry.Builder.class)
public class Builder_292485936Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/flag/FeatureFlag;", cancellable = true)
    private void create__538857759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-538857759L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/flag/FeatureFlagRegistry;", cancellable = true)
    private void build__772379938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772379938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVanilla(Ljava/lang/String;)Lnet/minecraft/world/flag/FeatureFlag;", cancellable = true)
    private void createVanilla__133492990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-133492990L))
            info.setReturnValue(null);
    }


}
